package com.itheima.run;

import com.itheima.service.AccountSerbice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ca = new ClassPathXmlApplicationContext("bean.xml");
        AccountSerbice account = (AccountSerbice)ca.getBean("account");
        account.addCount();
    }
}
