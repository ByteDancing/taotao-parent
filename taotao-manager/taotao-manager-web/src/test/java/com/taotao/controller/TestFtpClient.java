package com.taotao.controller;

import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/10 17:45
 */
public class TestFtpClient {

    @Test
    public void  testFtpClient() throws Exception{
        //创建一个ftpClient的对象
        FTPClient ftpClient = new FTPClient();
        //创建ftp连接
        ftpClient.connect("192.168.94.132",21);
        //ftp登录服务器
        ftpClient.login("ftpuser","gaorjftp");
        //上传文件
        //1-读取本地文件
        FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\Mr.Cheng\\Pictures\\c80a847be89c26815d02597f439304b3.jpg"));
        //设置上传路径
        ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
        //修改上传文件格式
        ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
        //第一个参数为服务端文件名，第二个参数为上传的文件inputStream
        ftpClient.storeFile("HelloSea.jpg",inputStream);
        //关闭连接
        ftpClient.logout();
    }
}
