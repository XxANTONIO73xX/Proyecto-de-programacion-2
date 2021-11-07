/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.objetos;

import java.lang.reflect.Array;
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
        Jugador instance = new Jugador();
        instance.setPosicion("");
        String expResult = "";
        String result = instance.getPosicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicion method, of class Jugador.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        String posicion = "";
        Jugador instance = new Jugador();
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBrazo method, of class Jugador.
     */
    @Test
    public void testGetBrazo() {
        System.out.println("getBrazo");
        Jugador instance = new Jugador();
        instance.setBrazo("");
        String expResult = "";
        String result = instance.getBrazo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBrazo method, of class Jugador.
     */
    @Test
    public void testSetBrazo() {
        System.out.println("setBrazo");
        String brazo = "";
        Jugador instance = new Jugador();
        instance.setBrazo(brazo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Jugador.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Jugador instance = new Jugador();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Jugador.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Jugador instance = new Jugador();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarJugador method, of class Jugador.
     */
    @Test
    public void testAgregarJugador() {
        System.out.println("agregarJugador");
        String posicion = "picher";
        String brazo = "izq";
        int numero = 20;
        String nombre = "Jesus";
        String apellido = "Navarrete";
        int edad = 19;
        float altura = (float) 1.75;
        float peso = (float) 140.5;
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        boolean result = Jugador.agregarJugador(posicion, brazo, numero, nombre, apellido, edad, altura, peso, jugadores);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarJugador method, of class Jugador.
     */
    @Test
    public void testBuscarJugador() {
        System.out.println("buscarJugador");
        String nombre = "Jesus";
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();;
        Jugador.agregarJugador("picher", "izq", 20, "Jesus", "Navarrete", 19, (float) 1.75, (float)140.5, jugadores);
        Jugador expResult = jugadores.get(0);
        Jugador result = Jugador.buscarJugador(nombre, jugadores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarJugador method, of class Jugador.
     */
    @Test
    public void testEliminarJugador() {
        System.out.println("eliminarJugador");
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();;
        Jugador.agregarJugador("picher", "izq", 20, "Jesus", "Navarrete", 19, (float) 1.75, (float)140.5, jugadores);
        Jugador jugador = jugadores.get(0);
        boolean result = Jugador.eliminarJugador(jugador, jugadores);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
