package cn.myviolin.db.mapper;


import cn.myviolin.db.base.BaseViolinMapper;
import cn.myviolin.model.userLogin.UserLogin;
import org.mybatis.spring.annotation.MapperScan;


/**
 * Created by jc on 2018/2/1 14:14
 * description 用户登录dao
 */
@MapperScan
public interface UserLoginMapper extends BaseViolinMapper<UserLogin> {

}