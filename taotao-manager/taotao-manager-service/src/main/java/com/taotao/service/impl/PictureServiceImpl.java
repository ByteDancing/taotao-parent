package com.taotao.service.impl;

import com.sun.org.apache.bcel.internal.generic.IFEQ;
import com.taotao.common.utils.FtpUtils;
import com.taotao.common.utils.IDUtils;
import com.taotao.service.PictureService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/10 18:15
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Value("${FTP_ADDRESS}")
    private String FTP_ADDRESS;

    @Value("${FTP_PORT}")
    private Integer FTP_PORT;

    @Value("${FTP_USERNAME}")
    private String FTP_USERNAME;

    @Value("${FTP_PASSWORD}")
    private String FTP_PASSWORD;

    @Value("${FTP_BASE_PATH}")
    private String FTP_BASE_PATH;

    @Value("${IMAGE_BASE_URL}")
    private String IMAGE_BASE_URL;

    @Override
    public Map uploadPicture(MultipartFile uploadFile){
        Map resultMap = new HashMap<>();
        try {
        //取出源文件名
        String oldName = uploadFile.getOriginalFilename();
        //重新命名
        String newName = IDUtils.genImageName();
        //合成文件
        newName = newName + oldName.substring(oldName.lastIndexOf("."));
        //上传到文件服务器的日期前缀使用jdoda。time
        String imagePath = new DateTime().toString("/yyyy/MM/dd");
        boolean result = FtpUtils.uploadFile(FTP_ADDRESS,FTP_PORT,FTP_USERNAME,FTP_PASSWORD,
                FTP_BASE_PATH,imagePath,newName,uploadFile.getInputStream());
        //返回结果
            if (!result){
                //上传出错
                resultMap.put("error",1);
                resultMap.put("message","上传失败888");
                return  resultMap;
            }
            resultMap.put("error",0);
            resultMap.put("url",IMAGE_BASE_URL + imagePath + "/" + newName);
            return resultMap;
        } catch (IOException e) {
            resultMap.put("error",1);
            resultMap.put("message","发生异常");
            return  resultMap;
        }

    }
}
