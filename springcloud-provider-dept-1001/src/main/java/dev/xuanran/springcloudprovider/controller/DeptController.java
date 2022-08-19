package dev.xuanran.springcloudprovider.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/getDeptById/{id}")
    public Dept getDeptById(@PathVariable("id") int id) {
        QueryWrapper<Dept> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        return deptMapper.selectOne(queryWrapper).setDbSource("dept-1001");
    }

    @PostMapping("/addNewDept")
    public R addNewDept(Dept dept) {
        if (dept == null) return R.error().setMessage("请传入参数");
        deptMapper.insert(dept);
        return R.ok();
    }

    @GetMapping("/getDeptList")
    public List<Dept> getDeptList() {
        return deptMapper.selectList(null);
    }


    @GetMapping("/getClient")
    public DiscoveryClient getClientList() {
        List<String> services = client.getServices();
        System.out.println("client list => " + services);

        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPE-1001");

        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri() + "\t");
        }
        return this.client;

    }
}
