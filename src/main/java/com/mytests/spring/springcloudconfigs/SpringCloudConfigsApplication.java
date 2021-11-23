package com.mytests.spring.springcloudconfigs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigsApplication.class, args);
    }

}
