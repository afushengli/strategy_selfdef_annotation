package com.fsl.strategy.model;

import com.fsl.strategy.service.Strategy;
import com.fsl.strategy.utils.SpringContextUtils;
import java.util.Map;

/**
 * @author: fsl
 * @date: 2019/12/19 上午11:07
 * @description: 1.0.0
 * @version:1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */

//根据type 获取类的工厂
public class HandlerFactory {

    Map<String,String>  handlerMap;

    public  HandlerFactory(Map<String,String>  handlerMap){
        this.handlerMap = handlerMap;
    }

    public Strategy getInstance(String type){

        String clazz =  handlerMap.get(type);

        if (clazz == null){
            throw new IllegalArgumentException("please input right type");
        }

        return (Strategy)SpringContextUtils.getBean(clazz);

    }

}
