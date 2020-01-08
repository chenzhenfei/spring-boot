package com.tsshare.srcspringbootexampletsshare.day2.config;

import com.tsshare.srcspringbootexampletsshare.day2.define.LinuxCondition;
import com.tsshare.srcspringbootexampletsshare.day2.define.WindowCondition;
import com.tsshare.srcspringbootexampletsshare.day2.service.ListService;
import com.tsshare.srcspringbootexampletsshare.day2.service.impl.LinuxListService;
import com.tsshare.srcspringbootexampletsshare.day2.service.impl.WindowListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author guabei
 * @title: ConditionConfig
 * @projectName spring-boot-build
 * @description: TODO
 * @date 2020/1/90:32
 */
@Configuration
public class ConditionConfig {
	@Bean
	/**
	 * <1>
	 */
	@Conditional(WindowCondition.class)
	public ListService windowListService(){
		return new WindowListService();
	}
	@Bean
	/**
	 * <2>
	 */
	@Conditional(LinuxCondition.class)
	public ListService LinuxListService(){
		return new LinuxListService();
	}

}
