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
public class TesteExclusao {
    public static void main(String[] args) {
        Empregados empregado = new Empregados();
        empregado.setId(2);
        
        EmpregadosDao dao = new EmpregadosDao();
        
        dao.remove(empregado);
        
        System.out.println("Removido com sucesso!");
    }
    
    
}
