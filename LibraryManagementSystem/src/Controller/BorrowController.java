/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author priya
 */
public class BorrowController {
    public static void BorrowBooks(String mn, String bn, String status, 
    String erdate) {
        new Model.AddBorrow().addBorrow(mn, bn, status, erdate);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", 
        "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
