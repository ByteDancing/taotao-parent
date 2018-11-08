package com.taotao.common.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/** 获取异常的堆栈信息
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/8 23:51
 */
public class ExceptionUtil {
    public static String getStackTrace(Throwable throwable){
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);

        try {
            throwable.printStackTrace();
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }

    }
}
