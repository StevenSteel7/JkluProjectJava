/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import Jframes.LoginPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soggs
 */

public class UseFulMethods {
     public static void connect(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electricbill","root","lordoflords");
        String SQL = "SELECT * FROM electricbill.customerdata;";
    // String SQL =  "INSERT INTO `electricbill`.`customerdata` (`kID`, `Name`, `PhoneNo`, `Username`, `Address`) VALUES ('sooo', 'suryansh', '9079856', 'suryansh', 'pratap');";
        
        Statement st = con.createStatement();
        rs = st.executeQuery(SQL);
        
        }
     
    
    catch (ClassNotFoundException ex) {
        Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}   
    static ResultSet rs;
}
