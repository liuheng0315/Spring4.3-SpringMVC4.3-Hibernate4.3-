package com.ipanel.controller;

import com.ipanel.pojo.Sys_user;
import com.ipanel.service.Sys_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Sys_userController {
    @Autowired
    private Sys_userService sys_userService;
    @RequestMapping(value = "test")
    public String presistUser() {
        Sys_user sys_user = new Sys_user();
        sys_user.setUser_name("ipanel");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sys_user.setCreate_time(df.format(new Date()));
        sys_user.setEmail("ipanel@gamil.com");
        sys_user.setPassword("123456");
        sys_user.setPhone("110");
        sys_user.setUser_type("员工");
        sys_userService.presistUser(sys_user);
        return "test";
    }
}
