package cn.myviolin.db.mapper;

import cn.myviolin.db.base.BaseViolinMapper;
import cn.myviolin.model.country.Country;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface CountryMapper extends BaseViolinMapper<Country> {
}