package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Books;

public class BooksMain {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Books.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Books bo = new Books();
		
		bo.setBookId(1);
		bo.setTitle("Andha Paisa");
		bo.setAuthor("Mukesh Ambani");
		bo.setYear(2024);
		bo.setCost(98999.99);
		
		bo.setBookId(2);
		bo.setTitle("Inside Out");
		bo.setAuthor("Jack Marshall");
		bo.setYear(2015);
		bo.setCost(1579.89);
		
		bo.setBookId(3);
		bo.setTitle("Rich Dad Poor Dad");
		bo.setAuthor("Robert Kiyosaki and Sharon Lechter");
		bo.setYear(1997);
		bo.setCost(1360);
		
		bo.setBookId(4);
		bo.setTitle("IKIGAI");
		bo.setAuthor("Héctor García & Francesc Miralles");
		bo.setYear(2006);
		bo.setCost(180);
		
		bo.setBookId(5);
		bo.setTitle("ATOMIC HABITS");
		bo.setAuthor("James Clear");
		bo.setYear(2018);
		bo.setCost(220);
		
		ss.persist(bo);
		System.out.println(bo);
		
		tr.commit();
		ss.close();
		
	}
}
