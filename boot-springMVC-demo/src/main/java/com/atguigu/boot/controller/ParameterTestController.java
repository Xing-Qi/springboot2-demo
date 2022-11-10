package com.atguigu.boot.controller;

import com.atguigu.boot.Bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Oliver
 * @create 2022-11-08 16:44
 */
@RestController
public class ParameterTestController {
    /**
     * 数据绑定
     * @param person
     * @return
     */
    @PostMapping("/saveUser")
    public Person saveUser(Person person){
        return person;
    }

}
