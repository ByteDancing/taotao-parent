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