/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapp01;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.MessageFormat;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
/**
 *
 * @author KANANSAK
 */
public class JFrameApp extends javax.swing.JFrame {

    /**
     * Creates new form JFrameApp
     */
    public JFrameApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextAnno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextRtime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextBtime = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtnAddNew = new javax.swing.JButton();
        jbtnExport = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnReset1 = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Room loan system ");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("No.Room");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

        jTextNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextNo.setToolTipText("Room Number");
        jPanel1.add(jTextNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 220, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, -1));

        jTextName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, -1));

        jTextDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextDate.setToolTipText("DD.MM.25yy ( 12.10.2565 )");
        jTextDate.setActionCommand("<Not Set>");
        jPanel1.add(jTextDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 220, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Annotation");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, -1));

        jTextAnno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextAnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 630, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Return Time");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 120, -1));

        jTextRtime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextRtime.setToolTipText("XX.XX ( 17.00 )");
        jPanel1.add(jTextRtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 220, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Borrow Time");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 120, -1));

        jTextBtime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextBtime.setToolTipText("XX.XX ( 13.00 )");
        jPanel1.add(jTextBtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 220, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnAddNew.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnAddNew.setText("Add");
        jbtnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddNewActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, -1));

        jbtnExport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnExport.setText("Export");
        jbtnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExportActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 100, -1));

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnDelete.setText("Detete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jbtnReset1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReset1.setText("Reset");
        jbtnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReset1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnReset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 100, -1));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 110, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.Room", "Name", "Date", "Borrow Time", "Return Time", "Annotation"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddNewActionPerformed
        // TODO add your handling code here:
        if(jTextNo.getText().equals("") || jTextName.getText().equals("") || jTextDate.getText().equals("") || jTextBtime.getText().equals("") || jTextRtime.getText().equals("")
            || jTextAnno.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Pleas Enter All Data !");
        }else{
            String data[] = {jTextNo.getText(), jTextName.getText(),jTextDate.getText(),jTextBtime.getText(),jTextRtime.getText(),jTextAnno.getText()};
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Add Data Successfully");
            jTextNo.setText("");
            jTextName.setText("");
            jTextDate.setText("");
            jTextBtime.setText("");
            jTextRtime.setText("");
            jTextAnno.setText("");

        }
    }//GEN-LAST:event_jbtnAddNewActionPerformed

    private void jbtnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExportActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file save");
        int userSelection = fileChooser.showSaveDialog(this);
        if(userSelection == JFileChooser.APPROVE_OPTION){
            File fileToSave = fileChooser.getSelectedFile();
            //lets write to file

            try {
                FileWriter fw = new FileWriter(fileToSave);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < jTable1.getRowCount() ; i++) {
                    for (int j = 0; j < jTable1.getColumnCount(); j++) {
                        bw.write(jTable1.getValueAt(i, j).toString()+",");
                    }
                    bw.newLine();//record per line
                }
                JOptionPane.showMessageDialog(this, "SUCCESSFULLY LOADED","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                bw.close();
                fw.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "ERROR","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtnExportActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow() == -1){
            if(jTable1.getRowCount() == 0){
                JOptionPane.showMessageDialog(null,"No data to delete",
                    "Data Entry From ",JOptionPane.OK_OPTION);
            }else{
                JOptionPane.showMessageDialog(null,"Select a row to delete ",
                    "Data Entry From",JOptionPane.OK_OPTION);
            }
        }else{
            model.removeRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReset1ActionPerformed
        // TODO add your handling code here:
        try {
            jTextNo.setText("");
            jTextName.setText("");
            jTextDate.setText("");
            jTextBtime.setText("");
            jTextRtime.setText("");
            jTextAnno.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jbtnReset1ActionPerformed
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you went to exit ","Data Entry Form",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextAnno;
    private javax.swing.JTextField jTextBtime;
    private javax.swing.JTextField jTextDate;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextNo;
    private javax.swing.JTextField jTextRtime;
    private javax.swing.JButton jbtnAddNew;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnExport;
    private javax.swing.JButton jbtnReset1;
    // End of variables declaration//GEN-END:variables
}
