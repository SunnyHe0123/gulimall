package com.sunny.gulimall.coupon.controller;

import com.sunny.gulimall.coupon.entity.CouponEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * CouponController
 *
 * @Author JackLi 2025/3/4 19:22
 */
@RefreshScope
@RestController
public class CouponController {
    @Value("${coupon.user.name}")
    private String name;
    @Value("${coupon.user.age}")
    private String age;
    @GetMapping("/test")
    public List test() {
        return Arrays.asList(name, age);
    }
    @GetMapping ("/coupon/member/list")
    public List memberCoupons() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setName("满100减10");

        return Arrays.asList(couponEntity);
    }
}
