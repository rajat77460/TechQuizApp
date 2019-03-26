
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.PerformancePojo;
import techquizapp.pojo.StudentScore;
public class PerformanceDAO {
    
    public static ArrayList <String>getAllStudentId()throws SQLException {
    String qry="select distinct userid from performance";
    ArrayList<String>studentIdList=new ArrayList<>(); 
   Connection conn=DBConnection.getConnection();
 
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery(qry);
   while(rs.next())
   {
   studentIdList.add(rs.getString(1));
   
   }
   
   
   return studentIdList;
    }
   
    public static ArrayList<String>getAllExamid(String studentId)throws SQLException
    {
    ArrayList<String> examIdList=new ArrayList<>();
    String qry="select examid from performance where userid=?";
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,studentId);
    ResultSet rs=ps.executeQuery();
    
    while(rs.next())
        {
        String id=rs.getString(1);
        examIdList.add(id);
        examIdList.add(id);
        }
    return examIdList;
    }

    public static StudentScore getScore(String studentid,String examid)throws SQLException
    {
    
    String qry="select language,per from performance where userid=? and examid=?";
    
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    
    ps.setString(1,studentid);
    ps.setString(2,examid);
        
        ResultSet rs=ps.executeQuery();
        rs.next();//no requirement of while loop because only one exam per one examid
        StudentScore scoreObj=new StudentScore();
        scoreObj.setLanguage(rs.getString(1));
        scoreObj.setPer(rs.getDouble(2));
    
        return scoreObj;
    }

    public static void addPerformance(PerformancePojo performance) throws SQLException
    {
    
        String qry="insert into performance values(?,?,?,?,?,?,?)";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        
        ps.setString(1,performance.getUserid());
        ps.setString(2,performance.getExamid());
        ps.setInt(3,performance.getRight());
        ps.setInt(4,performance.getWrong());
        ps.setInt(5,performance.getUnattempted());
        ps.setDouble(6,performance.getPer());
        ps.setString(7,performance.getLanguage());
        
        ps.executeUpdate();
    
    }
    
    
}

