package com.tsshare.srcspringbootexampletsshare.day1.service;

import org.springframework.stereotype.Service;

/**
 * @author guabei
 * @title: DemoService
 * @projectName spring-boot-build
 * @description: 实例bean
 * @date 2020/1/823:30
 */
@Service
public class DemoService {

	public void demoOutPut(){
		System.out.println("从组合注解配置照样获得的Bean");
	}
}
