/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.DBConnection;
import model.DBDelete;
import model.DBSearch;

/**
 *
 * @author C TECH
 */
public class DeleteController {
    public static void deleteInum(String Iid){
        try {
            String Inum=null;
                ResultSet rs = new DBSearch().searchitem(Iid);
             while(rs.next()){
                 Inum = rs.getString("item_Number");
              if(Inum != null){
                 new DBDelete().deleteItem(Iid);
               JOptionPane.showMessageDialog(null, "Record Deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
             }
              else{
                  JOptionPane.showMessageDialog(null, "Invalid Index Number", "Error", JOptionPane.ERROR_MESSAGE);
              }
             }
                DBConnection.closeCon();
        } catch (Exception e) {
        }
    }
}
