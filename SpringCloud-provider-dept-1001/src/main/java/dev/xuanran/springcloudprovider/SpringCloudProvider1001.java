package dev.xuanran.springcloudprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by XuanRan on 2022/8/14
 */
@SpringBootApplication
@MapperScan("dev.xuanran")
public class SpringCloudProvider1001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider1001.class, args);
    }
}
