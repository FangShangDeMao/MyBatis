package com.fsdm.dao;

import com.fsdm.pojo.Country;
import com.fsdm.pojo.Provincial;

/**
 * @author 房上的猫
 * @create 2018-08-24 9:54
 * @博客地址: https://www.cnblogs.com/lsy131479/
 **/

public interface CountryMapper {
    Provincial selectByPId(int cid);
}
