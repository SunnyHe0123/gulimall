package com.sunny.gulimall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合SpringCache简化缓存开发
 * 1）引入依赖 spring-boot-starter-cache,spring-boot-starter-data-redis
 * 2) 写配置
 *   （1）自动配置了那些
 *   CacheAutoConfiguration 会导入 RedisCacheConfiguration
 *   自动配置好了缓存管理器RedisCacheManager
 *   （2）配置使用redis作为缓存
 *      spring.cache.type="redis"
 *  3)测试使用缓存
 *      @Cacheable：触发将数据保存到缓存的操作
 *      @CacheEvict: 触发将数据从缓存删除的操作
 *      @CachePut：
 *      @Caching：组合以上多个操作
 *      @CacheConfig：在类级别共享缓存的根
 *      1）开启缓存功能@EnableCaching
 *      2）只需要使用注解就能完成缓存的操作
 * 4）原理：
 * CacheAutoConfiguration -> RedisCacheConfiguration自动配置了rediscachemanager-> 初始化所有的缓存，每个缓存决定使用什么配置
 * 如果RedisCacheConfiguration有就用已有的，没有就用默认配置
 *
 *
 *
 */

@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
