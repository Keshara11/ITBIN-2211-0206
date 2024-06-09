/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

public class AddMember {
    Statement stmt;

    public void addMember(String memberID, String fullName, String gender, 
        String email, String phoneNumber) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate(
                "INSERT INTO members (memberid, fullName, gender, email, "
                        + "phonenumber) VALUES('"+ memberID + "', '"
                        + fullName + "', '"+ gender + "', '"+ email + "', '"
                + phoneNumber + "')"
            );
        System.out.println("Member Record added Successfull");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
