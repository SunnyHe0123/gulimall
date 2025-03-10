package com.sunny.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
 *  细节：
 *   1）命名空间：配置隔离
 *      默认：public (保留空间);默认新增的所有配置都在public空间
 *      1.开发，测试，生产：利用命名空间来做环境隔离
 *      注意：需要在bootstrap.properties中配置需要使用那个命名空间的配置
 *      spring.cloud.nacos.config.namespace=440c7d35-72ed-4ac6-a5f3-b7a5165b8051
 *      2.基于每一个微服务之前相互隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的配置
 *   2）配置集：所有配置的集合
 *   3）配置集ID：类似于配置文件名 Data ID，
 *   1111,618
 *   4）配置分组
 *   默认所有配置集都属于：DATE_GROUP;
 *   1111,618,1212
 *   每个微服务创建自己的命名空间，然后在使用配置分组来区分环境
 *   项目中的使用，每个微服务创建自己的命名空间，根据配置分组区分环境，dev，test，prod
 *
 *   3.同时加载多个配置集：
 *   1).微服务任何配置信息，任何配置文件都可以放在配置中心中
 *   2）只需要在bootstrap.properties说明加载配置中心中那些配置文件即可
 *   3）@Value，@ConfigurationProperties。。。
 *   以前springboot任何方法从配置文件中获取值，都能使用
 *   配置中心有的优先使用
 *
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
