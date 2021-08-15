package com.hjx.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButils {
   private final static String url="jdbc:mysql://localhost:3306/demo";
    private final static String username="root";
    private final static String password="hjx2001424";
    public static  Connection getConnection(){
        Connection conn=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                 conn= DriverManager.getConnection(url,username,password);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return conn;

    }

    public static void main(String[] args) {
        DButils.getConnection();
    }

}
