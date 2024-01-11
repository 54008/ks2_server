package com.pcx.factory;

import com.pcx.model.Userstats;
import org.apache.ibatis.session.SqlSession;

public class SqlSessionFactory {
    private static SqlSession sqlSession;

    public static void Init(org.apache.ibatis.session.SqlSessionFactory sqlSessionFactory) {

        sqlSession = sqlSessionFactory.openSession();
        UserMybatisFactory.Init();
        ProvincesMybatisFactory.Init();
        UserInfoMybatisFactory.Init();
        UserstatsMybatisFactory.Init();


    }
    static  SqlSession getSqlSession(){
        return sqlSession;
    }
}
