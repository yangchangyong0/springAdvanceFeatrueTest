package com.ycy.condition;

import com.ycy.condition.imp.LinuxService;
import com.ycy.condition.imp.WindowsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ycy on 16/4/11.
 */
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)//1
    public ListService WindowsListService() {
        return new WindowsService();
    }

    @Bean
    @Conditional(LinuxCondition.class)//2
    public ListService linuxListService() {
        return new LinuxService();
    }
}
