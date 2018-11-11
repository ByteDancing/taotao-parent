package com.taotao.service.impl;

import com.taotao.mapper.TbItemParamItemMapper;
import com.taotao.pojo.TbItemParamItem;
import com.taotao.pojo.TbItemParamItemExample;
import com.taotao.service.ItemParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* 商品规格参数展示
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/11 12:14
 */
@Service
public class ItemParamItemServiceImpl implements ItemParamItemService {

    @Autowired
    private TbItemParamItemMapper tbItemParamItemMapper;

    /**
     * 查询商品规格参数，并生成html（没啥用，不往下写了）
     * @param itemId
     * @return
     */
    @Override
    public String getItemParamByItemId(long itemId) {
        TbItemParamItemExample example = new TbItemParamItemExample();
        TbItemParamItemExample.Criteria criteria = example.createCriteria();
        criteria.andItemIdEqualTo(itemId);
        //查询
        List<TbItemParamItem> list = tbItemParamItemMapper.selectByExample(example);
        if (list == null && list.size() == 0){
            return "";
        }
        TbItemParamItem tbItemParamItem = list.get(0);
        String paramData = tbItemParamItem.getParamData();
        //生成html

        return null;
    }
}
