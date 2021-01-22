package com.xucong.learning.passjavaquestion.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xucong.learning.passjavacommon.utils.PageUtils;
import com.xucong.learning.passjavacommon.utils.Query;

import com.xucong.learning.passjavaquestion.dao.TypeDao;
import com.xucong.learning.passjavaquestion.entity.TypeEntity;
import com.xucong.learning.passjavaquestion.service.TypeService;


@Service("typeService")
public class TypeServiceImpl extends ServiceImpl<TypeDao, TypeEntity> implements TypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TypeEntity> page = this.page(
                new Query<TypeEntity>().getPage(params),
                new QueryWrapper<TypeEntity>()
        );

        return new PageUtils(page);
    }

}