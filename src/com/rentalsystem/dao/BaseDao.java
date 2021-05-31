package com.rentalsystem.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
public class BaseDao {
    private String className="com.mysql.cj.jdbc.Driver";
//    这个就是参数
    Connection conn = null;
    private String url = "jdbc:mysql://localhost:3306/rent";
    private String username = "root";
    private String pwd = "wzswhxs9979497";

    public Connection getConnection() {

        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(url, username, pwd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//修改后
        //颜色会变
        return conn;
    }
}
