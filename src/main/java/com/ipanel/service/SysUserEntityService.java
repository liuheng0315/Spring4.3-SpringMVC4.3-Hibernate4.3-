package com.ipanel.service;

import com.ipanel.pojo.SysUserEntity;

public interface SysUserEntityService {
    public abstract void presistUser(SysUserEntity user);
    public abstract void updateUser(SysUserEntity user);
    public abstract void deleteUser(int id);
    public abstract SysUserEntity findUser(int id);
}