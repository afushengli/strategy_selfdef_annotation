package com.fsl.strategy.annotation;


import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 功能描述
 * @author fsl
 * @date 2019/12/18 下午6:23
 * @return
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface HandlerType {
    String value();
}