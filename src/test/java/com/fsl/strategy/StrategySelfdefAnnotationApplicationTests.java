package com.fsl.strategy;
import com.fsl.strategy.model.HandlerFactory;
import com.fsl.strategy.service.Strategy;
import com.fsl.strategy.model.StrategyFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategySelfdefAnnotationApplicationTests {


    @Autowired
    private HandlerFactory context;

    @Test
    void contextLoads() {


        Strategy strategy = context.getInstance("3000");
        double money1   =  strategy.compute(2000);
        System.out.println(money1);


/*
        double money = getResult(2000,"3000");
        System.out.println(money);*/

    }


    private static double getResult(long money, String type) {

        if (money < 1000) {
            return money;
        }

        Strategy strategy = StrategyFactory.getInstance().get(type);

        if (strategy == null){
            throw new IllegalArgumentException("please input right type");
        }

        return strategy.compute(money);
    }



}
