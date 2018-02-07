package com.ljg.core.config;

import com.ljg.common.utils.LoggerUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-07 15:14
 */
public class IConfig {
    /**
     * 同步锁
     */
    private static final Object obj = new Object();

    /**
     * 配置文件
     */
    private static Properties prop = null;

    /**
     * 配置对象单例模式
     */
    private static IConfig config = null;

    /**
     * 配置文件名称
     */
    private final static String FILE_NAME = "/config.properties";

    static{
        prop = new Properties();
        try {
            prop.load(IConfig.class.getResourceAsStream(FILE_NAME));
        } catch (IOException e) {
            LoggerUtils.fmtError(IConfig.class,e, "加载文件异常，文件路径：%s", FILE_NAME);
        }

    }

    /**
     * 获取单例模式对象实例
     * @return 唯一对象实例
     */
    public static IConfig getInstance(){
        if(null==config){
            synchronized (obj) {
                config = new IConfig();
            }
        }
        return config;
    }

    /**
     */
    public static String get(String key){
        return prop.getProperty(key);
    }

}
