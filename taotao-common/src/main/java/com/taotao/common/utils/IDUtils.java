package com.taotao.common.utils;

import java.util.Random;
import java.util.UUID;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/5 19:44
 */
public class IDUtils {

    /**
     * 生成商品图片名
     * @return
     */
    public static String genImageName() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //long millis = System.nanoTime();
        //加上三位随机数
        Random random = new Random();
        int end3 = random.nextInt(999);
        //如果不足三位前面补0
        String str = millis + String.format("%03d", end3);

        return str;
    }

    /**
     * 商品id生成
     *
     * @return
     */
    public static long getItemId() {
//        UUID.randomUUID();
        long millis = System.currentTimeMillis();
        Random random = new Random();
        int end2 = random.nextInt(99);
        String str = millis + String.format("%02d", end2);
        long id = new Long(str);
        return id;
    }

    /**
     * UUID 产生
     * @return
     */
    public static String generaUUID(){
        String uid =   UUID.randomUUID().toString().replaceAll("-","");
        return uid;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
//            System.out.println(getItemId());
            System.out.println(generaUUID());
        }
    }
}