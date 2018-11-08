package com.taotao.common.pojo;

import java.util.List;

/**
 * 数据结构
 *
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/8 23:49
 */
public class DataGridResult {
    private long total;
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
