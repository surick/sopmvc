package com.ljg.core.shiro.cache;

import org.apache.shiro.cache.Cache;

/**
 * shiro cache manager 接口
 *
 * @author w24164
 * @create 2018-02-07 14:53
 */
public interface ShiroCacheManager {

    <K, V> Cache<K, V> getCache(String name);

    void destroy();

}