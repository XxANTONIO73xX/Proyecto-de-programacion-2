/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

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
public class EstrategiaTest {
    
    public EstrategiaTest() {
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
     * Test of getNombreEstrategia method, of class Estrategia.
     */
    @Test
    public void testGetNombreEstrategia() {
        System.out.println("getNombreEstrategia");
        Estrategia instance = null;
        String expResult = "";
        String result = instance.getNombreEstrategia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreEstrategia method, of class Estrategia.
     */
    @Test
    public void testSetNombreEstrategia() {
        System.out.println("setNombreEstrategia");
        String nombreEstrategia = "";
        Estrategia instance = null;
        instance.setNombreEstrategia(nombreEstrategia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Estrategia.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Estrategia instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Estrategia.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String Descripcion = "";
        Estrategia instance = null;
        instance.setDescripcion(Descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
