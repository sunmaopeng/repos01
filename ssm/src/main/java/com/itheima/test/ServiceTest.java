package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ServiceTest {

    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService service = ac.getBean("accountService", AccountService.class);
        service.findAll();
    }

    @Test
    public void test2() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
//        List<Account> all = mapper.findAll();
//        for (Account account : all) {
//            System.out.println(account);
//        }
        Account account = new Account();
        account.setName("xiaoh");
        account.setMoney(1000.0);
        mapper.saveAccount(account);
        sqlSession.commit();

        is.close();
        sqlSession.close();
    }
}
