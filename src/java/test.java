
import static com.sun.xml.ws.security.addressing.impl.policy.Constants.logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static org.hibernate.annotations.common.util.impl.LoggerFactory.logger;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import static org.hibernate.internal.CoreLogging.*;
import static org.hibernate.jpa.internal.HEMLogging.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rayzzy
 */
public class test {
    public static void main(String[] args) throws Exception {
        testConnection();
    }
   public static void testConnection() throws Exception {

            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            SessionFactory sessionFactory = configuration.buildSessionFactory(ssrb.build());
            Session session = sessionFactory.openSession();
            logger.info("Test connection with the database created successfuly.");
    } 
}

