/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.UpdateForm;

/**
 *
 * @author C TECH
 */
public class UpdateController {
    public static void UpdateForm(String inum, String iname, String supid, String quan){
        new UpdateForm().updateForm(inum, iname, supid, quan);
      
    if(inum.equals("")){
        
    }
    else{
        JOptionPane.showMessageDialog(null,"Record has Updated Successfully", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
    }
}
