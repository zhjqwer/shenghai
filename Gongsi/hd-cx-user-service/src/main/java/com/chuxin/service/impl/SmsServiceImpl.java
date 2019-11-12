package com.chuxin.service.impl;//package com.chuxin.service.impl;
//
//import com.alibaba.dubbo.config.annotation.Service;
//import com.alibaba.fastjson.JSONObject;
//import com.aliyuncs.CommonRequest;
//import com.aliyuncs.CommonResponse;
//import com.aliyuncs.DefaultAcsClient;
//import com.aliyuncs.IAcsClient;
//import com.aliyuncs.http.MethodType;
//import com.aliyuncs.profile.DefaultProfile;
//import com.chuxin.service.SmsService;
//import org.springframework.beans.factory.annotation.Value;
//
//import java.util.Date;
//import java.util.Random;
//
//@Service
//
//public class SmsServiceImpl implements SmsService {
//    @Value("${sms.accessKeyId}")
//    private String accessKeyId;
//
//    @Value("${sms.accessSecret}")
//    private String accessSecret;
//
//    @Value("${sms.signName}")
//    private String signName;
//
//    @Value("${sms.templateCode}")
//    private String templateCode;
//
//    @Override
//    public boolean sendSms(String iponeNUmber) {
//        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessSecret);
//        IAcsClient client = new DefaultAcsClient(profile);
//        CommonRequest request = new CommonRequest();
//        request.setMethod(MethodType.POST);
//        request.setDomain("dysmsapi.aliyuncs.com");
//        request.setVersion("2017-05-25");
//        request.setAction("SendSms");
//        request.putQueryParameter("RegionId", "cn-hangzhou");
//        request.putQueryParameter("PhoneNumbers", iponeNUmber);
//        request.putQueryParameter("SignName", signName);
//        request.putQueryParameter("TemplateCode", templateCode);
//        JSONObject object=new JSONObject();
//        String randCode=getRandCode(6);
//        log.info("验证码为：{}",randCode);
//        object.put("code",randCode);
//        request.putQueryParameter("TemplateParam", object.toJSONString());
//        try {
//            CommonResponse response = client.getCommonResponse(request);
//            log.info(response.getData());
//            return true;
//        } catch (Exception e) {
//            log.error("{}",e);
//        }
//        return false;
//    }
//    /**
//     * 生成随机验证码
//     * @param digits
//     * @return
//     */
//    public static String getRandCode(int digits) {
//        StringBuilder sBuilder = new StringBuilder();
//        Random rd = new Random((new Date()).getTime());
//
//        for(int i = 0; i < digits; ++i) {
//            sBuilder.append(String.valueOf(rd.nextInt(9)));
//        }
//
//        return sBuilder.toString();
//    }
//}
//
//
