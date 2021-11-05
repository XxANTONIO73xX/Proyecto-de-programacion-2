/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.intefazUsuario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author User
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({mx.itson.intefazUsuario.JEnfrentamientosTest.class, mx.itson.intefazUsuario.MostrarJugadoresTest.class, mx.itson.intefazUsuario.JPartidoTest.class, mx.itson.intefazUsuario.MostrarEquiposTest.class, mx.itson.intefazUsuario.JEquiposTest.class, mx.itson.intefazUsuario.JCoachTest.class, mx.itson.intefazUsuario.EliminarEquiposTest.class, mx.itson.intefazUsuario.EliminarJugadoresTest.class, mx.itson.intefazUsuario.JJugadorTest.class})
public class IntefazUsuarioSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
