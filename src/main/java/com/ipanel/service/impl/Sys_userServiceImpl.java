package com.ipanel.service.impl;

import com.ipanel.dao.Sys_userDao;
import com.ipanel.pojo.Sys_user;
import com.ipanel.service.Sys_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Sys_userServiceImpl implements Sys_userService {
    @Autowired
    private Sys_userDao sys_userDao;
    @Override
    public void presistUser(Sys_user user) {
        sys_userDao.save(user);
    }

    @Override
    public void updateUser(Sys_user user) {
        sys_userDao.save(user);
    }

    @Override
    public void deleteUser(int id) {
        sys_userDao.delete(id);
    }

    @Override
    public Sys_user findUser(int id) {
        return (Sys_user)sys_userDao.find(id);
    }
}