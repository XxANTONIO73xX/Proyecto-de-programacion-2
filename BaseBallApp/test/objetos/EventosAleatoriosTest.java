/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import javax.swing.JLabel;
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
public class EventosAleatoriosTest {
    
    public EventosAleatoriosTest() {
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
     * Test of run method, of class EventosAleatorios.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        EventosAleatorios instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CambiarEntradas method, of class EventosAleatorios.
     */
    @Test
    public void testCambiarEntradas() {
        System.out.println("CambiarEntradas");
        int out = 0;
        EventosAleatorios instance = null;
        instance.CambiarEntradas(out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RecorrerBases method, of class EventosAleatorios.
     */
    @Test
    public void testRecorrerBases() {
        System.out.println("RecorrerBases");
        Jugador jugador1 = null;
        Jugador base1 = null;
        Jugador base2 = null;
        Jugador base3 = null;
        int carrera = 0;
        JLabel Marcador = null;
        EventosAleatorios instance = null;
        instance.RecorrerBases(jugador1, base1, base2, base3, carrera, Marcador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
