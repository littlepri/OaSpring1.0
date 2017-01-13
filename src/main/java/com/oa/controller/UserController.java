package com.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/1/13.
 */
@Controller
public class UserController {

    @RequestMapping("login")
    public String login(){
        System.out.println("--login--");
        return "success";
    }
}
