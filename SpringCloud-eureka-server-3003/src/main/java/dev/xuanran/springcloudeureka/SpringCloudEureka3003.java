package dev.xuanran.springcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by XuanRan on 2022/8/15
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer
public class SpringCloudEureka3003 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka3003.class, args);
    }
}
