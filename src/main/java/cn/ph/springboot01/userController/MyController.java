package cn.ph.springboot01.userController;

import cn.ph.springboot01.userBean.student;
import cn.ph.springboot01.userService.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 练习
 * @Author 22356
 * @Date 2020/3/18 13:12
 */

@RestController
public class MyController {
    @Autowired
    userservice service;

    @RequestMapping("/hello")
    public String hello(){
        return "HELLO WORD!";
    }

    @GetMapping("/findById/{id}")
    public student findById(@PathVariable("id") Integer id){
        return service.queryById(id);
    }

    @GetMapping("/findAll")
    public List<student> findAll(){
        return service.queryAll();
    }

    @GetMapping("/add")
    public String add(student student){
        service.add(student);
        return "添加成功"+":"+ student.getName()+"=="+ student.getGender();
    }

    @GetMapping("/updata")
    public String updata(student student){
        service.updata(student);
        return "ID为："+ student.getId()+"  的用户成功修改为   >>>"+ student.getName()+"=="+ student.getGender();
    }

    @GetMapping("/del/{id}")
    public String delete(@PathVariable("id") Integer id){
        student student =findById(id);
        service.delById(id);
        return student.getName()+"=="+ student.getGender()+"   >>>   "+"删除成功";
    }
}
