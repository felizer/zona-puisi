import com.logic.admin.HibernateAdminDao;
import com.logic.admin.adminDao;
import com.model.admin.Admin;
import java.util.GregorianCalendar;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author Rayzzy
 */
public class main {
    public static void main(String[] args) {
     ApplicationContext context =
     new ClassPathXmlApplicationContext("applicationContext.xml");
     adminDao AdminDao = (adminDao) context.getBean("AdminDao");
 
     Admin admin = new Admin();
     HibernateAdminDao koya = new HibernateAdminDao();
     
    admin.setNama("nama");
    admin.setJk("jk");
    admin.setAlamat("alamat");
    admin.setEmail("email");
    admin.setPhone("phone");
    admin.setUsername("username");
    admin.setPassword("password");
    
    koya.store(admin);
    koya.findAll();
    int adminId = admin.getIdUser();
    admin = koya.findById(adminId);
 }
}
