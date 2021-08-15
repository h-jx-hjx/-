package com.hjx.dao;

import com.hjx.pojo.Good;
import com.hjx.utils.DButils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodDaoImp1 implements GoodDao {
    @Override
    public List<Good> queryByName(String userid) {
        List<Good> goodList=new ArrayList<Good>();
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String sql="select * from user where userid like ?";


        try {
            conn= DButils.getConnection();
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, "%"+userid+"%");
            rs=pstmt.executeQuery();
            while (rs.next()){
                goodList.add(new Good(rs.getInt(1),rs.getString(2)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return goodList;
    }
}
