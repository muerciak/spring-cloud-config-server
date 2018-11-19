package com.example.spring.config.client.rest;

import com.example.spring.config.client.props.SimpleConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RefreshScope
public class RestEndpoint {

    @Autowired
    SimpleConfigurationProperties properties;

    @Value("${testValue}")
    String testValue;

    @GetMapping("/confProps")
    String getPropFromConfProperties() {
        return properties.getTestStr() + " = " + properties.getTestInt();
    }

    @GetMapping("/value")
    String getValueProps() {
        return testValue;
    }
}
