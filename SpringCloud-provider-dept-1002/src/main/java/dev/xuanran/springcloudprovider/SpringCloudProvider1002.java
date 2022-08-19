package dev.xuanran.springcloudprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by XuanRan on 2022/8/14
 */
@SpringBootApplication //Spring App
@MapperScan("dev.xuanran") // Mapper scan
@EnableEurekaClient // eureka client
@EnableDiscoveryClient // open service register
public class SpringCloudProvider1002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider1002.class, args);
    }
}
