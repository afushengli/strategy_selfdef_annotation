package com.fsl.strategy.service.Impl;

import com.fsl.strategy.annotation.HandlerType;
import com.fsl.strategy.model.UserType;
import com.fsl.strategy.service.Strategy;
import org.springframework.stereotype.Component;

/**
 * @author: fsl
 * @date: 2019/12/18 下午5:59
 * @description:
 * @version:v1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */
@Component
@HandlerType("2000")
public class GoldStrategy  implements Strategy {

    @Override
    public double compute(long money) {
        System.out.println("黄金会员 8折");
        return money * 0.8;
    }

    // 添加 type 返回
    @Override
    public String getType() {
        return UserType.GOLD_VIP.getCode();
    }
}
