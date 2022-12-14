/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProviderCode;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dell
 */
public class InsertResult extends javax.swing.JFrame {

    /**
     * Creates new form InsertResult
     */
    public InsertResult() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Insert Student Result");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rollNo_textField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        PhysicsMarks_TextField = new javax.swing.JTextField();
        MathsMarks_TextField = new javax.swing.JTextField();
        ChemistryMarks_TextField = new javax.swing.JTextField();
        ElectronicsMarks_TextField = new javax.swing.JTextField();
        BiologyMarks_TextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Roll No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        rollNo_textField.setMaximumSize(new java.awt.Dimension(70, 22));
        rollNo_textField.setMinimumSize(new java.awt.Dimension(70, 22));
        rollNo_textField.setPreferredSize(new java.awt.Dimension(70, 22));
        rollNo_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollNo_textFieldActionPerformed(evt);
            }
        });
        getContentPane().add(rollNo_textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 120, 30));

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-search-30.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, 30));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(300, 100));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(300, 100));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 100));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Roll No.", "Gender", "Father's Name", "Course", "Branch"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(300, 100));
        jTable1.setMinimumSize(new java.awt.Dimension(300, 100));
        jTable1.setPreferredSize(new java.awt.Dimension(300, 100));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 480, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Physics Marks");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Maths Marks");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Chemistry Marks");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Electronics Marks");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Biology Marks");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-submit-document-32.png"))); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        ExitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/backButton3.png"))); // NOI18N
        ExitButton.setText("Back");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        PhysicsMarks_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhysicsMarks_TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PhysicsMarks_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 140, -1));

        MathsMarks_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MathsMarks_TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(MathsMarks_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 140, -1));
        getContentPane().add(ChemistryMarks_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 140, -1));
        getContentPane().add(ElectronicsMarks_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 140, -1));
        getContentPane().add(BiologyMarks_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 140, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setMaximumSize(new java.awt.Dimension(600, 550));
        jLabel7.setMinimumSize(new java.awt.Dimension(600, 550));
        jLabel7.setPreferredSize(new java.awt.Dimension(600, 550));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 670, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String rollNo=rollNo_textField.getText();
        int physicsMarks=Integer.parseInt(PhysicsMarks_TextField.getText());
        int mathsMarks=Integer.parseInt(MathsMarks_TextField.getText());
        int chemMarks=Integer.parseInt(ChemistryMarks_TextField.getText());
        int electronicsMarks=Integer.parseInt(ElectronicsMarks_TextField.getText());
        int bioMarks=Integer.parseInt(BiologyMarks_TextField.getText());
        int total = physicsMarks + mathsMarks + chemMarks + electronicsMarks + bioMarks;
        
        try{
            Connection con =ConnectionProviderCode.getcon();
            Statement st=con.createStatement();
            st.executeUpdate("insert into result values('"+ rollNo + "', '" + physicsMarks +"', '"+ mathsMarks +"', '"+ chemMarks +"', '"+ electronicsMarks +"', '"+ bioMarks +"','"+total+"');");
            JOptionPane.showMessageDialog(null, "Successfully Added!");
            setVisible(false);
            InsertResult frame=new InsertResult();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.setTitle("Insert Student Result");
        }
        catch(Exception excp){
            JOptionPane.showMessageDialog(null, excp.toString());
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void MathsMarks_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MathsMarks_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MathsMarks_TextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String rollNo=rollNo_textField.getText();
        try{
            Connection con =ConnectionProviderCode.getcon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select *from student where rollNo ='"+rollNo+"'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first())
            {
                JOptionPane.showMessageDialog(null, "Entered Roll No. does not exist!");
            }
            rollNo_textField.setEditable(false);
        }
        catch(Exception excp){
            JOptionPane.showMessageDialog(null, excp.toString());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void PhysicsMarks_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhysicsMarks_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhysicsMarks_TextFieldActionPerformed

    private void rollNo_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollNo_textFieldActionPerformed
      
    }//GEN-LAST:event_rollNo_textFieldActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        int response=JOptionPane.showConfirmDialog(null, "Want to go back?","Back",JOptionPane.YES_NO_OPTION);
        
        if(response==0)
        {
            setVisible(false);
            Admin frame=new Admin();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.setTitle("Admin Page");
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InsertResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BiologyMarks_TextField;
    private javax.swing.JTextField ChemistryMarks_TextField;
    private javax.swing.JTextField ElectronicsMarks_TextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField MathsMarks_TextField;
    private javax.swing.JTextField PhysicsMarks_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField rollNo_textField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
