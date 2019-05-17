/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import jbdc.ConnectionFactory;
import model.Empregados;

/**
 *
 * @author DELL
 */
public class EmpregadosDao {
    private final Connection connection;

    // Construtor que cria um objeto connection
    public EmpregadosDao() {
        this.connection = new ConnectionFactory().getConnection();

    }

    public void adiciona(Empregados empregado) throws ParseException {

        String sql = "INSERT INTO empregados (nome, cargo, salario) VALUES (?, ?, ?)";
        /*INSERT INTO PAULO."empregados" ("nome", "cargo", "salario") 
	VALUES (NULL, NULL, NULL)*/
        

        try {
            // prepared statment para inserção de dados
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            // seta valores
            //stmt.setInt(1, empregado.getId());
            stmt.setString(1, empregado.getNome());
            stmt.setString(2, empregado.getCargo());
            stmt.setDouble(3, empregado.getSalario());
  
            // executa
            stmt.execute();
            stmt.close();
            System.out.println("Gravado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean altera(Empregados empregado) {
        String sql = "update empregados set nome=?, cargo=?, salario=?"
                + " where id=?";

        try {
            // prepara statment para alteração
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            // seta valores
            stmt.setInt(1, empregado.getId());
            stmt.setString(2, empregado.getNome());
            stmt.setString(3, empregado.getCargo());
            stmt.setDouble(4, empregado.getSalario());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    /**
     *
     * @param empregado
     */
    public void remove(Empregados empregado) {
        try {
            try (PreparedStatement stmt = this.connection.prepareStatement("delete from empregados where id=?")) {
                stmt.setInt(1, empregado.getId());
                stmt.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Busca todos os pedidos no bd e devolve o resultado
     *
     * @return
     */
    public List<Empregados> getLista() {

        try {
            List<Empregados> empregado = new ArrayList<Empregados>();
            String sql = "select * from empregados";
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            // conjunto de resultados
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Criando o obejto empregados
                Empregados empregados = new Empregados();
                empregados.setId(rs.getInt("id"));
                empregados.setNome(rs.getString("nome"));
                empregados.setCargo(rs.getString("cargo"));
                empregados.setSalario(rs.getDouble("salario"));
            
                // adicionando objeto a lista
                empregado.add(empregados);
            }
            rs.close();
            stmt.close();
            return empregado;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     

    public void verificaTabelasBanco() throws SQLException {

    }

    public void remove(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

