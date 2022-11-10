package com.atguigu.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Oliver
 * @create 2022-11-08 22:30
 */
@Controller
public class IndexController {
    /**
     * 登录页
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String toLogin(){
        return "login";
    }

    /**
     * 登录成功
     * 重定向处理表单重复提交
     * @return
     */
    @PostMapping("/login")
    public String main(String userName,String password){
        return "redirect:/main.html";
    }
    /**
     * 登录成功页面
     */
    @GetMapping("/main.html")
    public String mainPage(){
        return "main";
    }

}
