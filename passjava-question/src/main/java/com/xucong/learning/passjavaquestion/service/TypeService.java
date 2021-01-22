package com.xucong.learning.passjavaquestion.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xucong.learning.passjavacommon.utils.PageUtils;
import com.xucong.learning.passjavaquestion.entity.TypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:30:24
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

