package com.tsshare.srcspringbootexampletsshare.day1;

import com.tsshare.srcspringbootexampletsshare.day1.DemoAnnoConfig;
import com.tsshare.srcspringbootexampletsshare.day1.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenzhenfei
 * @title: AnnoMain
 * @projectName spring-boot-build
 * @description: 测试
 * @date 2020/1/823:40
 */

public class AnnoMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(DemoAnnoConfig.class);
		DemoService demoService =context.getBean(DemoService.class);
		demoService.demoOutPut();
		context.close();
	}
}
