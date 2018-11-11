package com.taotao.controller;

import com.taotao.common.pojo.DataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemParam;
import com.taotao.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/11 0:49
 */
@Controller
@RequestMapping("/item/param")
public class ItemParamController {

    @Autowired
    private ItemParamService itemParamService;

    @RequestMapping("/list")
    @ResponseBody
    public DataGridResult getItemParamList(Integer page, Integer rows){
        DataGridResult result = itemParamService.getItemParamList(page,rows);
        return result;
    }

    @RequestMapping("/query/itemcatid/{itemcatId}")
    @ResponseBody
    public TaotaoResult getItemParamByCid(@PathVariable  Long itemcatId){
        TaotaoResult result = itemParamService.getItemParamByCid(itemcatId);
        return result;
    }

    @RequestMapping("/save/{cid}")
    @ResponseBody
    public TaotaoResult insertItemParam(@PathVariable  Long cid, String paramData){
        TbItemParam itemParam = new TbItemParam();
        itemParam.setItemCatId(cid);
        itemParam.setParamData(paramData);
        TaotaoResult result = itemParamService.insertItemParam(itemParam);
        return result;
    }


}
