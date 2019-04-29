package com.itheima.service.impl;

import com.itheima.service.AccountService;
import org.springframework.stereotype.Service;

@Service("Account")
public class AccountServiceImpl implements AccountService {
    public void findAll() {
        System.out.println("查询所有信息");
//        int i = 1/0;
    }

    public void findbyId(int id) {
        System.out.println("根据id查询用户信息");
    }

    public int findByName() {
        System.out.println("查询用户信息返回");
        return 0;
    }
}
