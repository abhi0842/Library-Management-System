/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPackage;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Abhi
 */
public class ConnectionProvider {
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Enter your own MYSQl password and database to access and enter the  data in it
            
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","Enter your own Password here");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
