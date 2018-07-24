package com.ipanel.service.impl;

import com.ipanel.pojo.SysUserEntity;
import com.ipanel.dao.SysUserEntityDao;
import com.ipanel.service.SysUserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserEntityServiceImpl implements SysUserEntityService {
    @Autowired
    private SysUserEntityDao sysUserEntityDao;
    @Override
    public void presistUser(SysUserEntity user) {
        sysUserEntityDao.save(user);
    }

    @Override
    public void updateUser(SysUserEntity user) {
        sysUserEntityDao.save(user);
    }

    @Override
    public void deleteUser(int id) {
        sysUserEntityDao.delete(id);
    }

    @Override
    public SysUserEntity findUser(int id) {
        return (SysUserEntity)sysUserEntityDao.find(id);
    }
}