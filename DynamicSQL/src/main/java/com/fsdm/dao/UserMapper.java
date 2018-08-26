package com.fsdm.dao;

import com.fsdm.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /**
     * where+if
     * @param users
     * @return
     */
    List<Users> findUsersByCondition(Users users);

    /**
     * set +if
     */
    int updateBySet (Users users);

    /**
     *
     */
    List<Users> selectByChoose(Users users);


    List<Users> selectByArray(int[] ids);
    List<Users> selectByList(List<String> list);

    int insertByList(List<Users> list);

    List<Users> selectByMap(@Param("myMap") Map<String,Integer> map);

    List<Users> selectByMapUsers(@Param("myMap") Map<String,Users> map);
}


