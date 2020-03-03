package com.zqf.mail.provider.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
/**
 *
 * <p>
 * Description: 今日推荐
 * </p>
 *
 * @author Administrator
 * @version v1.0.0
 * @since 2020-03-03 17:42:15
 * @see com.zqf.mail.provider.domain
 *
 */
@Data
@Table(name = "mail_recommend")
public class MailRecommend implements Serializable {
    /**
     * 标题
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 图片地址
     */
    @Column(name = "image")
    private String image;

    /**
     * 点击地址
     */
    @Column(name = "link")
    private String link;

    /**
     * 分类
     */
    @Column(name = "sort")
    private Integer sort;

    @Column(name = "title")
    private String title;

    private static final long serialVersionUID = 1L;
}