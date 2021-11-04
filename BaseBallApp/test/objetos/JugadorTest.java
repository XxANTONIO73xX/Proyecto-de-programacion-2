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
public class JugadorTest {
    
    public JugadorTest() {
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
     * Test of getPosicion method, of class Jugador.
     */
    @Test
    public void testGetPosicion() {
        System.out.println("getPosicion");
        Jugador instance = null;
        String expResult = "";
        String result = instance.getPosicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicion method, of class Jugador.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        String posicion = "";
        Jugador instance = null;
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrazo method, of class Jugador.
     */
    @Test
    public void testGetBrazo() {
        System.out.println("getBrazo");
        Jugador instance = null;
        String expResult = "";
        String result = instance.getBrazo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBrazo method, of class Jugador.
     */
    @Test
    public void testSetBrazo() {
        System.out.println("setBrazo");
        String brazo = "";
        Jugador instance = null;
        instance.setBrazo(brazo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Jugador.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Jugador instance = null;
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Jugador.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Jugador instance = null;
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
