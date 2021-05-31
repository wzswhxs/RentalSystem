package com.rentalsystem.dao;

import java.sql.*;


public class UserDao extends BaseDao{
    Connection conn  =null;
    public	void select() {
        ResultSet rs = null;
        PreparedStatement ps = null;
//        String url = "com.mysql.cj..Driver";
//        try {
//            Class.forName(url);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        conn= DriverManager.getConnection()
//        conn = this.getConnection(calssName);
        conn=this.getConnection();
        try {
            ps = conn.prepareStatement("select * from tb_users");
            rs=ps.executeQuery();
            while(rs.next()) {
                rs.getString(3);
                System.out.println(rs.getString(2) +"," +rs.getString(3));

            }
        } catch (SQLException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();

            }

        }
    }

}
