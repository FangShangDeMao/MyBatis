package com.fsdm;

import com.fsdm.dao.UserMapper;
import com.fsdm.pojo.Users;
import com.fsdm.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 房上的猫
 * @create 2018-08-16 17:08
 * @博客地址: https://www.cnblogs.com/lsy131479/
 **/

public class test {

    private SqlSession session;
    private UserMapper mapper;

    @Before
    public void before() {
        session = SessionFactory.getSession();
        mapper = session.getMapper(UserMapper.class);
    }

    @After
    public void after() {
        session.close();
    }

    @Test
    public void a() {

        Users users = new Users();
        users.setUserName("S");
        users.setPassword("s");
        System.out.println(mapper.add(users));
        System.out.println("新插入数据ID" + users.getId());
        session.commit();
    }

    @Test
    public void b() {
        System.out.println(mapper.del(10));
        session.commit();
    }

    @Test
    public void c() {
        Users users = new Users();
        users.setId(10);
        users.setUserName("S");
        users.setPassword("s");
        System.out.println(mapper.up(users));
        session.commit();
    }

    @Test
    public void d() {
        System.out.println(mapper.findAll());
    }

    @Test
    public void e() {
        System.out.println(mapper.findById(5));
    }

    @Test
    public void f() {
        System.out.println(mapper.findByTwo1("qq", "qq"));
    }

    @Test
    public void g() {
        System.out.println(mapper.findByTwo2("qq", "qq"));
    }

    @Test
    public void h() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "qq");
        map.put("password", "qq");
        System.out.println(mapper.findByMap1(map));
    }

    @Test
    public void i() {
        Users users = new Users();
        users.setUserName("qq");
        users.setPassword("qq");
        Map<String, Users> map = new HashMap<>();
        map.put("users", users);
        System.out.println(mapper.findByMap2(map));
    }

}
