package com.zqf.mail.provider.service;

import com.zqf.mail.provider.api.MailBannerService;
import com.zqf.mail.provider.domain.MailBanner;
import com.zqf.mail.provider.mapper.MailBannerMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * <p>
 * Description: 首页轮播图
 * </p>
 * 
 * @author Administrator
 * @version v1.0.0
 * @since 2020-03-03 17:05:41
 * @see com.zqf.mail.provider.service
 *
 */
@Service
public class MailBannerServiceImpl implements MailBannerService {

    @Resource
    private MailBannerMapper mailBannerMapper;


    @Override
    public List<MailBanner> get() {
        return mailBannerMapper.selectAll();
    }
}
