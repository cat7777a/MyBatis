package com.yeshen.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Demo Class
 *
 * @author cat77
 * @date 8/25/2020
 */
@Getter
@Setter
@ToString
public class User implements Serializable {

    private Integer uid; //用户id
    private String username;// 用户姓名
    private String sex;// 性别
    private Date birthday;// 生日
    private String address;// 地址


}
