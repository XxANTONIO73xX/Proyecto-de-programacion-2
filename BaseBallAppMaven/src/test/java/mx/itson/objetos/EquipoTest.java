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
public class EquipoTest {
    
    public EquipoTest() {
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
     * Test of getNombre method, of class Equipo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Equipo instance = new Equipo();
        instance.setNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Equipo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Equipo instance = new Equipo();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadio method, of class Equipo.
     */
    @Test
    public void testGetEstadio() {
        System.out.println("getEstadio");
        Equipo instance = new Equipo();
        instance.setEstadio("");
        String expResult = "";
        String result = instance.getEstadio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadio method, of class Equipo.
     */
    @Test
    public void testSetEstadio() {
        System.out.println("setEstadio");
        String estadio = "";
        Equipo instance = new Equipo();
        instance.setEstadio(estadio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getJugadores method, of class Equipo.
     */
    @Test
    public void testGetJugadores() {
        System.out.println("getJugadores");
        Equipo instance = new Equipo();
        instance.setJugadores(null);
        ArrayList<Jugador> expResult = null;
        ArrayList<Jugador> result = instance.getJugadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setJugadores method, of class Equipo.
     */
    @Test
    public void testSetJugadores() {
        System.out.println("setJugadores");
        ArrayList<Jugador> jugadores = null;
        Equipo instance = new Equipo();
        instance.setJugadores(jugadores);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCoach method, of class Equipo.
     */
    @Test
    public void testGetCoach() {
        System.out.println("getCoach");
        Equipo instance = new Equipo();
        instance.setCoach(null);
        Coach expResult = null;
        Coach result = instance.getCoach();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCoach method, of class Equipo.
     */
    @Test
    public void testSetCoach() {
        System.out.println("setCoach");
        Coach coach = null;
        Equipo instance = new Equipo();
        instance.setCoach(coach);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Equipo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Equipo instance = new Equipo();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Equipo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Equipo instance = new Equipo();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class Equipo.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        int id = 2;
        String nombre = "Tomateros";
        String estadio = "Hermosillo";
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        Coach coach = new Coach();
        coach.setNombre("Jose");
        ArrayList<Equipo> equipos = new ArrayList<Equipo>();
        boolean result = Equipo.Agregar(id, nombre, estadio, jugadores, coach, equipos);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarEquipo method, of class Equipo.
     */
    @Test
    public void testBuscarEquipo() {
        System.out.println("buscarEquipo");
        String nombre = "Tomateros";
        ArrayList<Equipo> equipos = new ArrayList<Equipo>();
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        Coach coach = new Coach();
        coach.setNombre("Jose");
        Equipo.Agregar(2, "Tomateros", "Hermosillo", jugadores, coach, equipos);
        Equipo expResult = equipos.get(0);
        Equipo result = Equipo.buscarEquipo(nombre, equipos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEquipo method, of class Equipo.
     */
    @Test
    public void testEliminarEquipo() {
        System.out.println("eliminarEquipo");
        ArrayList<Equipo> equipos = new ArrayList<Equipo>();
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        Coach coach = new Coach();
        coach.setNombre("Jose");
        Equipo.Agregar(2, "Tomateros", "Hermosillo", jugadores, coach, equipos);
        Equipo equipo = equipos.get(0);
        boolean result = Equipo.eliminarEquipo(equipo, equipos);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
