package com.chuxin.service;
import java.util.List;

import com.chuxin.entity.PageResult;
import com.chuxin.entity.ResultBean;
import com.chuxin.pojo.Users;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface UsersService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Users> findAll();
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);


	/**
	 * 通过手机号查询用户是否注册
	 * @param phone
	 * @return
	 */
	public Users findOne(String phone);

	//用户登录的方法
	Users loginUser(Users user);

	//检查用户是否登录的方法
	ResultBean checkIsLogin(String uuid);

	/**
	 * 增加
	*/
	public void add(Users users);
	
	
	/**
	 * 修改
	 */
	public void update(Users users);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Users users, int pageNum, int pageSize);

	/*生成验证码
	 */

}
