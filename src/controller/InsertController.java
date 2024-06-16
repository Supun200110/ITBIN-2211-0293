/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import javax.swing.JOptionPane;
import model.AddRecord;
/**
 *
 * @author C TECH
 */
public class InsertController {
   
    public static void insertsupplier(String Sname, String Sid, String Cname, String Address, int phone){
        
        
  if(Sid !=null){
      new AddRecord().Supplier(Sname, Sid, Cname, Address, phone);
      JOptionPane.showMessageDialog(null, "RECORD INSERTED", "Successfull", JOptionPane.INFORMATION_MESSAGE);
     
  }
    }
    
    
   public static void insertitem(String Iname, String Inum, String supID , String quantity){
       if(Inum !=null){
           new AddRecord().ItemM(Iname, Inum, supID, quantity);
           JOptionPane.showMessageDialog(null, "RECORD INSERTED", "Successfull", JOptionPane.INFORMATION_MESSAGE);
       }
   }
    
}
