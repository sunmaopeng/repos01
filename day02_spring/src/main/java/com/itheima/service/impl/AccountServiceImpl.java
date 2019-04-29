package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    AccountDao ad = null;


    public void setAd(AccountDao ad) {
        this.ad = ad;
    }

    public List<Account> findAll() {
        return ad.findAll();
    }

    public Account findById(Integer aid) {
        return ad.findById(aid);
    }

    public void addAccount(Account account) {
        ad.addAccount(account);
    }

    public void update(Account account) {
        ad.update(account);
    }

    public void delete(Integer id) {
        ad.delete(id);
    }
}
