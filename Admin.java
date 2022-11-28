/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Admin Page");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InsertStudent = new javax.swing.JButton();
        AddResult = new javax.swing.JButton();
        ListStudent = new javax.swing.JButton();
        ListResult = new javax.swing.JButton();
        UpdateResult = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InsertStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InsertStudent.setText("Insert Student");
        InsertStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertStudentActionPerformed(evt);
            }
        });
        getContentPane().add(InsertStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 180, 30));

        AddResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddResult.setText("Add Result");
        AddResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddResultActionPerformed(evt);
            }
        });
        getContentPane().add(AddResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 180, 30));

        ListStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListStudent.setText("List Student");
        ListStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 180, 30));

        ListResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListResult.setText("List Student Result");
        ListResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListResultActionPerformed(evt);
            }
        });
        getContentPane().add(ListResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 180, 30));

        UpdateResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateResult.setText("Update Student Marks");
        UpdateResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateResultActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 180, 30));

        LogoutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/home2.png"))); // NOI18N
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 450));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 450));
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -60, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertStudentActionPerformed
        InsertStudent frame=new InsertStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Insert Student");
    }//GEN-LAST:event_InsertStudentActionPerformed

    private void ListStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentActionPerformed
        ListStudent frame=new ListStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle("List Student");
    }//GEN-LAST:event_ListStudentActionPerformed

    private void AddResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddResultActionPerformed
        InsertResult frame=new InsertResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Insert Result");
    }//GEN-LAST:event_AddResultActionPerformed

    private void UpdateResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateResultActionPerformed
        UpdateResult frame=new UpdateResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Update Result");
    }//GEN-LAST:event_UpdateResultActionPerformed

    private void ListResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListResultActionPerformed
        ListResult frame=new ListResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle("List Result");
    }//GEN-LAST:event_ListResultActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        int response=JOptionPane.showConfirmDialog(null, "Want to go Home?","Home Page",JOptionPane.YES_NO_OPTION);
        
        if(response==0)
        {        
            setVisible(false);
            Home frame=new Home();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.setTitle("Home");
        }
    }//GEN-LAST:event_LogoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddResult;
    private javax.swing.JButton InsertStudent;
    private javax.swing.JButton ListResult;
    private javax.swing.JButton ListStudent;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton UpdateResult;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
