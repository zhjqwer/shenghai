package com.chuxin.entity;

import com.aliyun.oss.ClientConfiguration;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.AppendObjectRequest;
import com.aliyun.oss.model.AppendObjectResult;
import com.aliyun.oss.model.PutObjectResult;
import com.aliyun.oss.model.UploadFileRequest;
import org.apache.commons.lang3.RandomUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;

public class OssUtils {

    private static String endpoint = "oss-cn-hangzhou.aliyuncs.com";
    private static String accessKeyId = "LTAI4Fci9vuGMZpXECfvsAnv";
    private static String accessKeySecret = "bBt74aVnTPtKGuNT9s15WrKX9dZBRk";

    private static OSSClient createClient(){

        // endpoint以杭州为例，其它region请按实际情况填写
        endpoint = "oss-cn-hangzhou.aliyuncs.com";
        // accessKey请登录https://ak-console.aliyun.com/#/查看
        accessKeyId = "LTAI4Fci9vuGMZpXECfvsAnv";
        accessKeySecret = "bBt74aVnTPtKGuNT9s15WrKX9dZBRk";
        // 创建ClientConfiguration实例
        //设置oss的配置信息
        ClientConfiguration conf = new ClientConfiguration();
        // 设置OSSClient使用的最大连接数，默认1024
        conf.setMaxConnections(200);
        // 设置请求超时时间，默认50秒
        conf.setSocketTimeout(10000);
        // 设置失败请求重试次数，默认3次
        conf.setMaxErrorRetry(5);
        // 创建OSSClient实例
        OSSClient client  = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		/*// 关闭client
		client.shutdown();*/

        return client;
    }

    public static URL getUrl(String keyname){
        OSSClient client =createClient();
        //设置bucket权限
        //client.setBucketAcl("tr1912test", CannedAccessControlList.Private);
        String bucketName = "onedemo";
        String key = keyname;
        // 设置URL过期时间为1小时
        Date expiration = new Date(new Date().getTime() + 3600 * 1000);
        // 生成URL
        URL url = client.generatePresignedUrl(bucketName, key, expiration);
        return url;
    }
    /**
     * 下载文件
     */
    public static void downObject(String bucketName,String key,File file){
        OSSClient client =createClient();
        if(!client.doesBucketExist(bucketName)){
            client.createBucket(bucketName);
        }
        PutObjectResult por = client.putObject(bucketName, key, file);
    }

/************************************************************流式上传begin****************************************************************************/
    /**
     * 流式上传文件-上传字符串
     */
    public static void upStringObject(String bucketName,String key,String object){
        OSSClient client =createClient();
        if(!client.doesBucketExist(bucketName)){
            //注释掉的是bucket是可以设置权限的  默认的方式是私有读写
			/*CreateBucketRequest createBucketRequest= new CreateBucketRequest(bucketName);
			// 设置bucket权限
			createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
			ossClient.createBucket(createBucketRequest);*/
            client.createBucket(bucketName);
        }
        PutObjectResult por = client.putObject(bucketName, key, new ByteArrayInputStream(object.getBytes()));
        client.shutdown();
    }

    /**
     * 流式上传文件-byte数组
     */
    public static void upByteObject(String bucketName,String key,byte[] object){
        OSSClient client =createClient();
        if(!client.doesBucketExist(bucketName)){
            //注释掉的是bucket是可以设置权限的  默认的方式是私有读写
			/*CreateBucketRequest createBucketRequest= new CreateBucketRequest(bucketName);
			// 设置bucket权限
			createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
			ossClient.createBucket(createBucketRequest);*/
            client.createBucket(bucketName);
        }
        PutObjectResult por = client.putObject(bucketName, key, new ByteArrayInputStream(object));
        client.shutdown();
    }

