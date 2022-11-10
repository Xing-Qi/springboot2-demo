package com.atguigu.boot;

import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主程序类
 *
 * @author Oliver
 * @SpringBootApplication:标识这是一个springboot应用
 * @create 2022-11-04 11:20
 */
//@SpringBootApplication = @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan("com.atguigu.boot")
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.atguigu.boot")
public class MainApplication {
    public static void main(String[] args) {
//        1.返回ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
//        2.查看ioc中的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name: names
             ) {
            System.out.println(name);
        }
//        3.从容器中获取组件
//        Pet pet01 = run.getBean("tom", Pet.class);
//        Pet pet02 = run.getBean("tom", Pet.class);
//        System.out.println("组件" + (pet01 == pet02));
//        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
//        User user = new User();
//        User user1 = new User();
//        System.out.println(user == user1);
//
//        User user01 = run.getBean("user01", User.class);
//        Pet tom = run.getBean("tom",Pet.class);
//
//        System.out.println(user01.getPet());
        boolean tom = run.containsBean("tom");
        System.out.println("容器Tom组件" + tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器user01组件" + user01);

        boolean hehe = run.containsBean("hehe");
        System.out.println("容器hehe组件" + hehe);
        boolean haha = run.containsBean("haha");
        System.out.println("容器haha组件" + haha);


    }

}
