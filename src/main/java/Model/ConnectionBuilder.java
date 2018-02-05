/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nawatsomnuek
 */
public class ConnectionBuilder {
    public static Connection getConnection(){
        Connection con = null;
       
        try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("");  
        } catch (Exception e) {
            
        }
    return con;
    }
   
}
