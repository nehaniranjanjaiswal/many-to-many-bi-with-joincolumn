package com.jsp.map.cascode.joincolumn;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
   Student student=new Student();
   student.setName("Neha");
   student.setEmail("asdfg2345");

   Course c1=new Course();
   c1.setName("SQL");
   c1.setDuration(45);

  Course c2=new Course();
  c2.setName("java"); 
  c2.setDuration(55); 

  Course c3=new Course();
  c3.setName("html");
  c3.setDuration(30);

  et.begin();
  em.persist(student);
  em.persist(c1);
  em.persist(c2);
  em.persist(c3);
  et.commit();

}
}