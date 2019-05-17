/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class ConnectionFactory {
    
    
    public Connection getConnection() {
        /*
        String servidor = "jdbc:mysql://localhost/fj21?useTimezone=true&serverTimezone=UTC&useSSL=false";
        String usuario = "root";
        String senha = "grazi2209";
        */
        //Class.forName("org.apache.derby.jdbc.ClientDrive");
        Connection connection = null;
        String servidor = "jdbc:derby://localhost:1527/projeto_paulo";
        String usuario = "paulo";
        String senha = "123456";

        System.out.println("conectando...");

        try {
            connection = DriverManager.getConnection(servidor, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return connection;

 
}
}