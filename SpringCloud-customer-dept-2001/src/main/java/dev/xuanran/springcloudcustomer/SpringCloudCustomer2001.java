package dev.xuanran.springcloudcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * Created by XuanRan on 2022/8/14
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringCloudCustomer2001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCustomer2001.class, args);
    }
}
