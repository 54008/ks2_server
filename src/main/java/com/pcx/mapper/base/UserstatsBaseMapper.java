package com.pcx.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.pcx.model.Userstats;
/**
*  @author pcx
*/
public interface UserstatsBaseMapper {

    int insertUserstats(Userstats object);

    int updateUserstats(Userstats object);

    int update(Userstats.UpdateBuilder object);

    List<Userstats> queryUserstats(Userstats object);

    Userstats queryUserstatsLimit1(Userstats object);

}