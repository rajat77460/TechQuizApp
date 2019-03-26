
package techquizapp.gui;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import techquizapp.dao.PerformanceDAO;
import techquizapp.pojo.UserProfile;

public class StudentOptionsFrame extends javax.swing.JFrame {


    public StudentOptionsFrame() {
        initComponents();
        ButtonGroup bg=new ButtonGroup();
        bg.add(jrbTakeTest);
        bg.add(jrbViewScores);
        bg.add(jrbChangePassword);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        TITLE = new javax.swing.JLabel();
        TITLE1 = new javax.swing.JLabel();
        jrbTakeTest = new javax.swing.JRadioButton();
        jrbChangePassword = new javax.swing.JRadioButton();
        jrbViewScores = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        lblLogOut = new javax.swing.JLabel();
        TITLE2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 102, 0));
        lblUsername.setText("Hello :");

        TITLE.setBackground(new java.awt.Color(255, 102, 0));
        TITLE.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TITLE.setForeground(new java.awt.Color(255, 153, 0));
        TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE.setText("Make A Choice");

        TITLE1.setBackground(new java.awt.Color(255, 102, 0));
        TITLE1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TITLE1.setForeground(new java.awt.Color(255, 153, 0));
        TITLE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE1.setText("ONLINE QUIZ STUDENT PANEL");

        jrbTakeTest.setBackground(new java.awt.Color(0, 0, 0));
        jrbTakeTest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbTakeTest.setForeground(new java.awt.Color(255, 153, 0));
        jrbTakeTest.setText("TAKE TEST");

        jrbChangePassword.setBackground(new java.awt.Color(0, 0, 0));
        jrbChangePassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbChangePassword.setForeground(new java.awt.Color(255, 153, 0));
        jrbChangePassword.setText("CHANGE PASSWORD");

        jrbViewScores.setBackground(new java.awt.Color(0, 0, 0));
        jrbViewScores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbViewScores.setForeground(new java.awt.Color(255, 153, 0));
        jrbViewScores.setText("VIEW SCORES");

        btnDoTask.setBackground(new java.awt.Color(0, 0, 0));
        btnDoTask.setForeground(new java.awt.Color(255, 153, 0));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        lblLogOut.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(255, 102, 0));
        lblLogOut.setText("LOGOUT");
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogOutMouseExited(evt);
            }
        });

        TITLE2.setBackground(new java.awt.Color(255, 102, 0));
        TITLE2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TITLE2.setForeground(new java.awt.Color(255, 153, 0));
        TITLE2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE2.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAJAT GUPTA\\Downloads\\JavaProjectppts\\TechQuizApp\\onlineexam\\stud1.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(TITLE2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbTakeTest)
                            .addComponent(jrbChangePassword)
                            .addComponent(jrbViewScores))
                        .addGap(73, 73, 73))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDoTask)
                .addGap(109, 109, 109))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(TITLE1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(TITLE2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(TITLE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jrbTakeTest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbViewScores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbChangePassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnDoTask)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(TITLE1)
                    .addContainerGap(310, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed

        if(validateInputs()==false)
        {
            //give error message
            JOptionPane.showMessageDialog(null,"Please select an option");
            return;
        }
            if(jrbTakeTest.isSelected())
            {new ChoosePaperFrame().setVisible(true);}
            else
                if(jrbChangePassword.isSelected())
                    {new ChangePasswordFrame().setVisible(true);}
                else
                  if(jrbViewScores.isSelected())
                    {
                        String studentId=UserProfile.getUserid();
                        
                        try{
                         ArrayList <String> examIdList=PerformanceDAO.getAllExamid(studentId);
                            if(examIdList.size()==0)
                            {
                            JOptionPane.showMessageDialog(null,"No records found for this user !");
                                return;
                            }
                            
                        new StudentScoreFrame(examIdList).setVisible(true);
                        
                        }
                        
                        
                        
                        catch(SQLException e)
                        {
                            JOptionPane.showMessageDialog(null,"Error in DB Connection!");
                                return;
                            
                        }
                    }
                    
          this.dispose();
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void lblLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseEntered
        lblLogOut.setForeground(Color.WHITE);
        Font f=new Font("Tahoma",Font.ITALIC,18);
        lblLogOut.setFont(f);
    }//GEN-LAST:event_lblLogOutMouseEntered

    private void lblLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseExited
        lblLogOut.setForeground(new Color (255,153,0));
        Font f=new Font("Tahoma",Font.BOLD,12);
        lblLogOut.setFont(f);
    }//GEN-LAST:event_lblLogOutMouseExited

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
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITLE;
    private javax.swing.JLabel TITLE1;
    private javax.swing.JLabel TITLE2;
    private javax.swing.JButton btnDoTask;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbChangePassword;
    private javax.swing.JRadioButton jrbTakeTest;
    private javax.swing.JRadioButton jrbViewScores;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs()
    {
    if(jrbTakeTest.isSelected()||jrbViewScores.isSelected()||jrbChangePassword.isSelected())
        return true;
    else
        return false;
    }

}
