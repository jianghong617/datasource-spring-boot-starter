package com.zero.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {@code DataSourceProperties}
 *
 * @author jianghong
 * @date 2023/09/21
 * @since 1.1.0
 */
@Data
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceProperties {

    private String driverClassName;
    private String url;
    private String username;
    private String password;
}