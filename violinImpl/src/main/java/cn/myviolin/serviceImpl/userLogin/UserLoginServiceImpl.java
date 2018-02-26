package cn.myviolin.serviceImpl.userLogin;


import cn.myviolin.model.userLogin.UserLogin;
import cn.myviolin.service.userLogin.UserLoginService;
import cn.myviolin.serviceImpl.base.BaseImpl;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;

/**
 * Created by jc on 2018/2/2 15:42
 * description ${请描述一下吧}
 */
@Service
public class UserLoginServiceImpl extends BaseImpl<UserLogin> implements UserLoginService {

    public List<UserLogin> selectByUserLogin(UserLogin userLogin, int page, int rows) {
        Example example = new Example(UserLogin.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(userLogin.getLoginAccount())) {
            criteria.andLike("countryname", "%" + userLogin.getLoginAccount() + "%");
        }
        if (StringUtil.isNotEmpty(userLogin.getLoginPwd())) {
            criteria.andLike("countrycode", "%" + userLogin.getLoginPwd() + "%");
        }
        if (userLogin.getId() != null) {
            criteria.andEqualTo("id", userLogin.getId());
        }
        //分页查询
        PageHelper.startPage(page, rows);
        return selectByExample(example);
    }
}
