package com.atguigu.admin;

import com.atguigu.admin.Bean.Account;
import com.atguigu.admin.Bean.City;
import com.atguigu.admin.service.UserService;
import com.atguigu.admin.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class BootAdminApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        Long object = jdbcTemplate.queryForObject("select count(*) from t_emp", Long.class);
        log.info("记录总数: {}",object);
        log.info("数据源类型: {}",dataSource.getClass());
    }

    @Test
    void getAccount(){
        Account byId = userService.getById(1);
        log.info("查询对象:{}",byId);
    }

}
