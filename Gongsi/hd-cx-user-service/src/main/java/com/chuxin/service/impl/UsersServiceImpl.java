package com.chuxin.service.impl;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.chuxin.entity.PageResult;
import com.chuxin.entity.ResultBean;
import com.chuxin.mapper.UsersMapper;
import com.chuxin.pojo.SeaService;
import com.chuxin.pojo.Users;
import com.chuxin.pojo.UsersExample;
import com.chuxin.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import util.RedisConstant;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout = 10000)
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersMapper;

	@Autowired
	private RedisTemplate redisTemplate;

	@Override
	public Users loginUser(Users user) {
		//调用用户登录方法
		Users currentUsers = usersMapper.selectByUsername(user.getPhone());

		//比较密码
		if(currentUsers != null){
			//            if(passwordEncoder.matches(user.getPassword(),currentUsers.getPassword())){
			if(user.getPassword().equals(currentUsers.getPassword())){
				return currentUsers;
			}
		}
		return null;
	}

	/**
	 * 给其他方法调用检查用户是否登录
	 * @param uuid
	 * @return
	 */
	@Override
	public ResultBean checkIsLogin(String uuid) {
		System.out.println("调用 checkIsLogin 服务方法");
		if (uuid == null) {
			return new ResultBean(1, null, "当前用户未登录");
		}

		String rKey = new StringBuilder(RedisConstant.USER_TOKEN_PRE).append(uuid).toString();
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		Users users = (Users) redisTemplate.opsForValue().get(rKey);
		if (users != null) {

			redisTemplate.expire(rKey,30, TimeUnit.MINUTES);
			return new ResultBean(0,users,"用户已登录");
		}

		return new ResultBean(1,null,"用户未登录");
	}

	
	/**
	 * 查询全部
	 */
	@Override
	public List<Users> findAll() {
		return usersMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Users> page=   (Page<Users>) usersMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Users users) {
		usersMapper.insertSelective(users);
	}

	@Override
	public Users findOne(String id){
		return usersMapper.selectByPrimaryKey(id);
	}

	/**
	 * 修改
	 */
	@Override
	public void update(Users users){
		usersMapper.updateByPrimaryKey(users);
	}
	@Override
	public PageResult findPage(Users users, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		UsersExample example=new UsersExample();
		UsersExample.Criteria criteria = example.createCriteria();
		if(users!=null){			
						if(users.getName()!=null && users.getName().length()>0){
				criteria.andNameLike("%"+users.getName()+"%");
			}
			if(users.getAvatarUrl()!=null && users.getAvatarUrl().length()>0){
				criteria.andAvatarUrlLike("%"+users.getAvatarUrl()+"%");
			}
			if(users.getPhone()!=null && users.getPhone().length()>0){
				criteria.andPhoneLike("%"+users.getPhone()+"%");
			}
			if(users.getPassword()!=null && users.getPassword().length()>0){
				criteria.andPasswordLike("%"+users.getPassword()+"%");
			}
		}
		Page<Users> page= (Page<Users>)usersMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	/*//生成验证码
	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private JmsTemplate jmsTemplate;
	@Autowired(required = true)
	private Destination smsDestination;

	@Value("${template_code}")
	private String template_code;
	@Value("sign_name")
	private  String sign_name;
	@Override
	public void createSmsCode(final String phone) {
		//1.生成一个六位的随机数
		final String smscode  = (long)(Math.random()*1000000)+"";
		System.out.println("验证码:"+smscode);
		//2.将验证码放入redis（缓存）中
		redisTemplate.boundHashOps("smscode").put(phone,smscode);
		//3.将短信内容发送给 activeMQ
		String str=new String();

		jmsTemplate.send(smsDestination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				MapMessage mapMessage = session.createMapMessage();
				mapMessage.setString("mobile",phone);//手机号
				mapMessage.setString("template_code",template_code);//验证码
				mapMessage.setString("sign_name","初心");//签名
				Map map=new HashMap();
				System.out.println("验证码");
				map.put("code",smscode);
				mapMessage.setString("param", JSON.toJSONString(map));//验证码
				return mapMessage;
			}
		});
	}

	*//**
	 * @param phone
	 * @param code
	 * @return
	 *//*
	@Override
//验证码验证
	public boolean checkSmsCode(String phone, String code) {
		String systemcode = (String) redisTemplate.boundHashOps("smscode").get(phone);
		if (systemcode==null){
			return false;
		}
		if (!systemcode.equals(code)){
			return false;
		}
		return true;
	}*/

}

