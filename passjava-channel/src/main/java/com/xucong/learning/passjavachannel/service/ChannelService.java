package com.xucong.learning.passjavachannel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xucong.learning.passjavacommon.utils.PageUtils;
import com.xucong.learning.passjavachannel.entity.ChannelEntity;

import java.util.Map;

/**
 * 渠道-渠道表
 *
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:52:19
 */
public interface ChannelService extends IService<ChannelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

