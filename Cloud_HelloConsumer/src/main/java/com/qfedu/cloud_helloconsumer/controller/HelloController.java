package com.qfedu.cloud_helloconsumer.controller;

import com.qfedu.cloud_helloconsumer.entity.Student;
import com.qfedu.cloud_helloconsumer.service.HelloService;
import com.qfedu.cloud_helloconsumer.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author feri
 *@Date Created in 2019/7/8 15:59
 */
@Api(value = "服务消费者",tags = "服务消费者")
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @ApiOperation(value = "无参",notes = "没有参数")
    @GetMapping("/hello.do")
    public R hello(){
        return helloService.hello();
    }

    @ApiOperation(value = "分页查询",notes = "普通参数")
    @GetMapping("/student/page.do")
    public R page(int page,int count){
        return helloService.page(page, count);
    }

    @ApiOperation(value = "保存学员",notes = "json参数")
    @PostMapping("student/save.do")
    public R save(@RequestBody Student student){
        return helloService.save(student);
    }

}
