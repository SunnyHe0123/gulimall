package com.sunny.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * CouponFeignService
 *
 * @Author JackLi 2025/3/4 19:36
 */
//远程调用的服务名字, 这是一个声明式的远程调用
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @GetMapping("/coupon/member/list")
    public List memberCoupons();

}
