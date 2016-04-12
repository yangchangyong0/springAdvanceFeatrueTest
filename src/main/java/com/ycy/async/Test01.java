package com.ycy.async;

import org.springframework.scheduling.annotation.Async;

/**
 * Created by ycy on 16/4/11.
 */
public class Test01 {

        @Async
        public static void testAsyncMethod(){
            try {
                //让程序暂停100秒，相当于执行一个很耗时的任务
                //或者记录日志就不要占用客户端的时间了
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
}
