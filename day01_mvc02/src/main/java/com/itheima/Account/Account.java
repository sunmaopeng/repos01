package com.itheima.Account;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable{
        private Integer id;
        private String name;
        private Integer money;
        private Date date;

        @Override
        public String toString() {
            return "account{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", money=" + money +
                    ", date=" + date +
                    '}';
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getMoney() {
            return money;
        }

        public void setMoney(Integer money) {
            this.money = money;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

}
