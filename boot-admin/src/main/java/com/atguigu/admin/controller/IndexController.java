package com.atguigu.admin.controller;

import com.atguigu.admin.Bean.Account;
import com.atguigu.admin.Bean.City;
import com.atguigu.admin.service.AccountService;
import com.atguigu.admin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Oliver
 * @create 2022-11-08 22:30
 */
@Controller
public class IndexController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    AccountService accountService;
    @Autowired
    CityService cityService;
    @ResponseBody
    @GetMapping("/city")
    public City getCityByID(@RequestParam("cid") Integer id){
        return cityService.getCityById(id);

    }
    @GetMapping("/citymapper")
    public String index(){
        return "citymapper";
    }
    @ResponseBody
    @PostMapping("/city")
    public City insertCity(City city){
        cityService.insertCity(city);
        return city;
    }
    @ResponseBody
    @GetMapping("/acct")
    public Account getAccount(@RequestParam("eid") Integer eid){
        Account account = accountService.getAccount(eid);
        return account;
    }

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

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb(){
        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_emp", Long.class);
        return aLong.toString();
    }

}
