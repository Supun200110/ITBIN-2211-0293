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
public class DBDelete {
    Statement stmt;
    
    public void deleteItem(String Iid){
        try {
           
            stmt = DBConnection.getStatementConnection();
            String Inum = Iid;
            stmt.executeUpdate("DELETE FROM item WHERE item_Number ='"+Inum+"'");
        } catch (Exception e) {
        }
    }
}
