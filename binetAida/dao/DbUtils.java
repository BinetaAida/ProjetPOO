/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author binetAida
 */
public class DbUtils {
    public static final SimpleDateFormat SQL_FORMAT= new SimpleDateFormat("yyyy-mm-dd");
   
    
    private static Connection connection;
    
    public static Connection getConnection() throws Exception  {

        if (connection==null) {
                //connection à la base
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/formation?useSSL=false", "root", "khoudia");        
            }
    return connection;
    }
    
     public static void disconnect() throws SQLException{
         if (connection!=null) {
             connection.close();
             connection=null;
         }
     }
     
     
    
}
