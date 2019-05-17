/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import controller.EmpregadosDao;
import model.Empregados;

/**
 *
 * @author DELL
 */
public class TesteUpdate {
    public static void main(String[] args) {
        Empregados empregados = new Empregados();
        EmpregadosDao dao = new EmpregadosDao();
        
        empregados.setId(7);
        empregados.setNome("AAAAAA");
        empregados.setCargo("BBBBB");
        empregados.setSalario(120.00);
        
        dao.altera(empregados);
        System.out.println("Alterado!");
    }
}
