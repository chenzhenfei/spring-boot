package com.tsshare.srcspringbootexampletsshare.day1;

import com.tsshare.srcspringbootexampletsshare.day1.annotation.ComposeConfigAndCompScan;

/**
 * @author guabei
 * @title: DemoConfig
 * @projectName spring-boot-build
 * @description: 配置注解的示例
 * @date 2020/1/823:51
 */
@ComposeConfigAndCompScan(value = {"com.tsshare.srcspringbootexampletsshare.day1"}) //<1>
public class DemoAnnoConfig {
}
