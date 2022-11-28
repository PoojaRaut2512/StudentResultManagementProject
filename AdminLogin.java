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
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }
       /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                             

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userName_textfield = new javax.swing.JTextField();
        login_button = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        password_textfield = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        userName_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userName_textfieldActionPerformed(evt);
            }
        });
        getContentPane().add(userName_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 180, -1));

        login_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-login-30.png"))); // NOI18N
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        backbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/backButton3.png"))); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 130, 40));

        password_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_textfieldActionPerformed(evt);
            }
        });
        getContentPane().add(password_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Admin Login");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 170, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(new java.awt.Dimension(700, 400));
        jLabel4.setMinimumSize(new java.awt.Dimension(700, 400));
        jLabel4.setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\TO DO LIST\\Icons_ResultManagement\\schoolPic1.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(600, 350));
        jLabel3.setMinimumSize(new java.awt.Dimension(600, 350));
        jLabel3.setPreferredSize(new java.awt.Dimension(600, 350));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1010, -130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userName_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userName_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userName_textfieldActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        String username = userName_textfield.getText();
        String password = password_textfield.getText();
        
        if(username.contentEquals("user")&& password.contentEquals("password"))
        {
            setVisible(false);
            Admin frame=new Admin();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else
            JOptionPane.showMessageDialog(null, "User Name or Password is incorrect!");

    }//GEN-LAST:event_login_buttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        int response=JOptionPane.showConfirmDialog(null, "Want to go back Home?","Back",JOptionPane.YES_NO_OPTION);
        
        if(response==0)
        {
            setVisible(false);
            Home frame=new Home();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_backbuttonActionPerformed

    private void password_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_textfieldActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password_textfield;
    private javax.swing.JTextField userName_textfield;
    // End of variables declaration//GEN-END:variables
}