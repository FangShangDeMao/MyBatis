package com.fsdm;

import com.fsdm.dao.CountryMapper;
import com.fsdm.pojo.Country;
import com.fsdm.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 房上的猫
 * @create 2018-08-24 9:18
 * @博客地址: https://www.cnblogs.com/lsy131479/
 **/

public class RelationTest {
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
    public void selectByCId(){
        Country country = mapper.selectByCId(1);
        System.out.println(country);
    }
    @Test
    public void selectByCIdLazy(){
        Country country = mapper.selectByCId(1);
        System.out.println(country.getcId());
        System.out.println(country.getProvincials());
    }
}
