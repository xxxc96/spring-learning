package com.xucong.learning.passjavamember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xucong.learning.passjavacommon.utils.PageUtils;
import com.xucong.learning.passjavamember.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 会员-积分值变化历史记录表
 *
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:44:07
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

