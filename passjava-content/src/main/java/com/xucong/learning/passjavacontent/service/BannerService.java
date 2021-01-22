package com.xucong.learning.passjavacontent.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xucong.learning.passjavacommon.utils.PageUtils;
import com.xucong.learning.passjavacontent.entity.BannerEntity;

import java.util.Map;

/**
 * 内容-横幅广告表
 *
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:49:42
 */
public interface BannerService extends IService<BannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

