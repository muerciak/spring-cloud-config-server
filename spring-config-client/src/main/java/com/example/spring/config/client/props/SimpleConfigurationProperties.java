package com.example.spring.config.client.props;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotBlank;

@ConfigurationProperties("com.example.app.prefix")
@Getter
@Setter
@Configuration
public class SimpleConfigurationProperties {

    @NotBlank
    private String testStr;

    private Integer testInt;
}
