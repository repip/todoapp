/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.gui;

import it.java858.todoapp.gui.model.CategoriaTM;
import it.java858.todoapp.entity.Categoria;
import it.java858.todoapp.service.CategoriaService;
import javax.swing.ListSelectionModel;

/**
 *
 * @author tss
 */
public class CategoriaCRUD extends javax.swing.JDialog {

    CategoriaTM categoriaTM;

    /**
     * Creates new form CategoriaCRUD
     */
    public CategoriaCRUD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        categoriaTM = new CategoriaTM(CategoriaService.findAll());
        tblCategorie.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblCategorie.setModel(categoriaTM);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategorie = new javax.swing.JTable();
        cmdmodifica = new javax.swing.JButton();
        cmdcancella = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblCategorie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCategorie);

        cmdmodifica.setText("modifica");
        cmdmodifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdmodificaActionPerformed(evt);
            }
        });

        cmdcancella.setText("cancella");
        cmdcancella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancellaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdmodifica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdcancella)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdmodifica)
                    .addComponent(cmdcancella))
                .addGap(0, 60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdcancellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancellaActionPerformed
        Categoria toRemove = categoriaTM.get(tblCategorie.convertRowIndexToModel(tblCategorie.getSelectedRow()));
        CategoriaService.elimina(toRemove);
        categoriaTM.changeData(CategoriaService.findAll());

    }//GEN-LAST:event_cmdcancellaActionPerformed

    private void cmdmodificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdmodificaActionPerformed
        Categoria toEdit = categoriaTM.get(tblCategorie.convertRowIndexToModel(tblCategorie.getSelectedRow()));
        CategoriaEdit edt = new CategoriaEdit(toEdit,this, true);
        edt.setLocationRelativeTo(this);
        edt.setVisible(true);
        tblCategorie.updateUI();
    }//GEN-LAST:event_cmdmodificaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CategoriaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CategoriaCRUD dialog = new CategoriaCRUD(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdcancella;
    private javax.swing.JButton cmdmodifica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCategorie;
    // End of variables declaration//GEN-END:variables
}
