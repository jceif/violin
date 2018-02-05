package cn.myviolin.service.userLogin;

import cn.myviolin.model.userLogin.UserLogin;
import cn.myviolin.service.base.IBaseViolinService;

import java.util.List;

/**
 * Created by jc on 2018/2/1 14:12
 * description ${请描述一下吧}
 */

public interface UserLoginService extends IBaseViolinService<UserLogin> {
    /**
     * 根据条件分页查询
     *
     * @param userLogin
     * @param page
     * @param rows
     * @return
     */
    List<UserLogin> selectByUserLogin(UserLogin userLogin, int page, int rows);
}
