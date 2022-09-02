import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ConfigurationSessionTransaction {
   static Configuration con;
   static SessionFactory sf;
   static Session session;
   static Transaction tx;

    public static void getConfiguration(){

         con=new  Configuration().configure("hibernate.cfg.xml");
         sf=con.buildSessionFactory();
         session= sf.openSession();
         tx= session.beginTransaction();
    }

    public static  void closeAll(){
        tx.commit();
        session.close();
        sf.close();
    }
}
