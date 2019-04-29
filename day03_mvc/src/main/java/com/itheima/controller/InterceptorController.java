package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {

    @RequestMapping("text")
    public String text(){
        System.out.println("方法执行了");
        return "success";
    }
}
