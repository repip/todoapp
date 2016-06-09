/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import it.java858.todoapp.entity.ToDo;
import it.java858.todoapp.service.DbService;
import it.java858.todoapp.service.ToDoService;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tss
 */
public class App {
    
    public static void main(String[] args) {
        //apre la connessione
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em =DbService.getEm();
        
        //a seguire op su db
        
        System.out.println("jpa ok!");
        
        ToDo td = new ToDo();
        td.setTesto("Caffè tra poco!!!");
        td.setDataCreazione(new Date());
 /*       
        em.getTransaction().begin();
        em.persist(td);
        em.getTransaction().commit();
        
        em.close();
   */
        ToDoService.save(td);
    }
    
}
