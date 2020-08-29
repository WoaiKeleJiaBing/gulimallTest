package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author huangjie
 * @email 1921489356@gmail.com
 * @date 2020-04-23 13:43:42
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
