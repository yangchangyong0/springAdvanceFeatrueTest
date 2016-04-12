package com.ycy.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ycy on 16/4/11.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dataformt = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//1
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次:"+dataformt.format(new Date()));

    }
    @Scheduled(cron="0 15 12 ? * *")//2
    public void fixTimeExecution(){
        System.out.println("指定时间:"+dataformt.format(new Date())+"执行");
    }
}
