package com.ipanel.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Repository
@Transactional
public class SysUserEntityDao extends SimpleHibernateDao{
    @Autowired
    private SessionFactory SessionFactory;

    @Override
    public void save(Object entity) {
        super.save(entity);
    }

    @Override
    public void delete(Object entity) {
        super.delete(entity);
    }

    @Override
    public void delete(Serializable id) {
        super.delete(id);
    }

    @Override
    public Object find(Serializable id) {
        return super.find(id);
    }

    @Override
    public List find(Collection idList) {
        return super.find(idList);
    }

    @Override
    public List findAll() {
        return super.findAll();
    }

    @Override
    public void flush() {
        super.flush();
    }
}
