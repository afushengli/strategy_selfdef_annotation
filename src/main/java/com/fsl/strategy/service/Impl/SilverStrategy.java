package com.fsl.strategy.service.Impl;

import com.fsl.strategy.annotation.HandlerType;
import com.fsl.strategy.model.UserType;
import com.fsl.strategy.service.Strategy;
import org.springframework.stereotype.Component;

/**
 * @author: fsl
 * @date: 2019/12/18 下午6:05
 * @description:
 * @version:1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */
//银卡
@Component
@HandlerType("1000")
public class SilverStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("白银会员 优惠50元");
        return money - 50;
    }

    @Override
    public String getType() {
        return UserType.SILVER_VIP.getCode();
    }
}
