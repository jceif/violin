package cn.myviolin.controller.userLogin;


import cn.myviolin.service.userLogin.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jc on 2018/2/2 13:25
 * description ${请描述一下吧}
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    @Qualifier("loginImpl")
    private UserLoginService loginService;
    @RequestMapping("/")
    public String login(){
        return "user/login";
    }
}
