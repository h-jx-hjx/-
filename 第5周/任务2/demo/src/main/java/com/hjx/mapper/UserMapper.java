package com.hjx.mapper;

import com.hjx.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {

    User Sel(int id);
}