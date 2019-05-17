/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jbdc.ConnectionFactory;

/**
 *
 * @author DELL
 */
public class TestaConexao {
     public static void main(String[] args) throws ClassNotFoundException {
        try (Connection conn = new ConnectionFactory().getConnection()) {
            System.out.println("Conectado com Sucesso!");
        } catch (SQLException ex) {
            System.out.println("Não Foi Possivel realizar a Conexão");
            Logger.getLogger(TestaConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
