package com.itheima.text;

import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext ca = new ClassPathXmlApplicationContext("bean.xml");
        AccountService account = (AccountService) ca.getBean("Account");
        account.findAll();

    }
}
