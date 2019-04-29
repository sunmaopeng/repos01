package com.itheima.servlet;

import com.itheima.Account.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class servletText {

    @RequestMapping("/text")
    public String text(Account account){
        System.out.println(account);
        return "a";
    }
}
