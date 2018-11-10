package com.taotao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/* 页面跳转
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/10 10:15
 */
@Controller
public class PageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PageController.class);
    /**
     * 打开首页
     * @return
     */
    @RequestMapping("/")
    public String showIndex(){
        LOGGER.info("访问首页");
        return "index";
    }

    /**
     * 展示其他页面
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return  page;
    }

}