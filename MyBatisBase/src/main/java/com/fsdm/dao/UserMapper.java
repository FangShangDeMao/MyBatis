package com.fsdm.dao;

import com.fsdm.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author 房上的猫
 * @create 2018-08-16 16:55
 * @博客地址: https://www.cnblogs.com/lsy131479/
 **/

public interface UserMapper {
    List<Users> findAll();

    Users findById(Serializable serializable);

    int add(Users users);

    int del(Serializable serializable);

    int up(Users users);

    Users findByTwo1(String userName, String pwd);

    Users findByTwo2(@Param("name") String userName, @Param("pwd") String pwd);

    Users findByMap1(Map<String, String> map);

    Users findByMap2(Map<String, Users> map);
}
