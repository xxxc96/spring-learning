package com.xucong.learning.passjavachannel.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xucong.learning.passjavachannel.entity.AccessTokenEntity;
import com.xucong.learning.passjavachannel.service.AccessTokenService;
import com.xucong.learning.passjavacommon.utils.PageUtils;
import com.xucong.learning.passjavacommon.utils.R;



/**
 * 渠道-认证表
 *
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:52:19
 */
@RestController
@RequestMapping("passjavachannel/accesstoken")
public class AccessTokenController {
    @Autowired
    private AccessTokenService accessTokenService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("passjavachannel:accesstoken:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = accessTokenService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("passjavachannel:accesstoken:info")
    public R info(@PathVariable("id") Long id){
		AccessTokenEntity accessToken = accessTokenService.getById(id);

        return R.ok().put("accessToken", accessToken);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("passjavachannel:accesstoken:save")
    public R save(@RequestBody AccessTokenEntity accessToken){
		accessTokenService.save(accessToken);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("passjavachannel:accesstoken:update")
    public R update(@RequestBody AccessTokenEntity accessToken){
		accessTokenService.updateById(accessToken);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("passjavachannel:accesstoken:delete")
    public R delete(@RequestBody Long[] ids){
		accessTokenService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
