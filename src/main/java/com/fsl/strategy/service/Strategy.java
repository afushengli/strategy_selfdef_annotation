package com.fsl.strategy.service;

/**
 * @author: fsl
 * @date: 2019/12/18 下午5:51
 * @description: 1.0.0
 * @version:1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */
public interface Strategy {

    double compute(long money);

    // 返回 type
    String getType();
}
