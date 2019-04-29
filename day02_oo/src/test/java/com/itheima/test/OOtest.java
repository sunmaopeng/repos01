package com.itheima.test;

import oracle.jdbc.OracleTypes;
import org.junit.Test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class OOtest {

    @Test
    public void test() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.192.128:1521:orcl", "itheima", "itheima");
        CallableStatement call = connection.prepareCall("{call p2(?, ?)}");
        call.setObject(1,7788);
        call.registerOutParameter(2, OracleTypes.NUMBER);
        call.execute();
        System.out.println(call.getObject(2));
        call.close();
        connection.close();
    }
}
