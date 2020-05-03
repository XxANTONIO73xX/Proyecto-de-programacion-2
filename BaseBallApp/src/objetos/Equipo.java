
package objetos;

import java.util.ArrayList;

/** Esta clase se usara como base para la creación de equipos.
 * @author equipo Maravilla z
 * @version 02/05/2020 
 */
public class Equipo {
    
    private String nombre;
    private String estadio;
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Coach coach = new Coach();
    
      /**
       * constructor de Equipo
       * @param nombre Guarda el nombre del equipo.
       * @param estadio Guarda el nombre del estadio perteneciente al equipo.
       * @param jugadores Arreglo de jugador.
       * @param coach guarda el objeto coach
       */
    public void Equipo (String nombre, String estadio, ArrayList jugadores, Coach coach){
        this.nombre = nombre;
        this.estadio = estadio;
        this.jugadores = jugadores;
        this.coach = coach;
    }
    
    //setters y getters
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
    
    
    
}
