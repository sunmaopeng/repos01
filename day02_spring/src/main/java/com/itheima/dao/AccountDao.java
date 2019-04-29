package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 根据id查询信息
     * @param aid
     * @return
     */
    Account findById(Integer aid);

    /**
     * 添加用户
     * @param account
     */
    void addAccount(Account account);

    /**
     * 更新用户信息
     * @param account
     */
    void update(Account account);

    /**
     * 根据id删除用户
     * @param id
     */
    void delete(Integer id);
}
