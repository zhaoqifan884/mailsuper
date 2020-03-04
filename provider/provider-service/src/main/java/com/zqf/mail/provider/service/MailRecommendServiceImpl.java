package com.zqf.mail.provider.service;

import com.zqf.mail.provider.api.MailRecommendService;
import com.zqf.mail.provider.domain.MailRecommend;
import com.zqf.mail.provider.mapper.MailRecommendMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

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
public class MailRecommendServiceImpl implements MailRecommendService {

    @Resource
    private MailRecommendMapper mailRecommendMapper;

    @Override
    public List<MailRecommend> get() {
        return mailRecommendMapper.selectAll();
    }
}
