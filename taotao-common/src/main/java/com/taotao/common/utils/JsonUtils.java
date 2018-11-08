package com.taotao.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.IOException;
import java.util.List;

/**
 * 自定义响应式结构
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/8 23:56
 */
public class JsonUtils {
    //定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     *
     * @param object
     * @return
     */
    private static String objectToJson(Object object){
        try {
            String str = MAPPER.writeValueAsString(object);
            return str;
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param jsonData
     * @param beanType
     * @param <T>
     * @return
     */
    private static <T> T jsonToPojo(String jsonData ,Class<T> beanType){

        try {
            T t = MAPPER.readValue(jsonData,beanType);
            return t;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }

    /**
     * json转换为pojo的list对象
     * @param jsonData
     * @param beanType
     * @param <T>
     * @return
     */
    public static <T>List<T> jsonToList (String jsonData , Class<T> beanType){
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class,beanType);
        try {
            List list = MAPPER.readValue(jsonData,javaType);
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
