package com.tsshare.srcspringbootexampletsshare.day2;

import com.tsshare.srcspringbootexampletsshare.day1.DemoAnnoConfig;
import com.tsshare.srcspringbootexampletsshare.day1.service.DemoService;
import com.tsshare.srcspringbootexampletsshare.day2.config.ConditionConfig;
import com.tsshare.srcspringbootexampletsshare.day2.service.ListService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ConditionContext;

/**
 * @author guabei
 * @title: AnnoMain
 * @projectName spring-boot-build
 * @description: 测试
 * @date 2020/1/823:40
 */

public class ConditionAnnoMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService demoService =context.getBean(ListService.class);
		String out = demoService.showListCmd();
		System.out.println(context.getEnvironment().getProperty("os.name")+" 系统下的列表命令为：" +out);
		context.close();
	}
}
