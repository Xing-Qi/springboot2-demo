package com.atguigu.boot.Bean;

import lombok.Data;

import java.util.Date;

/**
 * @author Oliver
 * @create 2022-11-08 16:42
 */
@Data
public class Person {
    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;
}
