package hibernate.app;

import java.io.File;
import java.util.Date;

import hibernate.Cliente;
import hibernate.Editora;
import hibernate.Livro;
import hibernate.RG;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Aplicacao {

	public static void main(String[] args) throws Exception {

		SessionFactory sf = new Configuration().configure(new File(
                "C:/Users/paulo.ultra/Documents/Estudos PucRs/Softblue/Servlets e JSP's/Mod-11__Cf-03/HibernateRelacionamentos/src/hibernate.cfg.xml"))
                .buildSessionFactory();
	
		Session session = sf.getCurrentSession();
		
		session.beginTransaction();
		
		Cliente c = new Cliente();
		c.setNome("Carlos");
		session.save(c);
		
		RG rg = new RG();
		rg.setNumero("1234567");
		rg.setDataExpedicao(new Date());
		rg.setCliente(c);
		session.save(rg);
		
		Editora e = new Editora();
		e.setNome("Edit");
		session.save(e);
		
		Livro l = new Livro();
		l.setNome("Java");
		l.setAutor("Joao Jose");
		l.setIsbn("6666666765");
		l.setEditora(e);
		session.save(l);
		
		l.getClientes().add(c);
		
		session.getTransaction().commit();
	}

}
