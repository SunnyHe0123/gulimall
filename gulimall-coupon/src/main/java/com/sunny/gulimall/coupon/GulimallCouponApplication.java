package com.sunny.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 1.如何使用Nacos作为配置中心配置管理
 * 1)引入配置配置中心的依赖
 * 2）创建一个bootstrap.properties
 *   spring.application.name=gulimall-coupon
 *   spring.cloud.nacous.config.server-addr=127.0.0.1:8848
 * 3) 需要给配置中心添加一个叫数据集（Data Id）gulimall-coupon.properties 默认规则，应用名.properties
 * 4)给应用名.properties添加任何配置
 * 5）动态获取配置
 *   1.@RefreshScope：动态湖区并刷新配置
 *   2.@Value("${配置项的名}")：coupon.user.name
 *   如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置
 *
 */
//开始服务注册客户端
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
