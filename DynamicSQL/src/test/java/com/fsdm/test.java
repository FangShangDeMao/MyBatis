package com.fsdm;

import com.fsdm.dao.UserMapper;
import com.fsdm.pojo.Users;
import com.fsdm.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    SqlSession sqlSession = null;
    UserMapper mapper = null;

    @Before
    public void before() {
        sqlSession = SessionFactoryUtil.getSession();
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 查询 where+if+trim
     */
    @Test
    public void findUSersByCondition() {
        Users users = new Users();
        users.setUserName("Mapper测试1");
        users.setPassword("测试数据1");
        List<Users> list = mapper.findUsersByCondition(users);
        System.out.println(list);
    }

    /**
     * 修改 update  set+if+trim
     */
    @Test
    public void updateBySet() {
        Users users = new Users();
        users.setId(12);
        users.setUserName("Mapper测试1111");
        mapper.updateBySet(users);
    }

    /**
     * choose +when +otherwise+where
     */
    @Test
    public void selectByChoose() {
        Users users = new Users();
        users.setId(12);
        users.setUserName("Mapper测试1111");
        mapper.selectByChoose(users);
    }
    /**
     * foreach+array
     */
    @Test
    public void selectByArray() {
        int[] ids = {6,9};

        List<Users> list = mapper.selectByArray(ids);
        System.out.println(list);
    }
    /**
     * foreach+list
     */
    @Test
    public void selectByList() {
        List<String> ids = new ArrayList<>();
        ids.add("aaa");
        ids.add("qq");

        List<Users> list = mapper.selectByList(ids);
        System.out.println(list);
    }
    /**
     * foreach+list+对象
     */
    @Test
    public void insertByList() {
        List<Users> ids = new ArrayList<>();
        ids.add(new Users("x","x"));
        ids.add(new Users("y","y"));
        ids.add(new Users("z","z"));
        ids.add(new Users("qe","e"));

        int list = mapper.insertByList(ids);
        System.out.println(list);
    }
    /**
     * foreach+map
     */
    @Test
    public void selectByMap() {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",6);
        map.put("b",11);
        map.put("c",13);
        List<Users> list = mapper.selectByMap(map);
        System.out.println(list);
    }
    /**
     * foreach+map+对象
     */
    @Test
    public void selectByMapUsers() {
        Map<String,Users> map = new HashMap<>();
        map.put("a",new Users(6));
        map.put("b",new Users(11));
        map.put("c",new Users(13));
        List<Users> list = mapper.selectByMapUsers(map);
        System.out.println(list);
    }
}
