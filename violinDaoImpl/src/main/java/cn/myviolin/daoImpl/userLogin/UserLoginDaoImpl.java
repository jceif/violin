package cn.myviolin.daoImpl.userLogin;


import cn.myviolin.base.BaseDaoImpl;
import cn.myviolin.db.mapper.UserLoginMapper;
import cn.myviolin.model.userLogin.UserLogin;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jc on 2018/2/1 14:14
 * description 用户登录dao
 */
@Repository
public class UserLoginDaoImpl extends BaseDaoImpl implements UserLoginMapper{


    public int deleteByPrimaryKey(Object o) {
        return 0;
    }

    public int delete(UserLogin userLogin) {
        return 0;
    }

    public int insert(UserLogin userLogin) {
        return 0;
    }

    public int insertSelective(UserLogin userLogin) {
        return 0;
    }

    public boolean existsWithPrimaryKey(Object o) {
        return false;
    }

    public List<UserLogin> selectAll() {
        return null;
    }

    public UserLogin selectByPrimaryKey(Object o) {
        return null;
    }

    public int selectCount(UserLogin userLogin) {
        return 0;
    }

    public List<UserLogin> select(UserLogin userLogin) {
        return null;
    }

    public UserLogin selectOne(UserLogin userLogin) {
        return null;
    }

    public int updateByPrimaryKey(UserLogin userLogin) {
        return 0;
    }

    public int updateByPrimaryKeySelective(UserLogin userLogin) {
        return 0;
    }

    public int deleteByExample(Object o) {
        return 0;
    }

    public List<UserLogin> selectByExample(Object o) {
        return null;
    }

    public int selectCountByExample(Object o) {
        return 0;
    }

    public UserLogin selectOneByExample(Object o) {
        return null;
    }

    public int updateByExample(UserLogin userLogin, Object o) {
        return 0;
    }

    public int updateByExampleSelective(UserLogin userLogin, Object o) {
        return 0;
    }

    public List<UserLogin> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
        return null;
    }

    public List<UserLogin> selectByRowBounds(UserLogin userLogin, RowBounds rowBounds) {
        return null;
    }

    public int insertList(List<UserLogin> list) {
        return 0;
    }

    public int insertUseGeneratedKeys(UserLogin userLogin) {
        return 0;
    }
}