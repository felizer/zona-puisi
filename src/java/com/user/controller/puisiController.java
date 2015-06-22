package com.user.controller;

import javax.faces.bean.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.FacesContext;
import com.model.admin.Puisi;
import com.logic.admin.puisiDao;
import javax.faces.application.FacesMessage;

/**
 *
 * @author Rayzzy
 */
@ManagedBean
@SessionScoped
public class puisiController {
    Puisi puisi;
    List<Puisi> puisiList;
 private puisiDao dataAccess;
 private String searchBy;
 private String searchValue;
 
 public puisiController() {
 puisiList = new ArrayList<Puisi>();
 puisi = new Puisi();
 dataAccess = new puisiDao();
 puisiList = dataAccess.getAll();
 }
 public String displayAll(){
  puisiList = dataAccess.getAll();
 return "List";
 }
 public String searchProduk(){
 puisiList = dataAccess.getByProperty(this.searchBy,this.searchValue);
 return "List";
 }
 
 public String addPuisi(){
 dataAccess.insert(puisi);
 FacesMessage message = new FacesMessage("Data berhasil ditambahkan");
 message.setSeverity((FacesMessage.SEVERITY_INFO));
 FacesContext.getCurrentInstance().addMessage(null, message);
 puisiList = dataAccess.getAll();
 return "List";
 }
 public String updatePuisi(){
 dataAccess.update(puisi);
 FacesMessage message = new FacesMessage("Data berhasil diubah");
 message. setSeverity((FacesMessage.SEVERITY_INFO));
 FacesContext.getCurrentInstance().addMessage(null, message);
 puisiList = dataAccess.getAll();
 return "List";
 }
 public String deletePuisi(){
 dataAccess.delete(puisi);
 FacesMessage message = new FacesMessage("Data berhasil dihapus");
 message.setSeverity((FacesMessage.SEVERITY_INFO));
 FacesContext.getCurrentInstance().addMessage(null, message);
 puisiList = dataAccess.getAll();
 return "List";
 }
 public Puisi getProduk() {
 return puisi;
 }
 public void setPuisi(Puisi puisi) {
 this.puisi = puisi;
 }
 public List<Puisi> getPuisiList() {
 return puisiList;
 }
 public void setPuisiList(List<Puisi> puisiList) {
 this.puisiList = puisiList;
 }
 public puisiDao getDataAccess() {
 return dataAccess;
 }
 public void setDataAccess(puisiDao dataAccess) {
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
