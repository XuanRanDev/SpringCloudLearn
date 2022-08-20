package dev.xuanran.springcloudapi.service;

import dev.xuanran.springcloudapi.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT")
public interface DeptFeignService {

    @GetMapping("/provider/getDeptById/{id}")
    Dept getDeptById(@PathVariable("id") int id);

    @GetMapping("/provider/getDeptList")
    List<Dept> getDeptList();
}
