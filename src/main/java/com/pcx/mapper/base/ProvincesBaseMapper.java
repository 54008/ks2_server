package com.pcx.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.pcx.model.Provinces;
/**
*  @author pcx
*/
public interface ProvincesBaseMapper {

    int insertProvinces(Provinces object);

    int updateProvinces(Provinces object);

    int update(Provinces.UpdateBuilder object);

    List<Provinces> queryProvinces(Provinces object);

    Provinces queryProvincesLimit1(Provinces object);

}