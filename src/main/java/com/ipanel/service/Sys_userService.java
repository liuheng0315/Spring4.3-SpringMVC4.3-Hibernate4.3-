package com.ipanel.service;

import com.ipanel.pojo.Sys_user;

public interface Sys_userService {
    public abstract void presistUser(Sys_user user);
    public abstract void updateUser(Sys_user user);
    public abstract void deleteUser(int id);
    public abstract Sys_user findUser(int id);
}