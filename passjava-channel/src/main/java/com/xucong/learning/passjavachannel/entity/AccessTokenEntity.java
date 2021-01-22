package com.xucong.learning.passjavachannel.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 渠道-认证表
 * 
 * @author xucong_i
 * @email 499876346@qq.com
 * @date 2021-01-15 23:52:19
 */
@Data
@TableName("chms_access_token")
public class AccessTokenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * access_token
	 */
	private String accessToken;
	/**
	 * 到期时间
	 */
	private Date expireTime;
	/**
	 * 渠道id
	 */
	private Long channelId;
	/**
	 * 删除标记（0-正常，1-删除）
	 */
	private Integer delFlag;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
