package com.pcx.factory;


import com.pcx.mapper.base.UserBaseMapper;

public class UserMybatisFactory {
    private static UserBaseMapper userBaseMapper;
    public static void Init(){
        userBaseMapper =SqlSessionFactory.getSqlSession().getMapper(UserBaseMapper.class);
    }
    public static UserBaseMapper get()
    {
        return userBaseMapper;
    }
}
