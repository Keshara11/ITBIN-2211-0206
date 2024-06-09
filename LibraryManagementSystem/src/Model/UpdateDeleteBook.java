/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateDeleteBook {
         
    public static boolean updateBook(String ISBN, String bookName, String authorName, String category, String copies) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean success = false;

        try {
            conn = DBConnection.getConnection();
            
            String query = "UPDATE books SET bName=?, aName=?, category=?, copies=? WHERE isbn=?";
            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, bookName);
            pstmt.setString(2, authorName);
            pstmt.setString(3, category);
            pstmt.setString(4, copies);
            pstmt.setString(5, ISBN);
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                success = true;
            }
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
        }
        
        return success;
    }
    
        // Method to delete a member from the database
    public static boolean deleteBook(String ISBN) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean success = false;

        try {
            conn = DBConnection.getConnection();
            String query = "DELETE FROM books WHERE isbn=?";

            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, ISBN);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                success = true;
            }
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
        return success;
    }
    
}
