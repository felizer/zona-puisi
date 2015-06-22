package com.user.controller;

/**
 *
 * @author Rayzzy
 */
import javax.faces.bean.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.FacesContext;
import com.model.admin.Admin;
import com.logic.admin.adminDao;
import javax.faces.application.FacesMessage;

@ManagedBean
@SessionScoped
public class userController {

    Admin admin;
    List<Admin> adminList;
    private adminDao dataAccess;
    private String searchBy;
    private String searchValue;

    public userController() {
        adminList = new ArrayList<Admin>();
        admin = new Admin();
        dataAccess = new adminDao();
        adminList = dataAccess.getAll();
    }

    public String displayAll() {
        adminList = dataAccess.getAll();
        return "List";
    }

    public String searchProduk() {
        adminList = dataAccess.getByProperty(this.searchBy, this.searchValue);
        return "List";
    }

    public String addAdmin(Admin admin) {
        dataAccess.insert(admin);
        FacesMessage message = new FacesMessage("Data berhasil ditambahkan");
        message.setSeverity((FacesMessage.SEVERITY_INFO));
        FacesContext.getCurrentInstance().addMessage(null, message);
        adminList = dataAccess.getAll();
        return "List";
    }

    public String updateAdmin(Admin admin) {
        dataAccess.update(admin);
        FacesMessage message = new FacesMessage("Data berhasil diubah");
        message.setSeverity((FacesMessage.SEVERITY_INFO));
        FacesContext.getCurrentInstance().addMessage(null, message);
        adminList = dataAccess.getAll();
        return "List";
    }

    public String deleteAdmin(Admin admin) {
        dataAccess.delete(admin);
        FacesMessage message = new FacesMessage("Data berhasil dihapus");
        message.setSeverity((FacesMessage.SEVERITY_INFO));
        FacesContext.getCurrentInstance().addMessage(null, message);
        adminList = dataAccess.getAll();
        return "List";
    }

    public Admin getProduk(Admin admin) {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> adminList) {
        this.adminList = adminList;
    }

    public adminDao getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(adminDao dataAccess) {
        this.dataAccess = dataAccess;
    }

    public String getSearchBy() {
        return searchBy;
    }

    public void setSearchBy(String searchBy) {
        this.searchBy = searchBy;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }
}
