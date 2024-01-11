package com.pcx.factory;

import com.pcx.mapper.UserstatsMapper;
import com.pcx.mapper.base.UserstatsBaseMapper;


public class UserstatsMybatisFactory {
    private static UserstatsBaseMapper userstatsMapper;
    
    public static void Init(){
        userstatsMapper =SqlSessionFactory.getSqlSession().getMapper(UserstatsBaseMapper.class);
    }
    public static UserstatsBaseMapper get()
    {
        return userstatsMapper;
    }

}
