package com.tsshare.srcspringbootexampletsshare.day1.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @author guabei
 * @title: Compose
 * @projectName spring-boot-build
 * @description: 自定义组合注解
 * @date 2020/1/823:03
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration //<1>
@ComponentScan //<2>
public @interface ComposeConfigAndCompScan {
	//<3>
	String[] value() default {};
}
