package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Oliver
 * @create 2022-11-07 16:59
 */
@RestController
public class HelloController {
    @Autowired
    Person person;
    @RequestMapping("/person")
    public Person getPersonInfo(){
        return person;
    }
}
