package com.logic.admin;

import com.model.admin.Admin;
import java.util.List;
/**
 *
 * @author Rayzzy
 */
public interface adminDao {
    public void store(Admin admin);
    public void delete(int adminId);
    public Admin findById(int adminId);
    public List<Admin> findAll();
}
