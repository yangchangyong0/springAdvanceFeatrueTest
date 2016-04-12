package com.ycy.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ycy on 16/4/11.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下面的列表命令为:" + listService.showListCmd());
    }
}
