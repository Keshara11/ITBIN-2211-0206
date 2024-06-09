/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UpdateDeleteBook;
import Model.UpdateDeleteMember;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BookController {
    
public static void Books(String bookName, String isbn, String authorName, 
        String category, String copies) {
    new Model.AddBooks().Books(bookName, isbn, authorName, category, copies);
    JOptionPane.showMessageDialog(null, "New Record has been inserted", 
            "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean updateBook(String ISBN, String bookName, String authorName, String category, String copies) throws SQLException {
            boolean success = false;
            success = UpdateDeleteBook.updateBook(ISBN, bookName, authorName, category, copies);
            return success;
        }
    
    public static boolean deleteBook(String ISBN) throws SQLException {
        boolean success = false;
        success = UpdateDeleteBook.deleteBook(ISBN);
        return success;
    }
    
}
