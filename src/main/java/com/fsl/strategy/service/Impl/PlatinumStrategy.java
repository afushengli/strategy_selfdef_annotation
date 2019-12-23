package com.fsl.strategy.service.Impl;

import com.fsl.strategy.annotation.HandlerType;
import com.fsl.strategy.model.UserType;
import com.fsl.strategy.service.Strategy;
import org.springframework.stereotype.Component;

/**
 * @author: fsl
 * @date: 2019/12/18 下午6:07
 * @description:
 * @version:1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */

//白金
@Component
@HandlerType("3000")
public class PlatinumStrategy  implements Strategy {


    @Override
    public double compute(long money) {
        System.out.println("白金会员 优惠50元，再打7折");
        return (money - 50) * 0.7;
    }

    @Override
    public String getType() {
        return UserType.PLATINUM_VIP.getCode();
    }


}
