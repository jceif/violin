package com.violin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    @RequestMapping("/index")
    public String index() {
        return "/userinfo/index";
    }
}
