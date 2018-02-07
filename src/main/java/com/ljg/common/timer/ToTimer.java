package com.ljg.common.timer;

import com.ljg.permission.service.RoleService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 定时任务恢复数据
 *
 * @author w24164
 * @create 2018-02-07 14:29
 */
@Component
public class ToTimer {
    @Resource
    RoleService roleService;
    @Scheduled(cron = "0/20 * * * * ? ")
    public void run() {
        /**
         * 调用存储过程，重新创建表，插入初始化数据。
         */
        roleService.initData();
        System.out.println(new Date().getTime());
    }
}
