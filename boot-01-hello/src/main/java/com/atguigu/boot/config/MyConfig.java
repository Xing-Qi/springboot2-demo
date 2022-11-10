package com.atguigu.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.*;

/**
 * @author Oliver
 * @create 2022-11-04 20:22
 * Full(proxyBeanMethods = true)保证每个@Bean方法被调用多少次返回的组件都是单实例
 * Lite(proxyBeanMethods = false)每个@Bean方法被调用多少次返回的组件都是新创建的
 */
//@ImportResource("classpath:beans.xml")//原生配置文件引入
@ConditionalOnMissingBean(name = "tom")//根据注解状态装配组件
@Import({User.class}) //给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
@Configuration(proxyBeanMethods = true)//告诉springboot这是一个配置类
public class MyConfig {
    @Bean
    public User user01(){
        User user = new User("zhangsan", 18);
        return user;
    }
    @Bean("tom")
    public Pet pet(){
        Pet cat = new Pet("cat");
        return cat;
    }

}
