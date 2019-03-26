/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.QuestionPojo;
import techquizapp.pojo.QuestionStore;


public class QuestionDAO {

    public static ArrayList<QuestionPojo> getQuestionsById(String ExamID)throws SQLException
    {
            String qry="select * form questions where examid=? order by qno";
            
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(qry);
            ArrayList<QuestionPojo> questionList=new ArrayList<>();
            
            ps.setString(1,ExamID);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                QuestionPojo qs=new QuestionPojo();

                qs.setQno(rs.getInt(2));
                qs.setQuestion(rs.getString(3));

                qs.setAnswer1(rs.getString(4));
                qs.setAnswer2(rs.getString(5));
                qs.setAnswer3(rs.getString(6));
                qs.setAnswer4(rs.getString(7));

                qs.setCorrectAnswer(rs.getString(8));

                qs.setLanguage(rs.getString(9));
                qs.setExamId(ExamID);

                questionList.add(qs);
            }
            
        return questionList;
    }
    
    
    
    
    
    
    public static void addQuestions(QuestionStore qList) throws SQLException
    {       
            Connection conn=DBConnection.getConnection();
        
            ArrayList<QuestionPojo> questionList=qList.getAllQuestions();
            
            PreparedStatement ps=conn.prepareStatement("Insert into questions values (?,?,?,?,?,?,?,?,?) ");
                    
            for(QuestionPojo obj:questionList)
            {
                ps.setString(1, obj.getExamId());
                ps.setInt(2, obj.getQno());
                ps.setString(3, obj.getQuestion());
                ps.setString(4, obj.getAnswer1());
                ps.setString(5, obj.getAnswer2());
                ps.setString(6,obj.getAnswer3());
                ps.setString(7, obj.getAnswer4());
                ps.setString(8, obj.getCorrectAnswer());
                ps.setString(9, obj.getLanguage());
                ps.executeUpdate();
            }  
    }
}
