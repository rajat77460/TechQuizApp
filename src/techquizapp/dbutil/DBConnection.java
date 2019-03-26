
package techquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
    private static Connection conn;//created and initialize once
    static 
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BM9ETLO:1521/xe","onlineexam", "student");
         
            JOptionPane.showMessageDialog(null,"Connected to Database Successfully");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Cannot Connect to DataBase");
        }
    }
    
    public static Connection getConnection()
        {return conn;}//all static so that no instance is reqd
    
    public static void closeConnection()
    {   
        try
        {
            conn.close();
            System.out.println("Closed the Connection :");
        }
        catch(Exception e)
        {
            System.out.println("Cannot close the connection :");
            e.printStackTrace();
        }
    }
}