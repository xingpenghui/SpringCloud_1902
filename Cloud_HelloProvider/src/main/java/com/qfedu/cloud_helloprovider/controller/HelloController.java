package com.qfedu.cloud_helloprovider.controller;

import com.qfedu.cloud_helloprovider.entity.Student;
import com.qfedu.cloud_helloprovider.vo.R;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/7/8 15:44
 */
@RestController
public class HelloController {
    @GetMapping("provider/hello")
    public R hello(){
        System.out.println("请求来了");
        return R.setOK("提供者",null);
    }
    @GetMapping("/provider/page")
    public R page(@RequestParam("page") int page, @RequestParam("count") int count){
        List<Student> studentList=new ArrayList<>();
        for(int i=(page-1)*count;i<=page*count;i++){
            Student student=new Student();
            student.setId(i);
            student.setName("西亚斯："+i);
            studentList.add(student);
        }
        return R.setOK("OK",studentList);
    }
    @PostMapping("/provider/add")
    public R save(@RequestBody Student student){
        System.out.println(student.toString());
        return R.setOK("OK",null);
    }

}
