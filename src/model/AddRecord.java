/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;

/**
 *
 * @author C TECH
 */
public class AddRecord {
      Statement stmt;
 
public void ItemM(String Iname, String Inum, String supID , String quantity) {
 try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate("INSERT INTO item VALUES('"+Iname+"', '"+Inum+"', '"+supID+"', '"+quantity+"')");
 } catch (Exception e) {
 e.printStackTrace();
 }
}


public void Supplier(String Sname, String Sid, String Cname, String Address, int phone){
   
    
    try {
        
    stmt = DBConnection.getStatementConnection();
    stmt.executeUpdate("INSERT INTO supplier VALUES('"+Sname+"', '"+Sid+"', '"+Cname+"', '"+Address+"', '"+phone+"')");
    } catch (Exception e) {
    }
    
}
    
}
