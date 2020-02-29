package com.zqf.mail.common.dto;

import java.io.Serializable;

/**
 *
 * <p>
 * Description: IP 地址信息
 * </p>
 *
 * @author Bill Chiu
 * @version v1.0.0
 * @since 2020-02-29 21:47:54
 * @see com.zqf.mail.common.dto
 *
 */
public class IpInfo implements Serializable {
    private static final long serialVersionUID = -6246313701294144575L;

    private String ip;
    private String country;
    private String area;
    private String region;
    private String city;
    private String county;
    private String isp;
    private String country_id;
    private String area_id;
    private String region_id;
    private String city_id;
    private String county_id;
    private String isp_id;
}
