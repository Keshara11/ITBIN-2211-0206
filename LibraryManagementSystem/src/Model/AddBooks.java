/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

public class AddBooks {
    Statement stmt;
    
    public void Books(String bookName, String isbn, String authorName,
            String category, String copies)
    {
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate
            ("INSERT INTO books (isbn, bName, aName, category, copies) VALUES('"+ isbn +"', '"+ bookName +"', '"+ authorName +"', '"+ category +"', '"+ copies +"')");
            System.out.println("Book Record added Successfull");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
