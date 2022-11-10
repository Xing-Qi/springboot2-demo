package com.atguigu.boot.config;

import com.atguigu.boot.Bean.Pet;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static java.lang.Integer.*;

/**
 * @author Oliver
 * @create 2022-11-08 17:17
 */
@Configuration(proxyBeanMethods = false)
public class WebConfig {

    //1.WebMvcConfigurer定制化SpringMvc的功能
    public WebMvcConfigurer webMvcConfigurer(){

        return new WebMvcConfigurer() {
            /**
             * 自定义格式化规则
             * @param registry
             */
            @Override
            public void addFormatters(FormatterRegistry registry) {
//                添加转化规则
                registry.addConverter(new Converter<String, Pet>() {

                    @Override
                    public Pet convert(String source) {
                        if(!StringUtils.isEmpty(source)){
                            Pet pet = new Pet();
                            String[] split = source.split(",");
                            pet.setName(split[0]);
                            pet.setAge(split[1]);
                            return pet;
                        }
                        return null;
                    }
                });
            }
        };
    }
}
