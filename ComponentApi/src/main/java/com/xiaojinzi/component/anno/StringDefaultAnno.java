package com.xiaojinzi.component.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用这个注解给参数或者字段添加上一个默认值
 */
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface StringDefaultAnno {

    /**
     * 使用这个注解给参数或者字段添加上一个默认值,value是这个字段或者参数默认的值
     *
     * @return
     */
    String value();

}
