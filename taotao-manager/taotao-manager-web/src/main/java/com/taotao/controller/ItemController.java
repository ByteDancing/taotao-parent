package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/4 23:24
 */
@Controller
public class ItemController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/item/{itemId}",method = RequestMethod.GET)
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId){
        LOGGER.info("查询itemId{}"+itemId);
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }

/*
    @RequestMapping("I")
    public String helloTest(){
        LOGGER.info("testing *********************");

        return "index";
    }*/
}
