package com.xucong.learning.passjavamember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xucong.learning.passjavacommon.utils.PageUtils;
import com.xucong.learning.passjavamember.entity.MemberEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:44:07
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

