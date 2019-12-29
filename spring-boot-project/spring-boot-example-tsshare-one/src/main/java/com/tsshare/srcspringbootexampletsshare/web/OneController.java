package com.tsshare.srcspringbootexampletsshare.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guabeo
 * @title: OneController
 * @projectName spring-boot-build
 * @description: oneController
 * @date 2019/12/2923:01
 */
@RestController
@Slf4j
@RequestMapping(value = "one")
public class OneController {

	@GetMapping(value = "/testOne")
	public Map<String ,Object> testOne(){
		Map<String ,Object > retMap =new HashMap<>(16);
		retMap.put("code",200);
		retMap.put("msg","test");
		retMap.put("data","success");
		return  retMap;
	}
}
