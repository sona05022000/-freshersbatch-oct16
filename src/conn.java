/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author KUNAL KUMAR DAS
 */
import Employee.*;
import java.sql.*;  


public class conn{
    public Connection c;
    public Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///ems","root","0326");    
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            e.printStackTrace();
            
        }  
    }  
}  
    

