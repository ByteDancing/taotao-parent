package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.DataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbItemParamMapper;
import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import com.taotao.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/11 0:40
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {

    @Autowired
    private TbItemParamMapper paramMapper;


    @Override
    public DataGridResult getItemParamList(int page, int rows) {
        TbItemParamExample example = new TbItemParamExample();
        PageHelper.startPage(page,rows);
        List<TbItemParam> list = paramMapper.selectByExample(example);
        DataGridResult result = new DataGridResult();
        result.setRows(list);
        PageInfo<TbItemParam> pageInfo =  new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    @Override
    public TaotaoResult getItemParamByCid(long cid) {
        TbItemParamExample example = new TbItemParamExample();
        TbItemParamExample.Criteria criteria = example.createCriteria();
        criteria.andItemCatIdEqualTo(cid);
        List<TbItemParam> list = paramMapper.selectByExampleWithBLOBs(example);
        if (list != null && list.size() > 0){
            return TaotaoResult.ok(list.get(0));
        }
        return TaotaoResult.ok();
    }

    @Override
    public TaotaoResult insertItemParam(TbItemParam itemParam) {
        //补全信息
        itemParam.setCreated(new Date());
        itemParam.setUpdated(new Date());
        paramMapper.insert(itemParam);
        return TaotaoResult.ok();
    }


}
