package com.hjx.dao;

import com.hjx.pojo.Good;

import java.util.List;

public interface GoodDao {
    public List<Good> queryByName(String userid);
}
