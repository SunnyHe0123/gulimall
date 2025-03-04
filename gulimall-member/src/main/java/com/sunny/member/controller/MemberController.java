package com.sunny.member.controller;

import com.sunny.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * MemberController
 *
 * @Author JackLi 2025/3/4 19:42
 */
@RestController
public class MemberController {
    @Autowired
    private CouponFeignService couponFeignService;
    @GetMapping("/member/coupons")
    public List memberCoupons() {
        List list = couponFeignService.memberCoupons();
        System.out.println(list);
        return list;
    }
}
