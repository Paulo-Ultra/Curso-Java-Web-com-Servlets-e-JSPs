package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class Exemplo{
    public static void main(String[] args) {

        //Carrega o arquivo xml de configuração do hibernate
        SessionFactory sf = new Configuration().configure(new File(
                "C:/Users/paulo.ultra/Documents/Estudos PucRs/Softblue/Servlets e JSP's/HibernateConfig/src/main/java/hibernate/hibernate.cfg.xml"))
                .buildSessionFactory();

        Session session = sf.getCurrentSession();

        Produto p = new Produto();
        p.setNome("P1");

        session.beginTransaction();

        session.save(p);

        session.getTransaction().commit();

        System.out.println(p.getId());
    }
}
