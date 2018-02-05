package cn.myviolin.daoImpl.country;


import cn.myviolin.base.BaseDaoImpl;
import cn.myviolin.db.mapper.CountryMapper;
import cn.myviolin.model.country.Country;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  class CountryDaoImpl extends BaseDaoImpl implements CountryMapper {

    public int deleteByPrimaryKey(Object o) {
        return 0;
    }

    public int delete(Country country) {
        return 0;
    }

    public int insert(Country country) {
        return 0;
    }

    public int insertSelective(Country country) {
        return 0;
    }

    public boolean existsWithPrimaryKey(Object o) {
        return false;
    }

    public List<Country> selectAll() {
        return null;
    }

    public Country selectByPrimaryKey(Object o) {
        return null;
    }

    public int selectCount(Country country) {
        return 0;
    }

    public List<Country> select(Country country) {
        return null;
    }

    public Country selectOne(Country country) {
        return null;
    }

    public int updateByPrimaryKey(Country country) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Country country) {
        return 0;
    }

    public int deleteByExample(Object o) {
        return 0;
    }

    public List<Country> selectByExample(Object o) {
        return null;
    }

    public int selectCountByExample(Object o) {
        return 0;
    }

    public Country selectOneByExample(Object o) {
        return null;
    }

    public int updateByExample(Country country, Object o) {
        return 0;
    }

    public int updateByExampleSelective(Country country, Object o) {
        return 0;
    }

    public List<Country> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
        return null;
    }

    public List<Country> selectByRowBounds(Country country, RowBounds rowBounds) {
        return null;
    }

    public int insertList(List<Country> list) {
        return 0;
    }

    public int insertUseGeneratedKeys(Country country) {
        return 0;
    }
}