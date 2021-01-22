package com.xucong.learning.passjavamember.dao;

import com.xucong.learning.passjavamember.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-积分值变化历史记录表
 * 
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:44:07
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
