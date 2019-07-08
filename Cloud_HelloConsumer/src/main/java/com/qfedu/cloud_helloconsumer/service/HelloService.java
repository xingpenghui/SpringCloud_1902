package com.qfedu.cloud_helloconsumer.service;

import com.qfedu.cloud_helloconsumer.entity.Student;
import com.qfedu.cloud_helloconsumer.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *@Author feri
 *@Date Created in 2019/7/8 15:58
 */
@FeignClient(name = "HelloProvider")
public interface HelloService {
    @GetMapping("provider/hello")
    R hello();
    @GetMapping("/provider/page")
    R page(@RequestParam("page") int page, @RequestParam("count") int count);
    @PostMapping("/provider/add")
    R save(@RequestBody Student student);
}
