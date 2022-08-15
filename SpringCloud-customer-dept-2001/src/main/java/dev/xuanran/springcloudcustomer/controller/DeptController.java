package dev.xuanran.springcloudcustomer.controller;

import dev.xuanran.springcloudapi.pojo.Dept;
import dev.xuanran.springcloudapi.util.R;
import dev.xuanran.springcloudcustomer.config.RequestUrlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by XuanRan on 2022/8/14
 */
@RestController
@RequestMapping("/customer")
public class DeptController {
    @Autowired
    private RestTemplate restTemplate;

    private static String REQUEST_URL = RequestUrlConfig.REQUEST_HOST_PREFIX
            + RequestUrlConfig.REQUEST_PATH_PREFIX;

    @GetMapping("/getDeptList")
    public R getDeptList() {
        return R.ok().data("data", restTemplate.getForObject(REQUEST_URL + "/getDeptList", List.class));
    }

    @GetMapping("/getDeptById/{id}")
    public R getDeptById(@PathVariable("id") int id) {
        return R.ok().data("data", restTemplate.getForObject(REQUEST_URL + "/getDeptById/"+id,Dept.class));
    }

/*
    @PostMapping("/addNewDept")
    public R addNewDept(@RequestBody Dept dept) {
        return R.ok().data("data",restTemplate.postForObject(REQUEST_URL + "/addNewDept", dept, ))
    }*/

}
