package com.fsl.strategy.model;

import com.fsl.strategy.service.Impl.GoldStrategy;
import com.fsl.strategy.service.Impl.OrdinaryStrategy;
import com.fsl.strategy.service.Impl.PlatinumStrategy;
import com.fsl.strategy.service.Impl.SilverStrategy;
import com.fsl.strategy.service.Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: fsl
 * @date: 2019/12/18 下午6:10
 * @description:
 * @version:1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */
public class StrategyFactory {

    private Map<String, Strategy> map;

    public StrategyFactory() {

        List<Strategy> strategies = new ArrayList<>();

        strategies.add(new OrdinaryStrategy());
        strategies.add(new SilverStrategy());
        strategies.add(new GoldStrategy());
        strategies.add(new PlatinumStrategy());

        // 看这里 看这里 看这里！
        map = strategies.stream().collect(Collectors.toMap(Strategy::getType, strategy -> strategy));

    }

    public static class Holder {
        public static StrategyFactory instance = new StrategyFactory();
    }

    public static StrategyFactory getInstance() {
        return Holder.instance;
    }

    public Strategy get(String type) {
        return map.get(type);
    }


}
