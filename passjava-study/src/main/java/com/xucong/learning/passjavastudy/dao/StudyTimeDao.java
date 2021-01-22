package com.xucong.learning.passjavastudy.dao;

import com.xucong.learning.passjavastudy.entity.StudyTimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:37:16
 */
@Mapper
public interface StudyTimeDao extends BaseMapper<StudyTimeEntity> {
	
}
