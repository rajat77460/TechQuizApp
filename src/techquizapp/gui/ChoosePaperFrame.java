/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquizapp.dao.ExamDAO;
import techquizapp.pojo.ExamPojo;
import techquizapp.pojo.UserProfile;

/**
 *
 * @author RAJAT GUPTA
 */
public class ChoosePaperFrame extends javax.swing.JFrame {
String subjectName;
    public ChoosePaperFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcSubject = new javax.swing.JComboBox<>();
        jcExam = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnTakeTest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Paper Selection Panel");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAJAT GUPTA\\Downloads\\JavaProjectppts\\TechQuizApp\\onlineexam\\examicon.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Choose the Exam Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fill Paper Details");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Choose the Subject");

        jcSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t", "Java", "C", "C++" }));
        jcSubject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcSubjectItemStateChanged(evt);
            }
        });

        jcExam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btnBack.setText("Back");

        btnTakeTest.setText("Take The Test");
        btnTakeTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(117, 117, 117)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcExam, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(277, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(235, 235, 235)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(311, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(201, 201, 201)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addComponent(btnTakeTest, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(361, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnBack)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(352, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(171, 171, 171)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(307, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(450, Short.MAX_VALUE)
                    .addComponent(btnTakeTest)
                    .addGap(56, 56, 56)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcSubjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcSubjectItemStateChanged

        if(evt.getStateChange()==ItemEvent.DESELECTED)
            {return;}
        
        if(validateInputs()==false)
            {
                JOptionPane.showMessageDialog(null,"Please Make a Selection","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
        jcExam.removeAllItems();
        try{
            if(ExamDAO.isPaperSet(subjectName)==false)
            {
                JOptionPane.showMessageDialog(null,"No Exam Set for the Selected Paper found!");
                return;
            }
            
        ArrayList<String> examIdList=ExamDAO.getExamBySubject(UserProfile.getUserid(),subjectName);
        //IN THIS SQL QUERY THE OUTPUT GENERATED IS number of exam ids student is left to appear for,
        //so if nothing is returned he must have appeared for all the tests
        
        if(examIdList.isEmpty()==false)
        {   
            
            for(String exam: examIdList)
            {
            jcExam.addItem(exam);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"You have given all exams for selected Subject !");
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error connecting to DataBase");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jcSubjectItemStateChanged

    private void btnTakeTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeTestActionPerformed
    
        int count=jcSubject.getSelectedIndex();
        if(count==0)
            {
            //None Selected
                JOptionPane.showMessageDialog(null,"Please select a Subject");
                return;
            }
        
        count=jcExam.getItemCount();
        if(count==0)
        {
            //Nothing present in Exam ComboBox//try this with isPaperSet function from ExamDAO
            JOptionPane.showMessageDialog(null,"Exam id either not selected, or unavailable!");
            return;
        }
        
        String subject=jcSubject.getSelectedItem().toString();
        String examId=jcExam.getSelectedItem().toString();
        int ans;
        ans=JOptionPane.showConfirmDialog(null,"You have chosen : "+subject+"  and Exam as : "+examId+".Are you sure? ", "Confirmation", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(ans==JOptionPane.YES_OPTION)
        {
        
            try
            {
            int totalQuestions=ExamDAO.getCountByExam(examId.trim());
                ExamPojo exam=new ExamPojo(examId,subject,totalQuestions);
                TakeTestFrame testFrame=new TakeTestFrame(exam);
                testFrame.setVisible(true);
                this.dispose();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error in DB Connection!");
            e.printStackTrace();
            }
        }     
    }//GEN-LAST:event_btnTakeTestActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoosePaperFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTakeTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcExam;
    private javax.swing.JComboBox<String> jcSubject;
    // End of variables declaration//GEN-END:variables

    
    public boolean validateInputs()
    {
        int selectedIndex=jcSubject.getSelectedIndex();
        
        if(selectedIndex==0)
            {return false;}
        subjectName=jcSubject.getSelectedItem().toString();
        return true;
    }


}
