package com.offcn.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

//@Setter//提供set方法
//@Getter//提供get方法
@Data  //提供get  set 方法
@AllArgsConstructor//全参数的构造器
@NoArgsConstructor//无参数的构造器
public class Car {
    private Integer id;
    private String name;
    private Double price;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;

}
