package com.fsdm.dao;

import com.fsdm.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 房上的猫
 * @create 2018-08-19 10:53
 * @博客地址: https://www.cnblogs.com/lsy131479/
 **/

public interface IUsersMapper {
    /**
     * 登陆
     */
    Users login(@Param("name")String name,@Param("pwd") String pwd);

    /**
     * 查询所有
     */
    List<Users> findAll();

    /**
     * 按条件查询
     */
    List<Users> findBy(Users users);

    /**
     * 按条件删除
     *
     */
    int delBy(Users users);

    /**
     * 按条件修改
     */
    int upBy(@Param("newss")Users uNew,@Param("by")Users uBy);
}
