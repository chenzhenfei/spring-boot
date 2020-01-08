package com.tsshare.srcspringbootexampletsshare.day2.define;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author guabei
 * @title: WindowCondition
 * @projectName spring-boot-build
 * @description: linux 条件定义
 * @date 2020/1/90:25
 */
public class LinuxCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return context.getEnvironment().getProperty("os.name").contains("Linux");
	}
}
