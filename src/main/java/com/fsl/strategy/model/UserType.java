package com.fsl.strategy.model;

/**
 * @author: fsl
 * @date: 2019/12/18 下午5:52
 * @description:
 * @version:1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */
public enum UserType {

    //普通会员
    ORDINARY("0","普通会员"),

    //银卡会员
    SILVER_VIP("1000","银卡会员"),
    //金卡会员
    GOLD_VIP("2000","金卡会员"),
    //白金卡会员
    PLATINUM_VIP("3000","金卡会员");




    private String code;
    private String type;

    UserType(String code ,String type){
        this.code =code;
        this.type =type;
    }

    public String getCode() {
        return code;
    }


}
