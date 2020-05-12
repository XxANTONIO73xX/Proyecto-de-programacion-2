package objetos;

import java.util.ArrayList;

/**
 * Esta clase se usará como base para la creación de equipos.
 *
 * @author Equipo Maravilla z
 * @version 02/05/2020
 */
public class Equipo {

    private int id;
    private String nombre;
    private String estadio;
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Coach coach = new Coach();

    /**
     * Constructor de Equipo.
     *
     * @param id Identificador del equipo
     * @param nombre Guarda el nombre del equipo.
     * @param estadio Guarda el nombre del estadio perteneciente al equipo.
     * @param jugadores Arreglo de jugador.
     * @param coach Guarda el objeto coach.
     */
    public void Equipo(int id, String nombre, String estadio, ArrayList jugadores, Coach coach) {
        this.id = id;
        this.nombre = nombre;
        this.estadio = estadio;
        this.jugadores = jugadores;
        this.coach = coach;
    }

    //Getters And Seters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
