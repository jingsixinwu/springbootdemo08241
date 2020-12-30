package com.offcn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//配置类
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    //配置自定义的静态资源路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将resources下的aaaaa包作为静态资源路径 访问的时候使用 /aaaaa/*
        //registry.addResourceHandler("/aaaaa/**").addResourceLocations("classpath:\\aaaaa\\");
        //将F://upload//包作为静态资源路径 访问的时候使用 /aaaaa/*
       // registry.addResourceHandler("/myPic/**").addResourceLocations("file:F:\\upload\\");


    }
}
