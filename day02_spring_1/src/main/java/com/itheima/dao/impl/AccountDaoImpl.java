package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private QueryRunner runner = null;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public List<Account> findAll() {
        try{
            return runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Account findById(Integer aid) {
        try {
            return runner.query("select * from account where id = ?",new BeanHandler<Account>(Account.class),aid);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addAccount(Account account) {
        try {
            runner.update("insert into account(name,money)values(?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Account account) {
        try{
            runner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Integer id) {
        try{
            runner.update("delete from account where id=?",id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
