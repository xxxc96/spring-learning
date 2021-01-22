package com.xucong.learning.passjavaquestion.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xucong.learning.passjavacommon.utils.PageUtils;
import com.xucong.learning.passjavacommon.utils.Query;

import com.xucong.learning.passjavaquestion.dao.QuestionDao;
import com.xucong.learning.passjavaquestion.entity.QuestionEntity;
import com.xucong.learning.passjavaquestion.service.QuestionService;


@Service("questionService")
public class QuestionServiceImpl extends ServiceImpl<QuestionDao, QuestionEntity> implements QuestionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QuestionEntity> page = this.page(
                new Query<QuestionEntity>().getPage(params),
                new QueryWrapper<QuestionEntity>()
        );

        return new PageUtils(page);
    }

}