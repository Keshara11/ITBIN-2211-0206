/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;


public class AddBorrow {
    Statement stmt;
    public void addBorrow(String mn, String bn, String status, String erdate) {
        try {
            stmt = DBConnection.getStatementConnection();
            System.out.println(mn + bn + status + erdate);
            System.out.println("Hello");
stmt.executeUpdate("INSERT INTO borrow VALUES (null, '"+ mn +"', '"+ bn +"', '"+ status +"', '"+ erdate +"')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
