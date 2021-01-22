package com.xucong.learning.passjavacontent.dao;

import com.xucong.learning.passjavacontent.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:49:42
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
