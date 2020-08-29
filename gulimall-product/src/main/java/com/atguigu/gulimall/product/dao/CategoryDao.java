package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author huangjie
 * @email 1921489356@gmail.com
 * @date 2020-04-23 10:45:16
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
