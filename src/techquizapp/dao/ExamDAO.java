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
import java.sql.Statement;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.ExamPojo;

public class ExamDAO {

    public static boolean addExam(ExamPojo newExam) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into exam values (?,?,?)");
        ps.setString(1,newExam.getExamid());
        ps.setString(2,newExam.getLanguage());
        ps.setInt(3,newExam.getTotal_questions());
        int ans=ps.executeUpdate();
        return ans==1;
    }
    
public static String getExamId() throws SQLException
{
    
    Connection conn=DBConnection.getConnection();
    String qry=("select count(*) as totalrows from exam");
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery(qry);
    int rowCount=0;
    if(rs.next())
        rowCount=rs.getInt(1);
    
    String newId="EX"+(rowCount+1);
    
    return newId;
}

public static boolean isPaperSet(String subject) throws SQLException
{
    Connection conn=DBConnection.getConnection();
    String qry=("select examid from exam where language = ?");
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,subject);
    ResultSet rs=ps.executeQuery();
    return rs.next();
}

public static ArrayList<String >getExamBySubject(String userid,String subject)throws SQLException
{
    Connection conn=DBConnection.getConnection();
    String qry=("select examid from exam where language = ? minus select examid from performance where userid=?");
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,subject);
    ps.setString(2,userid);
    ArrayList<String> examList=new ArrayList<>();
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
        examList.add(rs.getString(1));
    }
    return examList;
}

public static  int getCountByExam(String examId) throws SQLException
{
    String qry="select total_question from Exam where examid=?";
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,examId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    int rowCount=rs.getInt(1);
    return rowCount;
}

}
