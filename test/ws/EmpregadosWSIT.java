/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class EmpregadosWSIT {
    
    public EmpregadosWSIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inserirEmpregado method, of class EmpregadosWS.
     * @throws java.lang.Exception
     */
    @Test
    public void testInserirEmpregado() throws Exception {
        System.out.println("inserirEmpregado");
        String content = "";
        EmpregadosWS instance = new EmpregadosWS();
        String expResult = "";
        String result;
        result = instance.insereEmpregado(content, content, content);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaJsonEmpregados method, of class EmpregadosWS.
     */
    @Test
    public void testConsultaJsonEmpregados() {
        System.out.println("consultaJsonEmpregados");
        EmpregadosWS instance = new EmpregadosWS();
        String expResult = "";
        String result = instance.consultaJsonEmpregados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of delete method, of class EmpregadosWS.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        EmpregadosWS instance = new EmpregadosWS();
        String expResult = "";
        String result = instance.deletaEmpregado(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
