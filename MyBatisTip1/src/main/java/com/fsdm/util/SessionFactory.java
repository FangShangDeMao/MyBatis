package com.fsdm.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 房上的猫
 * @create 2018-08-19 10:49
 * @博客地址: https://www.cnblogs.com/lsy131479/
 * <p>
 * mybatis交互数据库工厂
 **/

public class SessionFactory {
    private SessionFactory() {
    }

    private static SqlSessionFactory factory;
    static {
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis.xml");
            factory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized SqlSession getSession(){
        return factory.openSession();
    }
}
