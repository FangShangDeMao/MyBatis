package com.fsdm.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 房上的猫
 * @create 2018-08-16 16:50
 * @博客地址: https://www.cnblogs.com/lsy131479/
 * <p>
 * 链接数据库工具类
 **/

public class SessionFactory {
    private static SqlSessionFactory factory;

    private SessionFactory() {
    }

    public static SqlSession getSession() {
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis.xml");
            if (factory == null)
                factory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return factory.openSession();
    }

}
