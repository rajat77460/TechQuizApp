
package techquizapp.gui;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import techquizapp.dao.QuestionDAO;
import techquizapp.pojo.AnswerPojo;
import techquizapp.pojo.AnswerStore;
import techquizapp.pojo.ExamPojo;
import techquizapp.pojo.QuestionPojo;
import techquizapp.pojo.QuestionStore;
import techquizapp.pojo.UserProfile;


public class TakeTestFrame extends javax.swing.JFrame {
    
    private ExamPojo exam;
    private QuestionStore qstore;
    private AnswerStore astore;
    private int qno,pos=0;
    ButtonGroup buttonGroup1=new ButtonGroup();
    public TakeTestFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsername.setText("Hello : "+UserProfile.getUserid());
        
        qstore=new QuestionStore();
        astore=new AnswerStore();
        qno=1;
        lblQno.setText(lblQno.getText()+qno);
        
        buttonGroup1.add(op1);
        buttonGroup1.add(op2);
        buttonGroup1.add(op3);
        buttonGroup1.add(op4);
    
            
    }

    
    
    
    TakeTestFrame(ExamPojo exam) {
        this();
        this.exam=exam;
        lblTitle.setText(exam.getLanguage().toUpperCase()+" Paper");
        loadQuestions();
        showQuestion();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblQno = new javax.swing.JLabel();
        lblLogOut = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        op3 = new javax.swing.JRadioButton();
        op1 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblQno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 102, 0));
        lblQno.setText("Question No :");

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

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 102, 0));
        lblUsername.setText("Hello : ");

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        op3.setText("jRadioButton1");

        op1.setText("jRadioButton1");

        op4.setText("jRadioButton1");

        op2.setText("jRadioButton1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 102, 0));
        lblTitle.setText("Paper Title");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(686, Short.MAX_VALUE)
                        .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPrevious)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNext)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDone))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(op1)
                                            .addComponent(op3))
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(op4)
                                            .addComponent(op2)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(559, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(295, 295, 295)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(298, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op2)
                    .addComponent(op1))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op4)
                    .addComponent(op3))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnCancel)
                    .addComponent(btnDone))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(442, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(398, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer==null){
        QuestionPojo question=qstore.getQuestion(pos);
        String correctAnswer=question.getCorrectAnswer();
        AnswerPojo newanswer=new AnswerPojo(exam.getExamid(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            
        
        
        AnswerPojo answer=astore.getAnswerByQno(qno);
        
        if(answer==null)
          astore.addAnswer(newanswer);
        else
        {
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false)
                {
                    int apos=astore.removeAnswer(answer);
                    astore.setAnswerAt(pos,newanswer);
                }
        }
        
        }
    pos++;
    if(pos>=qstore.getCount())
    {
    pos=0;
    }
        
    qno++;
    if(qno>qstore.getCount())
            qno=1;
        lblQno.setText("Question No: "+qno);
        showQuestion();
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer==null){
        QuestionPojo question=qstore.getQuestion(pos);
        String correctAnswer=question.getCorrectAnswer();
        AnswerPojo newanswer=new AnswerPojo(exam.getExamid(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            
        
        
        AnswerPojo answer=astore.getAnswerByQno(qno);
        
        if(answer==null)
          astore.addAnswer(newanswer);
        else
        {
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false)
                {
                    int apos=astore.removeAnswer(answer);
                    astore.setAnswerAt(pos,newanswer);
                }
        }
        
        }
   pos--;
    if(pos<0)
    {
    pos=qstore.getCount()-1;
    }
        
    qno--;
    if(qno<=0)
            qno=qstore.getCount();
        lblQno.setText("Question No: "+qno);
        showQuestion();
        
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer==null){
        QuestionPojo question=qstore.getQuestion(pos);
        String correctAnswer=question.getCorrectAnswer();
        AnswerPojo newanswer=new AnswerPojo(exam.getExamid(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            
        
        
        AnswerPojo answer=astore.getAnswerByQno(qno);
        
        if(answer==null)
          astore.addAnswer(newanswer);
        else
        {
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false)
                {
                    int apos=astore.removeAnswer(answer);
                    astore.setAnswerAt(pos,newanswer);
                }
        }
        
        }
        int right=0,wrong=0;
        
        for(QuestionPojo question:qstore.getAllQuestions()){
            int qno=question.getQno();
            AnswerPojo answer=astore.getAnswerByQno(qno);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btnDoneActionPerformed

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
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    // End of variables declaration//GEN-END:variables

    private void loadQuestions() {
        try{
            
            ArrayList<QuestionPojo>
                    questionList=QuestionDAO.getQuestionsById(exam.getExamid());
            
            for(QuestionPojo obj:questionList)
                qstore.addQuestion(obj);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error in DB Conn","Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }        
    }

    private void showQuestion() {
        QuestionPojo question=qstore.getQuestion(pos);
        buttonGroup1.clearSelection();
        
        op1.setText(question.getAnswer1());
        op2.setText(question.getAnswer2());
        op3.setText(question.getAnswer3());
        op4.setText(question.getAnswer4());
        
        AnswerPojo answer=astore.getAnswerByQno(qno);
        
        if(answer==null)
            return;
        
        String chosenAnswer=answer.getChosenAnswer();
        
        switch(chosenAnswer)
        {
        
            case "Answer1":op1.setSelected(true);
                            break;
            case "Answer2":op2.setSelected(true);
                            break;
            case "Answer3":op3.setSelected(true);
                            break;
            case "Answer4":op4.setSelected(true);
                            break;
        }
        
        
    }


public String getUserAnswer()
{

    if(op1.isSelected())
            return "Answer1";
    
    if(op2.isSelected())
            return "Answer2";
    
    if(op3.isSelected())
            return "Answer3";
    
    if(op4.isSelected())
            return "Answer4";
    
    return null;


}







}
