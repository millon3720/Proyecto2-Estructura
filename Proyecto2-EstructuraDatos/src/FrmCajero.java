/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;   
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josed
 */
public class FrmCajero extends javax.swing.JFrame {

    List Cajero1 = new LinkedList();
    List Cajero2 = new LinkedList();
    List Cajero3 = new LinkedList();
    List Cajero4 = new LinkedList();
    public FrmCajero() {
        initComponents();
        CargarTabla();
    }

    private void CargarTabla()
    {        
        
        DefaultTableModel CargarTabla = new DefaultTableModel();       
            CargarTabla.addColumn("Cajero #1");
            CargarTabla.addColumn("Cajero #2");
            CargarTabla.addColumn("Cajero #3");
            CargarTabla.addColumn("Cajero #4");
            CargarTabla.setRowCount(0);
            TbCajeros.setModel(CargarTabla);

        if (Cajero1.size()>=Cajero2.size()&&Cajero1.size()>=Cajero3.size()&&Cajero1.size()>=Cajero4.size()) {
          for (int i = 0; i < Cajero1.size(); i++) {
              String aux1="",aux2="",aux3="";
              if (i<Cajero2.size()) {
               aux1=Cajero2.get(i).toString();  
              }if (i<Cajero3.size()) {
               aux2=Cajero3.get(i).toString();  
              }if (i<Cajero4.size()) {
               aux3=Cajero4.get(i).toString();  
              }           
            CargarTabla.addRow(new Object[]{Cajero1.get(i).toString(),aux1,aux2,aux3});           
        }  
        }else{
            if (Cajero2.size()>=Cajero1.size()&&Cajero2.size()>=Cajero3.size()&&Cajero2.size()>=Cajero4.size()) {
          for (int i = 0; i < Cajero2.size(); i++) {
              String aux1="",aux2="",aux3="";
              if (i<Cajero1.size()) {
               aux1=Cajero1.get(i).toString();  
              }if (i<Cajero3.size()) {
               aux2=Cajero3.get(i).toString();  
              }if (i<Cajero4.size()) {
               aux3=Cajero4.get(i).toString();  
              }           
            CargarTabla.addRow(new Object[]{aux1,Cajero2.get(i).toString(),aux2,aux3});          
        }  
        }else{ if (Cajero3.size()>=Cajero2.size()&&Cajero3.size()>=Cajero1.size()&&Cajero3.size()>=Cajero4.size()) {
          for (int i = 0; i < Cajero3.size(); i++) {
              String aux1="",aux2="",aux3="";
              if (i<Cajero2.size()) {
               aux1=Cajero2.get(i).toString();  
              }if (i<Cajero1.size()) {
               aux2=Cajero1.get(i).toString();  
              }if (i<Cajero4.size()) {
               aux3=Cajero4.get(i).toString();  
              }           
            CargarTabla.addRow(new Object[]{aux1,aux2,Cajero3.get(i).toString(),aux3});           
        }  
        }else{if (Cajero4.size()>=Cajero2.size()&&Cajero4.size()>=Cajero1.size()&&Cajero4.size()>=Cajero1.size()) {
          for (int i = 0; i < Cajero4.size(); i++) {
              String aux1="",aux2="",aux3="";
              if (i<Cajero2.size()) {
               aux1=Cajero2.get(i).toString();  
              }if (i<Cajero1.size()) {
               aux2=Cajero1.get(i).toString();  
              }if (i<Cajero3.size()) {
               aux3=Cajero3.get(i).toString();  
              }           
            CargarTabla.addRow(new Object[]{aux1,aux2,aux3,Cajero4.get(i).toString()});           
        }  
        }}
        }
       }        
        TbCajeros.setModel(CargarTabla);
    }
    
                                           

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TbCajeros = new javax.swing.JTable();
        TxtNombre = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TbCajeros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TbCajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cajero #1", "Cajero #2", "Cajero #3", "Cajero #4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbCajeros.setColumnSelectionAllowed(true);
        TbCajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbCajerosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbCajeros);
        TbCajeros.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TbCajeros.getColumnModel().getColumnCount() > 0) {
            TbCajeros.getColumnModel().getColumn(0).setResizable(false);
            TbCajeros.getColumnModel().getColumn(1).setResizable(false);
            TbCajeros.getColumnModel().getColumn(2).setResizable(false);
            TbCajeros.getColumnModel().getColumn(3).setResizable(false);
        }

        TxtNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        label1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label1.setText("Digite El Nombre ");

        BtnGuardar.setBackground(new java.awt.Color(0, 255, 0));
        BtnGuardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        BtnEliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setEnabled(false);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnEliminar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if (Cajero1.size()<=Cajero2.size()&&Cajero1.size()<=Cajero3.size()&&Cajero1.size()<=Cajero4.size()) {
            Cajero1.add(TxtNombre.getText());
        }
        else{if (Cajero2.size()<=Cajero1.size()&&Cajero2.size()<=Cajero3.size()&&Cajero2.size()<=Cajero4.size()) {
            Cajero2.add(TxtNombre.getText());
        }else{if (Cajero3.size()<=Cajero2.size()&&Cajero3.size()<=Cajero1.size()&&Cajero3.size()<=Cajero4.size()) {
            Cajero3.add(TxtNombre.getText());
        }else{if (Cajero4.size()<=Cajero2.size()&&Cajero4.size()<=Cajero1.size()&&Cajero4.size()<=Cajero1.size()) {
            Cajero4.add(TxtNombre.getText());
        }}
        }
          }
        
        CargarTabla();
        TxtNombre.setText("");
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TbCajerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbCajerosMouseClicked
        BtnEliminar.setEnabled(true);
    }//GEN-LAST:event_TbCajerosMouseClicked

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        
       try {
        switch(TbCajeros.getSelectedColumn()) {
  case 0:
        Cajero1.remove(TbCajeros.getSelectedRow());
      break;
  case 1:
        Cajero2.remove(TbCajeros.getSelectedRow());
      break;
  case 2:
        Cajero3.remove(TbCajeros.getSelectedRow());
      break;
  case 3:
        Cajero4.remove(TbCajeros.getSelectedRow());
      break;
  default:
} 
}
catch(Exception e) {
}
      
        BtnEliminar.setEnabled(false);
        CargarTabla();

    }//GEN-LAST:event_BtnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTable TbCajeros;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
