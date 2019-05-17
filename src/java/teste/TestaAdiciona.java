/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import controller.EmpregadosDao;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Empregados;

/**
 *
 * @author DELL
 */
public class TestaAdiciona {
    public static void main(String[] args) {
        Empregados e = new Empregados();
        
        //e.setId(2);
        e.setNome("Jadson Sousa");
        e.setCargo("Desenvolvedor");
        e.setSalario(5000.0);
        
        EmpregadosDao dao = new EmpregadosDao();
        
        try {
            dao.adiciona(e);
        } catch (ParseException ex) {
            Logger.getLogger(TestaAdiciona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
