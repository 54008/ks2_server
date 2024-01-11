package com.pcx.factory;

import com.pcx.mapper.ProvincesMapper;
import com.pcx.mapper.base.ProvincesBaseMapper;


public class ProvincesMybatisFactory {
    private static ProvincesBaseMapper provincesMapper;
    public static void Init(){
        provincesMapper =SqlSessionFactory.getSqlSession().getMapper(ProvincesBaseMapper.class);
    }
    
    public static ProvincesBaseMapper get()
    {
        return provincesMapper;
    }

}
