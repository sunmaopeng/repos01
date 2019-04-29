package com.itheima.factory;

import com.itheima.service.AccountSerbice;
import com.itheima.service.impl.AccountSerbiceImpl;

public class AccountStaticFactory {
    public static AccountSerbice get(AccountSerbiceImpl as){
        return as;
    }
}
