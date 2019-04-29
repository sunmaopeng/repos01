package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;
    @RequestMapping("/text")
    public String accountTest() throws Exception {
        System.out.println("controller方法执行");

        try {
            int i = 10/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("0不能做除数");
        }
//        accountService.saveAccount(account);
//        List<Account> all = accountService.findAll();
//        System.out.println(all);
//        model.addAttribute("list",all);
        return "success";
    }
}
