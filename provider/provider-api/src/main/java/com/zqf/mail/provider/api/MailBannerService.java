package com.zqf.mail.provider.api;

import com.zqf.mail.provider.domain.MailBanner;

import java.util.List;

/**
 *
 * <p>
 * Description: 首页轮播图
 * </p>
 *
 * @author Administrator
 * @version v1.0.0
 * @since 2020-03-03 17:04:07
 * @see com.zqf.mail.provider.api
 *
 */
public interface MailBannerService{

    /**
     * 获取轮播图信息
     * @return
     */
    List<MailBanner> get();


}
