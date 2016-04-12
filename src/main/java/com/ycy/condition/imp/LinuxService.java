package com.ycy.condition.imp;

import com.ycy.condition.ListService;
import org.springframework.stereotype.Service;

/**
 * Created by ycy on 16/4/11.
 */
public class LinuxService implements ListService {
    public String showListCmd() {
        return "linux:ls";
    }
}
