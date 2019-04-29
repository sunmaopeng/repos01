package com.itheima.factory;

import com.itheima.service.AccountSerbice;
import com.itheima.service.impl.AccountSerbiceImpl;

public class AccountFactory {

    public AccountSerbice get(AccountSerbiceImpl as){
        return as;
    }
}
