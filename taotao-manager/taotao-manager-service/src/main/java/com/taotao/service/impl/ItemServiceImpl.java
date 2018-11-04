package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/4 23:31
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(Long itemId) {
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> list = tbItemMapper.selectByExample(example);
        if (list.size()>0 && list != null){
            TbItem item  = list.get(0);
            return item;
        }
        return null;
    }
}
