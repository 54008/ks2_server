package com.pcx.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.pcx.model.Userinfo;
/**
*  @author pcx
*/
public interface UserinfoBaseMapper {

    int insertUserinfo(Userinfo object);

    int updateUserinfo(Userinfo object);

    int update(Userinfo.UpdateBuilder object);

    List<Userinfo> queryUserinfo(Userinfo object);

    Userinfo queryUserinfoLimit1(Userinfo object);

}