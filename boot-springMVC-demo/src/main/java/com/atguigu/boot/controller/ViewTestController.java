package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Oliver
 * @create 2022-11-08 22:07
 */
@Controller
public class ViewTestController {
    @RequestMapping("/test")
    public String getInfo(Model model){
        model.addAttribute("msg","HelloWorld");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
}
