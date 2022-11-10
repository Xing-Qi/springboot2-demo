package com.atguigu.admin;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
@Slf4j
@SpringBootTest
class BootAdminApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        Long object = jdbcTemplate.queryForObject("select count(*) from t_emp", Long.class);
        log.info("记录总数: {}",object);
    }

}
