package dev.xuanran.springcloudcustomer.controller;

import com.netflix.discovery.converters.Auto;
import dev.xuanran.springcloudapi.pojo.Dept;
import dev.xuanran.springcloudapi.service.DeptFeignService;
import dev.xuanran.springcloudapi.util.R;
import dev.xuanran.springcloudcustomer.config.RequestUrlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by XuanRan on 2022/8/14
 */
@RestController
@RequestMapping("/customer")
public class DeptController {

    @Autowired
    private DeptFeignService deptFeignService;

    @GetMapping("/getDeptList")
    public List<Dept> getDeptList() {
        return deptFeignService.getDeptList();
    }

    @GetMapping("/getDeptById/{id}")
    public Dept getDeptById(@PathVariable("id") int id) {
        return deptFeignService.getDeptById(id);
    }

}
