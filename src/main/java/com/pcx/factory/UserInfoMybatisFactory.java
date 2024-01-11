package com.pcx.factory;

import com.pcx.mapper.UserinfoMapper;
import com.pcx.mapper.base.UserinfoBaseMapper;

public class UserInfoMybatisFactory {
    private static UserinfoBaseMapper userinfoMapper;
    
    public static void Init(){
        userinfoMapper =SqlSessionFactory.getSqlSession()
                .getMapper(UserinfoBaseMapper.class);
    }
    public static UserinfoBaseMapper get()
    {
        return userinfoMapper;
    }

}
