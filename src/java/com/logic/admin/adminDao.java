package com.logic.admin;

import com.model.admin.Admin;
import java.util.List;
import com.user.admin.util.NewHibernateUtil;
import com.logic.admin.*;
import org.hibernate.Query;

/**
 *
 * @author Rayzzy
 */
public class adminDao extends EntityBase implements IDataAccess<Admin> {

    public adminDao() {
    }

    @Override
    public void insert(Admin obj) {
        connect();
        session.save(obj);
        session.flush();
        disconect();
    }

    @Override
    public void update(Admin obj) {
        connect();
        session.update(obj);
        session.flush();
        disconect();
    }

    @Override
    public void delete(Admin obj) {
        connect();
        session.delete(obj);
        session.flush();
        disconect();
    }

    @Override
    public List<Admin> getAll() {
        connect();
        List<Admin> produkList = session.createQuery("from Admin").list();
        disconect();
        return produkList;
    }

    @Override
    public Admin getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Admin getById(String id) {
        connect();
        List<Admin> adminList = getByProperty("id", id);
        disconect();
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public List<Admin> getByProperty(String name, Object value) {
        connect();
        Query query = session.createQuery("from Admin where " + name + " =:value");
        query.setParameter("value", value);
        List<Admin> adminList = query.list();
        disconect();
        return adminList;
    }

    @Override
    public List<Admin> search(String name, Object value) {
        connect();
        Query query = session.createSQLQuery("select * from admin where " + name + " like '%" + value + "%'");
        List<Admin> adminList = query.list();
        disconect();
        return adminList;
    }

}
