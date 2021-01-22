package com.xucong.learning.passjavamember.dao;

import com.xucong.learning.passjavamember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:44:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
