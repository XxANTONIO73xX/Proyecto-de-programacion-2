/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.objetos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author spoon
 */
public class CoachTest {
    
    public CoachTest() {
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
     * Test of getEstrategias method, of class Coach.
     */
    @Test
    public void testGetEstrategias() {
        System.out.println("getEstrategias");
        Coach instance = new Coach();
        ArrayList<Estrategia> expResult = null;
        ArrayList<Estrategia> result = instance.getEstrategias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstrategias method, of class Coach.
     */
    @Test
    public void testSetEstrategias() {
        System.out.println("setEstrategias");
        ArrayList<Estrategia> estrategias = null;
        Coach instance = new Coach();
        instance.setEstrategias(estrategias);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class Coach.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        ArrayList<Estrategia> estrategiasDelCoach = null;
        String nombre = "Jose";
        String apellido = "Campa";
        int edad = 22;
        float altura = (float) 1.77;
        float peso = (float) 77.5;
        Equipo equipo = new Equipo(1, "Tomateros", "Hermosillo");
        boolean result = Coach.Agregar(estrategiasDelCoach, nombre, apellido, edad, altura, peso, equipo);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
