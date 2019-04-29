package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

    @Test
   public void daoTest(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = ca.getBean(ItemsDao.class);
        Items items = itemsDao.findByid(1);
        System.out.println(items);
    }


    @Test
    public void serviceTest(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService ItemsService = ca.getBean(ItemsService.class);
        Items items = ItemsService.findByid(1);
        System.out.println(items);
    }
}
