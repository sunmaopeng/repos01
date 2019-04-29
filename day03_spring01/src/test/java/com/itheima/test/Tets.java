package com.itheima.test;

import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tets {
    public static void main(String[] args) {
        ApplicationContext ca = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService = (IAccountService) ca.getBean(IAccountService.class);
        accountService.transfer("aaa","bbb",100f);
    }
}
