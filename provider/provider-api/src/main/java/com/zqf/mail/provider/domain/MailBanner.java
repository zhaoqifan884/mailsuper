package com.zqf.mail.provider.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
/**
 *
 * <p>
 * Description: 首页轮播图
 * </p>
 *
 * @author Administrator
 * @version v1.0.0
 * @since 2020-03-03 17:04:45
 * @see com.zqf.mail.provider.domain
 *
 */
@Data
@Table(name = "mail_banner")
public class MailBanner implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 高度
     */
    @Column(name = "height")
    private Integer height;

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
     * 标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 宽度
     */
    @Column(name = "width")
    private Integer width;

    private static final long serialVersionUID = 1L;
}