package com.hjx.test;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        String url="jdbc:mysql://localhost:3306/demo";
        String username="root";
        String password="hjx2001424";
        boolean flag=false;
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        String sql="select * from users";
        ResultSet rs=statement.executeQuery(sql);
        Scanner sc=new Scanner(System.in);
        Object id01 = sc.nextInt();

        while (rs.next()){

            if(id01==rs.getObject("id")){
                System.out.println("找到了"+rs.getObject("id"));
                flag=true;
            }
        }
        if (flag=false){
            System.out.println ("没找到");
        }
        //建立连接
        // return DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=UTC&characterEncoding=utf-8","root","hjx2001424");
        rs.close();
        statement.close();
        connection.close();
    }
}
