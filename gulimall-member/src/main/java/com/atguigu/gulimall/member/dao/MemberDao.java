package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author huangjie
 * @email 1921489356@gmail.com
 * @date 2020-04-23 14:05:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
