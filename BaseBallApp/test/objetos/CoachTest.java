/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

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
    
}
