package com.taotao.service;

import com.taotao.common.pojo.TreeNode;

import java.util.List;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/10 15:57
 */
public interface ItemCatService {
    public List<TreeNode> getItemCatList(long parentId);
}
