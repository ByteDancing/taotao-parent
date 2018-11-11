package com.taotao.service;

import com.taotao.common.pojo.DataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItemParam;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.PrivateKey;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/11 0:39
 */
public interface ItemParamService {

    DataGridResult getItemParamList(int page, int rows);

    TaotaoResult getItemParamByCid(long cid);

    TaotaoResult insertItemParam(TbItemParam itemParam);
}
