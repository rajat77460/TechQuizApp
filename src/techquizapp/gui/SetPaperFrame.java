/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import techquizapp.dao.ExamDAO;
import techquizapp.pojo.ExamPojo;
import techquizapp.pojo.UserProfile;
public class SetPaperFrame extends javax.swing.JFrame {
    
    public SetPaperFrame() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        lblHello.setText("Hello : "+UserProfile.getUserid());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHello = new javax.swing.JLabel();
        TITLE = new javax.swing.JLabel();
        TITLE1 = new javax.swing.JLabel();
        btnBACK = new javax.swing.JButton();
        TITLE2 = new javax.swing.JLabel();
        TITLE3 = new javax.swing.JLabel();
        jcLanguage = new javax.swing.JComboBox<>();
        jcQuestions = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnSet = new javax.swing.JButton();
        lblLogOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblHello.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblHello.setForeground(new java.awt.Color(255, 102, 0));
        lblHello.setText("Hello : ");

        TITLE.setBackground(new java.awt.Color(255, 102, 0));
        TITLE.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TITLE.setForeground(new java.awt.Color(255, 153, 0));
        TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE.setText("Choose The Subject");

        TITLE1.setBackground(new java.awt.Color(255, 102, 0));
        TITLE1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TITLE1.setForeground(new java.awt.Color(255, 153, 0));
        TITLE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE1.setText("PAPER SETTING PANEL");

        btnBACK.setBackground(new java.awt.Color(0, 0, 0));
        btnBACK.setForeground(new java.awt.Color(255, 153, 0));
        btnBACK.setText("Back");
        btnBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBACKActionPerformed(evt);
            }
        });

        TITLE2.setBackground(new java.awt.Color(255, 102, 0));
        TITLE2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TITLE2.setForeground(new java.awt.Color(240, 240, 240));
        TITLE2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE2.setText("Set Paper Details");

        TITLE3.setBackground(new java.awt.Color(255, 102, 0));
        TITLE3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TITLE3.setForeground(new java.awt.Color(255, 153, 0));
        TITLE3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE3.setText("Set Number Of Questions");

        jcLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "C", "C++", " " }));

        jcQuestions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAJAT GUPTA\\Downloads\\JavaProjectppts\\TechQuizApp\\onlineexam\\examicon.png")); // NOI18N
        jLabel1.setText("jLabel1");

        btnSet.setBackground(new java.awt.Color(0, 0, 0));
        btnSet.setForeground(new java.awt.Color(255, 153, 0));
        btnSet.setText("Set The Questions");
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSet)
                        .addGap(18, 18, 18)
                        .addComponent(btnBACK))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TITLE3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHello, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(TITLE2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TITLE1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHello, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(TITLE1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TITLE2)
                .addGap(16, 16, 16)
                .addComponent(TITLE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(TITLE3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBACK)
                    .addComponent(btnSet))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBACKActionPerformed
        this.dispose();
        new AdminOptionsFrame().setVisible(true);
    }//GEN-LAST:event_btnBACKActionPerformed

    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
    String subject=jcLanguage.getSelectedItem().toString();
    int totalQuest=Integer.parseInt(jcQuestions.getSelectedItem().toString());
    int ans;
        ans = JOptionPane.showConfirmDialog(null,"You have selected \""+subject+"\"and \""+totalQuest+"\" No of Questions.Is it Okay?", "Confirmation !",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
        try{
            String examId=ExamDAO.getExamId();
            ExamPojo newExam=new ExamPojo(examId,subject,totalQuest);
            new SetQuestionsFrame(newExam).setVisible(true);
            this.dispose();
            
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error in connecting to db");
            e.printStackTrace();
        }
        
        }
        else
        {
            System.out.println("Selected No");
        return;
        }
        
    }//GEN-LAST:event_btnSetActionPerformed

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
            java.util.logging.Logger.getLogger(SetPaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetPaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetPaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetPaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetPaperFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITLE;
    private javax.swing.JLabel TITLE1;
    private javax.swing.JLabel TITLE2;
    private javax.swing.JLabel TITLE3;
    private javax.swing.JButton btnBACK;
    private javax.swing.JButton btnSet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcLanguage;
    private javax.swing.JComboBox<String> jcQuestions;
    private javax.swing.JLabel lblHello;
    private javax.swing.JLabel lblLogOut;
    // End of variables declaration//GEN-END:variables
}
