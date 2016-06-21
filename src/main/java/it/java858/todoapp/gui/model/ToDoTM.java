/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.gui.model;

import it.java858.todoapp.entity.ToDo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tss
 */
public class ToDoTM extends AbstractTableModel {

    String[] nomi = {"id", "testo", "dataCreazione", "categorie"};
    List<ToDo> todo;

    public ToDoTM(List<ToDo> todo) {
        this.todo = todo;
    }

    public void changeData(List<ToDo> data) {
        todo = data;
        fireTableDataChanged();

    }

    @Override
    public int getRowCount() {
        return todo.size();
    }

    @Override
    public int getColumnCount() {
        return nomi.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return todo.get(rowIndex).getId();
            case 1:
                return todo.get(rowIndex).getTesto();
            case 2:
                return formatDate(todo.get(rowIndex).getDataCreazione());
            case 3:
                return todo.get(rowIndex).getCategorie().toString();
            default:
                return null;

        }
    }
    private String formatDate(Date d){
        DateFormat df= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return df.format(d);
    }
    public String getColumName(int column) {
        return nomi[column];
    }

    public ToDo get(int row) {
        return todo.get(row);
    }

}
