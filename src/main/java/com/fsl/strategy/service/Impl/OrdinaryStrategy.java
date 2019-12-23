package com.fsl.strategy.service.Impl;

import com.fsl.strategy.annotation.HandlerType;
import com.fsl.strategy.model.UserType;
import com.fsl.strategy.service.Strategy;
import org.springframework.stereotype.Component;

/**
 * @author: fsl
 * @date: 2019/12/18 下午5:51
 * @description: 1.0.0
 * @version:1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */
//普通
@Component
@HandlerType("0")
public class OrdinaryStrategy implements Strategy {

    @Override
    public double compute(long money) {
        System.out.println("普通会员 不打折");
        return money;
    }

    // 添加 type 返回
    @Override
    public String getType() {
        return UserType.ORDINARY.getCode();
    }
}
