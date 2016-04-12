package com.ycy.scheduling;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by ycy on 16/4/11.
 */
@Configuration
@ComponentScan("com.ycy.scheduling")
@EnableScheduling//1 开启计划任务的支持
public class TaskScheduleConfig {

}
