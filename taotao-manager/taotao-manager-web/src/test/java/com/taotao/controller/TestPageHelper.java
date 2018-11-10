package com.taotao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/10 10:52
 */
public class TestPageHelper {


    @Test
    public void testPageHelper(){
        //创建一个Spring的容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        //从Spring容器中获得Mapper的代理对象
        TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
        //执行查询
        TbItemExample example = new TbItemExample();
        //分页
        PageHelper.startPage(2,10);
        List<TbItem> list = mapper.selectByExample(example);
        //去商品列表
        for (TbItem tbItem :list) {
            System.out.println(tbItem.getTitle());
        }
        //取出分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        System.out.println("共有商品信息——————"+total);


    }

}
