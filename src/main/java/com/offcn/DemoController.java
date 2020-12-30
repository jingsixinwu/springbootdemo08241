package com.offcn;

import com.offcn.po.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class DemoController {
    @RequestMapping("/hello")
    public String sayHello(){

        return "欢迎来到优就业";

    }

    /**
     * 获取一个车
     */
    @RequestMapping("/findOne")
    public Car findOne(){
        Car car = new Car(1, "宝马", 800000.0,new Date());
        return car;

    }

    /**
     * 获取一个车
     */
    @RequestMapping("/findAll")
    public List<Car> findAll(){
        List<Car> list=new ArrayList<>();
        Car car1 = new Car(1, "宝马1", 8000010.0,new Date());
        Car car2 = new Car(2, "宝马2", 8000020.0,new Date());
        Car car3 = new Car(3, "宝马3", 8000030.0,new Date());

        list.add(car1);
        list.add(car2);
        list.add(car3);
        return list;

    }


}
