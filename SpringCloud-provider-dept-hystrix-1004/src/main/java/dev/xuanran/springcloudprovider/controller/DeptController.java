package dev.xuanran.springcloudprovider.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import dev.xuanran.springcloudapi.pojo.Dept;
import dev.xuanran.springcloudapi.util.R;
import dev.xuanran.springcloudprovider.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by XuanRan on 2022/8/14
 */
@RestController()
@RequestMapping("/provider")
public class DeptController {
    @Autowired
    private DeptMapper deptMapper;

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/getDeptById/{id}")
    @HystrixCommand(fallbackMethod = "getDeptByIdError")
    public Dept getDeptById(@PathVariable("id") int id) {
        QueryWrapper<Dept> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        Dept dept = deptMapper.selectOne(queryWrapper).setDbSource("dept-1004");
        if (dept == null) {
            throw new RuntimeException("Dept id is null !");
        }
        return dept;
    }

    public Dept getDeptByIdError(@PathVariable("id") int id) {
        return new Dept("null:" + id).setDbSource("dept-1004-hystrix-hook");
    }

}
