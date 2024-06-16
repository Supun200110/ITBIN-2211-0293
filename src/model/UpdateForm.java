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
public class UpdateForm {
    Statement stmt;
        public void updateForm(String inumber,String iname ,String supid,String qua){
            try {
                String itname = iname;
                String itnum = inumber;
                String suppid = supid;
                String quan = qua;
                //Class.forName("com.mysql.cj.jdbc.Driver");
                stmt = DBConnection.getStatementConnection();
          stmt.executeUpdate("UPDATE item SET `item_Name`= '"+itname+"',`supplier_ID` ='"+suppid+"', `quantity`='"+quan+"'WHERE `item_Number`='"+itnum+"'");
          
            
            } catch (Exception e) {
            }
        }
}
