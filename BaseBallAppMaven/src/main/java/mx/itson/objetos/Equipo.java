package mx.itson.objetos;

import mx.itson.objetos.Coach;
import java.util.ArrayList;

/**
 * Esta clase se usará como base para la creación de equipos.
 *
 * @author Equipo Maravilla z
 * @version 16/05/2020
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
    public Equipo(int id, String nombre, String estadio, ArrayList jugadores, Coach coach) {
        this.id = id;
        this.nombre = nombre;
        this.estadio = estadio;
        this.jugadores = jugadores;
        this.coach = coach;
    }

    public Equipo(int id, String nombre, String estadio) {
        this.id = id;
        this.nombre = nombre;
        this.estadio = estadio;
    }
    
    
    
    /**
     * sobrecarga de equipo
     */
    public Equipo() {
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
    
    public static boolean Agregar(int id, String nombre, String estadio, ArrayList<Jugador> jugadores, Coach coach, ArrayList<Equipo> equipos){
        boolean fueAgregado = false;
        try {
            Equipo equipo = new Equipo(id, nombre, estadio, jugadores, coach);
            equipos.add(equipo);
            fueAgregado = true;
        } catch (Exception e) {
            return false;
        }
        return fueAgregado;
    }
    
    public static Equipo buscarEquipo(String nombre, ArrayList<Equipo> equipos){
        Equipo equipo = new Equipo();
        for(Equipo e : equipos){
            if(e.getNombre().equals(nombre)){
                equipo = e;
            }else{
                equipo = null;
            }
        }
        return equipo;
    }
    
    public static boolean eliminarEquipo(Equipo equipo, ArrayList<Equipo> equipos){
       boolean fueEliminado = false;
       try{
           equipos.remove(equipo);
           fueEliminado = true;
       }catch (Exception ex){
           return false;
       }
       return fueEliminado;
    }
}
