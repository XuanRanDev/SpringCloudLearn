package dev.xuanran.springcloudcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by XuanRan on 2022/8/14
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients(basePackages = {"dev.xuanran"})
@EnableEurekaClient
public class SpringCloudFeignCustomer2002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignCustomer2002.class, args);
    }
}
