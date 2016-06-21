/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import it.java858.todoapp.entity.Categoria;
import it.java858.todoapp.entity.ToDo;
import it.java858.todoapp.gui.Main;
import it.java858.todoapp.service.CategoriaService;
import it.java858.todoapp.service.DbService;
import it.java858.todoapp.service.ToDoService;
import it.java858.todoapp.service.event.CategoriaEventListener;
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
        CategoriaService.addCategoriaEventListenr(
                new AscoltaEventiCategoria());
        //Create and display form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });

    }

}

class AscoltaEventiCategoria implements CategoriaEventListener {

    @Override
    public void onCreate(Categoria c) {
        System.out.println("Hai creato la categoria" + c);
    }

    @Override
    public void onUpdate(Categoria c) {
        System.out.println("Hai modificato la categoria" + c);
    }

    @Override
    public void onDelete(Categoria c) {
        System.out.println("Hai cancellato la categoria" + c);
    }

}
