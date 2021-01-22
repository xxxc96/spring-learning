package com.xucong.learning.passjavaquestion.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xucong.learning.passjavacommon.utils.PageUtils;
import com.xucong.learning.passjavaquestion.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:30:24
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

