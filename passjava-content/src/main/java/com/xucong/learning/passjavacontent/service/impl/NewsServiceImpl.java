package com.xucong.learning.passjavacontent.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xucong.learning.passjavacommon.utils.PageUtils;
import com.xucong.learning.passjavacommon.utils.Query;

import com.xucong.learning.passjavacontent.dao.NewsDao;
import com.xucong.learning.passjavacontent.entity.NewsEntity;
import com.xucong.learning.passjavacontent.service.NewsService;


@Service("newsService")
public class NewsServiceImpl extends ServiceImpl<NewsDao, NewsEntity> implements NewsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<NewsEntity> page = this.page(
                new Query<NewsEntity>().getPage(params),
                new QueryWrapper<NewsEntity>()
        );

        return new PageUtils(page);
    }

}