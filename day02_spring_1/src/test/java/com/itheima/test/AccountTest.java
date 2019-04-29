package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountTest {

    @Test
    public void findAll(){
//        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("bean.xml");
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService as = anno.getBean("accountService", AccountService.class);
        List<Account> acc = as.findAll();
        for (Account account : acc) {
            System.out.println(account);
        }
    }

    @Test
    public void addTest(){
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService as = anno.getBean("accountService", AccountService.class);
        Account account = new Account();
        account.setMoney(12345f);
        account.setName("ddd");
        as.addAccount(account);
    }


    @Test
    public void addDelete(){
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService as = anno.getBean("accountService", AccountService.class);
        as.delete(5);
    }
}
