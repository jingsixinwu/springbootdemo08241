package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication// 此注释表示 当前类是 springboot项目的启动类
//默认会去扫描 其所在包 以及其子包下面的 controller组件
public class Springbootdemo08241Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootdemo08241Application.class, args);
    }

}
