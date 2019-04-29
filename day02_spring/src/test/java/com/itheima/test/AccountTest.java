package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountTest {
    @Test
    public void findAtest(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("Bean.xml");
        AccountService accountService = (AccountService) ca.getBean("accountService");
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }

    @Test
    public void findById(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("Bean.xml");
        AccountService accountService = (AccountService) ca.getBean("accountService");
        Account byId = accountService.findById(1);
        System.out.println(byId);
    }
}
