package com.tsshare.srcspringbootexampletsshare.day2.service.impl;

import com.tsshare.srcspringbootexampletsshare.day2.service.ListService;

/**
 * @author guabei
 * @title: WindowListService
 * @projectName spring-boot-build
 * @description: WindowListService
 * @date 2020/1/90:30
 */
public class LinuxListService implements ListService {
	@Override
	public String showListCmd() {
		return "Linux - ls";
	}
}
