package com.example.springbootwebreqresp.Controller;

import com.example.springbootwebreqresp.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    // 原始方法
//    @RequestMapping("/simpleParm/")
//    public String simpleParm(HttpServletRequest request){
//        // 获取参数
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name + ":" + age);
//        return "OK";
//    }

    // springboot 方法
    @RequestMapping("/simpleParm/")
    public String simpleParm(String name, Integer age){

        System.out.println(name + ":" + age);
        return "OK";
    }

    // springboot 方法
    @RequestMapping("/complexParm/")
    public String complexParm(User user){
        System.out.println(user);
        return "OK";
    }

    // JSON参数
    @RequestMapping("/jsonParm/")
    public String jsonParm(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    // 路径参数
    @RequestMapping("/path/{id}/")
    public String pathParam(@PathVariable Integer id){
        System.out.println(id);
        return "OK";
    }

}
