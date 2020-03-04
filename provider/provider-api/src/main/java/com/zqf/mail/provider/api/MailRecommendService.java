package com.zqf.mail.provider.api;

import com.zqf.mail.provider.domain.MailRecommend;

import java.util.List;

/**
 *
 * <p>
 * Description: 今日推荐
 * </p>
 *
 * @author Administrator
 * @version v1.0.0
 * @since 2020-03-03 17:42:40
 * @see com.zqf.mail.provider.api
 *
 */
public interface MailRecommendService {

    List<MailRecommend> get();

}
