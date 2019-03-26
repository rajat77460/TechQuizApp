package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.UserPojo;

public class UserDAO {

    public static boolean validateUser(UserPojo obj) throws SQLException
    {
        
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps= conn.prepareStatement("select * from users where userid =? and password=? and usertype=?");
    
    ps.setString(1, obj.getUserid());
    ps.setString(2,obj.getPassword());
    ps.setString(3,obj.getUsertype());
      
    ResultSet rs=ps.executeQuery();
    boolean flag=rs.next();
        
        return flag;
   
    }
    
    public static boolean addUser(UserPojo user) throws SQLException
    {
    
        String qry="select * from users where userid=?";
        boolean status=false;
        
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps= conn.prepareStatement(qry);
    ps.setString(1, user.getUserid());
    
    ResultSet rs=ps.executeQuery();
    
    if(rs.next())
        status=false;
    else
    {
      status=true;
      qry="insert into users values(?,?,?)";
      ps= conn.prepareStatement(qry);
      ps.setString(1, user.getUserid());
      ps.setString(2, user.getPassword());
      ps.setString(3,user.getUsertype());
      ps.executeUpdate();
    }
        System.out.println(status);
    return status;    
    }
    
}
