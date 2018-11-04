package com.taotao.controller;

import com.taotao.service.TaoTaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/2 0:23
 */

//@RestController
@Controller
public class TaoTaoController {

    @Autowired
    private TaoTaoService taoTaoService;

    private static final Logger LOGGER = LoggerFactory.getLogger(TaoTaoController.class);
    /**
     * 测试
     * @return
     */
    @RequestMapping("hellotaotao")
    public String helloTest(){
        LOGGER.info("testing *********************");

        return "index";
    }

}
