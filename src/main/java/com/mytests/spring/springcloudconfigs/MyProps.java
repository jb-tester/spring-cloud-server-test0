package com.mytests.spring.springcloudconfigs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 23.11.2021.</p>
 * <p>Project: spring-cloud-configs</p>
 * *
 */
@Component @ConfigurationProperties("my.props")
public class MyProps {
    String prop1;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }
}
