package dev.xuanran.springcloudapi.service;

import dev.xuanran.springcloudapi.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",path = "/provider")
public interface DeptFeignService {

    @GetMapping("/getDeptById/{id}")
    Dept getDeptById(@PathVariable("id") int id);

    @GetMapping("/getDeptList")
    List<Dept> getDeptList();
}
