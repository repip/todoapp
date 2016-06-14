/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import it.java858.todoapp.entity.ToDo;
import it.java858.todoapp.gui.Main;
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });

    }

}
