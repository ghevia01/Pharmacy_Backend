package com.orderapp.pharmacy.security.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "jwt")
@PropertySource(value = "classpath:application-dev.yaml", factory = YamlPropertySourceFactory.class)
public class JwtProperties {
    private String cookiename;
    private String secretkey;
}
