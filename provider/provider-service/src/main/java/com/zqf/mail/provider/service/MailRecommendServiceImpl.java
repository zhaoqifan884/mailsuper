package com.zqf.mail.provider.service;

import com.zqf.mail.provider.mapper.MailRecommendMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
/**
 *
 * <p>
 * Description:  今日推荐
 * </p>
 *
 * @author Administrator
 * @version v1.0.0
 * @since 2020-03-03 17:41:23
 * @see com.zqf.mail.provider.service
 *
 */
@Service
public class MailRecommendServiceImpl {

    @Resource
    private MailRecommendMapper mailRecommendMapper;

}