    /**
     * 流式上传文件-上传网络流
     * InputStream inputStream = new URL("https://www.aliyun.com/").openStream();
     */
    public static void upWLObject(String bucketName,String key,InputStream inputStream){
        OSSClient client =createClient();
        if(!client.doesBucketExist(bucketName)){
            //注释掉的是bucket是可以设置权限的  默认的方式是私有读写
			/*CreateBucketRequest createBucketRequest= new CreateBucketRequest(bucketName);
			// 设置bucket权限
			createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
			ossClient.createBucket(createBucketRequest);*/
            client.createBucket(bucketName);
        }
        PutObjectResult por = client.putObject(bucketName, key, inputStream);
        client.shutdown();
    }

    /**
     * 流式上传文件-上传文件流
     * InputStream inputStream = new FileInputStream("localFile");
     */
    public static URL upFObject(String bucketName,String key,InputStream inputStream){
        OSSClient client =createClient();
        if(!client.doesBucketExist(bucketName)){
            //注释掉的是bucket是可以设置权限的  默认的方式是私有读写
			/*CreateBucketRequest createBucketRequest= new CreateBucketRequest(bucketName);
			// 设置bucket权限
			createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
			ossClient.createBucket(createBucketRequest);*/
            client.createBucket(bucketName);
        }
        PutObjectResult por = client.putObject(bucketName, key, inputStream);
        //获取该文件在阿里云的路径
        URL url=getUrl(key);
        client.shutdown();
        return url;
    }

    /**
     * 流式上传文件-上传文件
     */
    public static URL upFileObject(String bucketName,String key,File file){
        OSSClient client =createClient();

        if(!client.doesBucketExist(bucketName)){
            //注释掉的是bucket是可以设置权限的  默认的方式是私有读写
			/*CreateBucketRequest createBucketRequest= new CreateBucketRequest(bucketName);
			// 设置bucket权限
			createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
			ossClient.createBucket(createBucketRequest);*/
            client.createBucket(bucketName);
        }
        PutObjectResult por = client.putObject(bucketName, key, file);

        URL imageurl=getUrl(key);

        client.shutdown();
        return imageurl;
    }



    /**
     * 追加上传
     */
    public static void appendObject(String bucketName,String key,String content){
        OSSClient client =createClient();
		/*if(!client.doesBucketExist(bucketName)){
			//注释掉的是bucket是可以设置权限的  默认的方式是私有读写
			CreateBucketRequest createBucketRequest= new CreateBucketRequest(bucketName);
			// 设置bucket权限
			createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
			ossClient.createBucket(createBucketRequest);
			client.createBucket(bucketName);
		}*/
        AppendObjectRequest appendObjectRequest = new AppendObjectRequest(bucketName,
                key, new ByteArrayInputStream(content.getBytes()));
        // 第一次追加
        appendObjectRequest.setPosition(0L);
        AppendObjectResult appendObjectResult = client.appendObject(appendObjectRequest);
        // 第二次追加
        appendObjectRequest.setPosition(appendObjectResult.getNextPosition());
        appendObjectResult = client.appendObject(appendObjectRequest);
        // 第三次追加
        appendObjectRequest.setPosition(appendObjectResult.getNextPosition());
        appendObjectResult = client.appendObject(appendObjectRequest);
        // 关闭client
        client.shutdown();
    }


    /**
     * 断点续传
     */
    public static void continueObject(String bucketName,String key,String localfile){
        OSSClient client =createClient();
        // 设置断点续传请求
        UploadFileRequest uploadFileRequest = new UploadFileRequest(bucketName, key);
        // 指定上传的本地文件
        uploadFileRequest.setUploadFile(localfile);
        // 指定上传并发线程数
        uploadFileRequest.setTaskNum(5);
        // 指定上传的分片大小
        uploadFileRequest.setPartSize(1 * 1024 * 1024);
        // 开启断点续传
        uploadFileRequest.setEnableCheckpoint(true);
        // 断点续传上传
        try {
            client.uploadFile(uploadFileRequest);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        client.shutdown();
    }


    public static void main(String[] args){
        File file=new File("F:\\images\\1.png");
        URL url;
        String s;

        long l = System.currentTimeMillis();
      long l1=(long) RandomUtils.nextInt(100, 9999);
        url = upFileObject("onedemo", "myImage/user/"+l+l1, file);
        String string = url.toString();

        System.out.println(l);

        System.out.println(string);

        System.out.println(url);
    }
}