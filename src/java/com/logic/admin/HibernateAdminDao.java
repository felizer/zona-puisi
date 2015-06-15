package com.logic.admin;

import com.model.admin.Admin;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Rayzzy
 */
public class HibernateAdminDao implements adminDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    Admin a = new Admin();

    @Override
    public void store(Admin admin) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.saveOrUpdate(admin);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(int adminId) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            Admin admin = (Admin) session.get(Admin.class, adminId);
            session.delete(admin);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public Admin findById(int adminId) {
        Session session = sessionFactory.openSession();
        try {
            return (Admin) session.get(Admin.class, adminId);
        } finally {
            session.close();
        }
    }

    @Override
    public List<Admin> findAll() {
        {
            Session session = sessionFactory.openSession();
            try {
                Query query = session.createQuery("from admin");
                return query.list();
            } finally {
                session.close();
            }
        }
    }

}
