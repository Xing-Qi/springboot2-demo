package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController = * @Controller + @ResponseBody
 *
 * @author Oliver
 * @create 2022-11-04 11:23
 */
@Slf4j
@RestController
public class HelloController {
    @Autowired
    Car car;
    @RequestMapping("/car ")
    public Car getCar(){
        return car;
    }
    @RequestMapping("/dev")
    public String getDev(){
        return "get dev!";
    }

    @RequestMapping("/hello")
    public String handle01(){

        log.info("请求进来了");

        return "hello,spring boot 2!";
    }
}
