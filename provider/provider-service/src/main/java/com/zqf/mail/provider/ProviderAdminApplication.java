package com.zqf.mail.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 *
 * <p>
 * Description:
 * </p>
 *
 * @author Administrator
 * @version v1.0.0
 * @since 2020-03-03 17:56:32
 * @see com.zqf.mail.provider
 *
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zqf.mail.provider.mapper")
public class ProviderAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderAdminApplication.class,args);
    }
}
