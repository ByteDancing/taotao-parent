package com.taotao.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/* 图片上传
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/10 18:13
 */
public interface PictureService {

    Map uploadPicture(MultipartFile uploadFile);

}
