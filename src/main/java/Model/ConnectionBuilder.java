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
        String url = "jdbc:mysql://donatezen.cjbwyadvduih.ap-southeast-1.rds.amazonaws.com:3306/donatezen";
        String username = "admin";
        String password = "Qwertyui123";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url + "?user=" + username + "&password=" + password);
        } catch (Exception e) {

        }
        return con;
    }
}
