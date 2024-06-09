/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBSearch;
import Model.UpdateDeleteBook;
import Model.UpdateDeleteMember;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class MemberController {
    
    public static void Members(String memberID, String fullName, String gender, 
        String email, String phoneNumber) {
    new Model.AddMember().addMember(memberID, fullName, gender, email, phoneNumber);
    JOptionPane.showMessageDialog(null, "New Record has been inserted", 
            "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }    
    
    public static boolean updateMember(String memberID, String fullName, String gender, String email, String phoneNumber) {
        boolean success = false;
        try {
            success = UpdateDeleteMember.updateMember(memberID, fullName, gender, email, phoneNumber);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return success;
    }
    
    public static boolean deleteMember(String memberID) throws SQLException {
        boolean success = false;
        success = UpdateDeleteMember.deleteMember(memberID);
        return success;
    }
    
}  
