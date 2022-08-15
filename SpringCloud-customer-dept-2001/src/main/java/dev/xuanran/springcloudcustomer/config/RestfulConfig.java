package dev.xuanran.springcloudcustomer.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by XuanRan on 2022/8/14
 */
@Configuration
public class RestfulConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
