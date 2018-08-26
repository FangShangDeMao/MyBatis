package com.fsdm;

import com.fsdm.dao.CountryMapper;
import com.fsdm.pojo.Country;
import com.fsdm.pojo.Provincial;
import com.fsdm.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {
    SqlSession sqlSession = null;
    CountryMapper mapper = null;

    @Before
    public void before() {
        sqlSession = SessionFactoryUtil.getSession();
        mapper = sqlSession.getMapper(CountryMapper.class);
    }

    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void selectByCIdLazy(){
        Provincial provincial = mapper.selectByPId(1);
        System.out.println(provincial.getpName());
        System.out.println(provincial.getCountry());
    }
}
