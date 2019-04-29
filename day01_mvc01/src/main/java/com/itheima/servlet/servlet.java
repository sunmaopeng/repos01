package com.itheima.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class servlet {

    @RequestMapping(path = "/text/{id}")
    public String text(@PathVariable(value = "id") String aa){
        System.out.println(aa);
        return "a";
    }
}
