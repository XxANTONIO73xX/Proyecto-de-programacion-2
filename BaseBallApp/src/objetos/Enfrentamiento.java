package objetos;

import java.util.ArrayList;

/**
 * esta clase creara los enfrentamientos
 * @author Propietario
 * @version 29/04/2020
 */
public class Enfrentamiento {
    private Equipo equipo1; 
    private Equipo equipo2; 
    private ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    
    /**
     * sobrecarga de enfrentamiento 
     */
    public Enfrentamiento() {
    }

    /**
     * constructor de enfrentamiento
     * @param equipo1 equipo que participara en el enfrentamiento
     * @param equipo2 equipo que participara en el enfrentamiento
     */
    public Enfrentamiento(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }
 
    
    
    //getters y setters
    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    
}
