/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author C TECH
 */
public class DBSearch {
     Statement stmt;
 ResultSet rs;
public ResultSet searchLogin(String usName) {
 try {
 stmt = DBConnection.getStatementConnection();
 String name = usName;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM admin where adminID='" + name + "'");
 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
    
}

public ResultSet searchitem(String Inum){
    try {
       // Class.forName("com.mysql.cj.jdbc.Driver");
        stmt=DBConnection.getStatementConnection();
        
       String inum=Inum;
      rs= stmt.executeQuery("SELECT * FROM item where item_Number='"+inum+"'");
    } catch (Exception e) {
    }
    return rs;
}
 public ResultSet searchAllitems(){
     try {
         //Class.forName("com.mysql.cj.jdbc.Driver");
         
         
         stmt = DBConnection.getStatementConnection();
         rs=stmt.executeQuery("SELECT * FROM item");
     } catch (Exception e) {
     }
         return rs;
 }
}
