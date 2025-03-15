package com.sunny.gulimall.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * springboot2.0以后默认使用的是lc作为操作redis的客户端
 * 它使用的是netty作为网络通信，由于lettuce的bug导致netty堆外内存溢出，outoddirectmemoryerror
 * netty如果没有指定堆外内存，默认使用-Xmx300m为堆外内存
 * 解决方案：
 * 不能只去调大堆外内存
 * 1）升级lettuce客户端 2）切换使用jedis
 */

@SpringBootTest
class GulimallCouponApplicationTests {
    @Autowired
    public RedisTemplate redisTemplate;

    @Test
    void test() {
        redisTemplate.opsForValue().set("hello", "111");
        System.out.println(redisTemplate.opsForValue().get("hello"));
    }

    @Test
    void contextLoads() {
    }

}
