/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.service;

import it.java858.todoapp.entity.Categoria;
import it.java858.todoapp.entity.ToDo;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author tss
 */
public class ToDoService {

    private ToDoService() {
    }

    public static ToDo save(ToDo ToSave) {
        EntityManager em = DbService.getEm();
        em.getTransaction().begin();
        ToDo saved = em.merge(ToSave);
        em.getTransaction().commit();
        return saved;

    }

    public static List<ToDo> findAll() {
        EntityManager em = DbService.getEm();
        List<ToDo> listtodo;
        listtodo = em.createQuery("select t from ToDo t order by t.testo", ToDo.class).getResultList();
        return listtodo;
    }
}
