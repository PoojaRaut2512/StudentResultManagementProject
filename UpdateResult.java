/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProviderCode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class UpdateResult extends javax.swing.JFrame {

    public UpdateResult() {
        initComponents();
         setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rollNo_textfield = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        physics_textfield = new javax.swing.JTextField();
        maths_textfield = new javax.swing.JTextField();
        chemistry_textfield = new javax.swing.JTextField();
        electronics_textfield = new javax.swing.JTextField();
        biology_textfield = new javax.swing.JTextField();
        Submitbutton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 500));
        setMinimumSize(new java.awt.Dimension(550, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Roll No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));
        getContentPane().add(rollNo_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 80, 30));

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-search-30.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Physics");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Maths");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Chemistry");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Electronics");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Biology");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));
        getContentPane().add(physics_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 130, -1));

        maths_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maths_textfieldActionPerformed(evt);
            }
        });
        getContentPane().add(maths_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 130, -1));
        getContentPane().add(chemistry_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 130, -1));
        getContentPane().add(electronics_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 130, -1));
        getContentPane().add(biology_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 130, -1));

        Submitbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Submitbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-submit-document-32.png"))); // NOI18N
        Submitbutton.setText("Submit");
        Submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Submitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        BackButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/backButton3.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setMaximumSize(new java.awt.Dimension(550, 500));
        jLabel8.setMinimumSize(new java.awt.Dimension(550, 500));
        jLabel8.setPreferredSize(new java.awt.Dimension(550, 500));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maths_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maths_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maths_textfieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String rollNo=rollNo_textfield.getText();
        try{
            Connection con =ConnectionProviderCode.getcon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select *from result where rollNo ='"+rollNo+"'");
            //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first())
            {
                JOptionPane.showMessageDialog(null, "Entered Roll No.does not exist!");
            }
            else{
                rollNo_textfield.setEditable(false);
                physics_textfield.setText(rs.getString(2));
                maths_textfield.setText(rs.getString(3));
                chemistry_textfield.setText(rs.getString(4));
                electronics_textfield.setText(rs.getString(5));
                biology_textfield.setText(rs.getString(6));
            }
        }
        catch(Exception excp){
            JOptionPane.showMessageDialog(null, excp.toString());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        int response=JOptionPane.showConfirmDialog(null, "Want to Go Back?","Back",JOptionPane.YES_NO_OPTION);
        
        if(response==0)
        {
            setVisible(false);
            Admin frame=new Admin();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.setTitle("Admin Page");
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SubmitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbuttonActionPerformed
        String rollNo=rollNo_textfield.getText();
        int physicsMarks=Integer.parseInt(physics_textfield.getText());
        int mathsMarks=Integer.parseInt(maths_textfield.getText());
        int chemMarks=Integer.parseInt(chemistry_textfield.getText());
        int electronicsMarks=Integer.parseInt(electronics_textfield.getText());
        int bioMarks=Integer.parseInt(biology_textfield.getText());
        int total = physicsMarks + mathsMarks + chemMarks + electronicsMarks + bioMarks;
        
        try{
            Connection con =ConnectionProviderCode.getcon();
            Statement st=con.createStatement();
            st.executeUpdate("update result set physics= '" + physicsMarks +"', maths='"+ mathsMarks +"', chemistry='"+ chemMarks +"', electronics='"+ electronicsMarks +"', biology='"+ bioMarks +"', total='"+total+"'where rollNo='"+rollNo+"'");
            JOptionPane.showMessageDialog(null, "Updated Successfully!");
            setVisible(false);
            UpdateResult frame=new UpdateResult();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception excp){
            JOptionPane.showMessageDialog(null, excp.toString());
        }
    }//GEN-LAST:event_SubmitbuttonActionPerformed

   
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Submitbutton;
    private javax.swing.JTextField biology_textfield;
    private javax.swing.JTextField chemistry_textfield;
    private javax.swing.JTextField electronics_textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField maths_textfield;
    private javax.swing.JTextField physics_textfield;
    private javax.swing.JTextField rollNo_textfield;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
