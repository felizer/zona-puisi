package com.logic.admin;

import com.model.admin.Puisi;
import java.util.List;
import com.user.admin.util.NewHibernateUtil;
import com.logic.admin.*;
import org.hibernate.Query;
/**
 *
 * @author Rayzzy
 */
public class puisiDao extends EntityBase implements IDataAccess<Puisi>{

    public puisiDao(){        
    }
    
    @Override
    public void insert(Puisi obj) {
       connect();
        session.save(obj);
        session.flush();
        disconect();}

    @Override
    public void update(Puisi obj) {
       connect();
        session.update(obj);
        session.flush();
        disconect();}

    @Override
    public void delete(Puisi obj) {
        connect();
        session.delete(obj);
        session.flush();
        disconect();}

    @Override
    public List<Puisi> getAll() {
      connect();
        List<Puisi> produkList = session.createQuery("from Puisi").list();
        disconect();
        return produkList;}

    @Override
    public Puisi getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Puisi getById(String id) {
        connect();
        List<Puisi> puisiList = getByProperty("id", id);
        disconect();
        if (puisiList != null && puisiList.size() > 0) {
            return puisiList.get(0);
        }
        return null;}

    @Override
    public List<Puisi> getByProperty(String name, Object value) {
        connect();
        Query query = session.createQuery("from Puisi where " + name + " =:value");
        query.setParameter("value", value);
        List<Puisi> puisiList = query.list();
        disconect();
        return puisiList;}

    @Override
    public List<Puisi> search(String name, Object value) {
        connect();
        Query query = session.createSQLQuery("select * from puisi where " + name + " like '%" + value + "%'");
        List<Puisi> puisiList = query.list();
        disconect();
        return puisiList;}
    
}
