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

    public static Connection getConnection() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/showHello";
        String username = "root";
        String password = "a";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {

        }
        return con;
    }
}
