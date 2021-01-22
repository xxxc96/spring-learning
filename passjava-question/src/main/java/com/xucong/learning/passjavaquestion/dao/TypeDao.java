package com.xucong.learning.passjavaquestion.dao;

import com.xucong.learning.passjavaquestion.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:30:24
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
