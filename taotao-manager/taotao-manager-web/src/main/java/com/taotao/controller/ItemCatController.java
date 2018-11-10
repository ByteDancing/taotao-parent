package com.taotao.controller;

import com.taotao.common.pojo.TreeNode;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/* 商品的分类管理
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/10 16:22
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List<TreeNode> getItemList(@RequestParam(value = "id",defaultValue = "0") Long parentId){
        List<TreeNode> list = itemCatService.getItemCatList(parentId);
        return list;
    }

}
