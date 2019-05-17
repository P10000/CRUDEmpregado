/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import controller.EmpregadosDao;
import java.util.List;
import model.Empregados;

/**
 *
 * @author DELL
 */
public class TestaConsulta {

    public static void main(String[] args) {


        EmpregadosDao dao = new EmpregadosDao();


        for (Empregados empregado : dao.getLista()) {
            System.out.println(empregado.getId() + " " + empregado.getNome() + " " + empregado.getCargo() + " " + empregado.getSalario());
            //System.out.println(empregado.getNome());
            //System.out.println(empregado.getCargo());
            //System.out.println(empregado.getSalario());
        }
        }
    }

