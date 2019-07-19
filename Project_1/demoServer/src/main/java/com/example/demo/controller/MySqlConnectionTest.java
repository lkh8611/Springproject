package com.example.demo.controller;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnectionTest {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/userdb";
    //jdbc:mysql://127.0.0.1:3306/userdb
    private static final String USER = "root";
    private static final String PW = "qwer1234";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);

        try(Connection conn = DriverManager.getConnection(URL, USER, PW)) {
            System.out.println(conn);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


}
