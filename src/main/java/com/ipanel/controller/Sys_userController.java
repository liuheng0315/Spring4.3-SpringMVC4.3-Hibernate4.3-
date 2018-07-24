package com.ipanel.controller;

import com.ipanel.pojo.SysUserEntity;
import com.ipanel.pojo.Sys_user;
import com.ipanel.service.SysUserEntityService;
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
    @Autowired
    private SysUserEntityService sysUserEntityService;
    //XML映射方式
    @RequestMapping(value = "xmltest")
    public String presistUserByXml() {
        Sys_user sys_user = new Sys_user();
        sys_user.setUser_name("ipanel");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sys_user.setCreate_time(df.format(new Date()));
        sys_user.setEmail("ipanel@gamil.com");
        sys_user.setPassword("123456");
        sys_user.setPhone("110");
        sys_user.setUser_type("员工");
        sys_userService.presistUser(sys_user);
        return "xmltest";
    }
    //使用注解的方式映射
    @RequestMapping(value = "test")
    public String presistUserByAnnotation() {
        SysUserEntity sysUserEntity = new SysUserEntity();
        sysUserEntity.setUser_name("java");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sysUserEntity.setCreate_time(df.format(new Date()));
        sysUserEntity.setEmail("java@gamil.com");
        sysUserEntity.setPassword("123123");
        sysUserEntity.setPhone("120");
        sysUserEntity.setUser_type("客户");
        sysUserEntityService.presistUser(sysUserEntity);
        return "test";
    }
}