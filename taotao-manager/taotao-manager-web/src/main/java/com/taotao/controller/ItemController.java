package com.taotao.controller;

import com.taotao.common.pojo.DataGridResult;
import com.taotao.common.pojo.TaotaoResult;
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

    /**
     * 查询商品列表
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/item/list")
    @ResponseBody
    public DataGridResult getItemList(Integer page,Integer rows){
        DataGridResult result = itemService.getItemList(page,rows);
        return result;
    }

    /**
     * 新增商品信息
     * @param item
     * @return
     */
    @RequestMapping(value = "/item/save",method = RequestMethod.POST)
    @ResponseBody
    public TaotaoResult insertItem(TbItem item,String desc) throws Exception {
       TaotaoResult result = itemService.insertItem(item,desc);
       return result;
    }


/*
    @RequestMapping("I")
    public String helloTest(){
        LOGGER.info("testing *********************");

        return "index";
    }*/
}
