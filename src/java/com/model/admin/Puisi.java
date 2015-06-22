
package com.model.admin;

import java.util.Objects;
import javax.persistence.*;
/**
 *
 * @author Rayzzy
 */
@Entity
@Table(name = "puisi")
public class Puisi implements java.io.Serializable{
    
    @Id
    private String userPengarang;
    private String judul;
    private String jenisPuisi;
    private String puisi;
    
    public Puisi(){
        
    }
    
    public Puisi (String userPengarang, String Judul, String jenisPuisi, String Puisi){
        this.userPengarang = userPengarang;
        this.judul = Judul;
        this.jenisPuisi = jenisPuisi;
        this.puisi = Puisi;
    }
    
    public String getuserPengarang(){
        return this.userPengarang;
    }
    public void setuserPengarang(String userPengarang){
        this.userPengarang = userPengarang;
    }
    public String getJudul(){
        return this.judul;
    }
    public void setJudul(String Judul){
        this.judul = Judul;
    }
    public String getjenisPuisi(){
        return this.jenisPuisi;
    }
    public void setjenisPuisi(String jenisPuisi){
        this.jenisPuisi = jenisPuisi;
    }
    public String getPuisi(){
        return this.puisi;
    }
    public void setPuisi(String Puisi){
        this.puisi = Puisi;
    }
    
}
