package com.ycy.scheduling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ycy on 16/4/11.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskScheduleConfig.class);

    }
}
