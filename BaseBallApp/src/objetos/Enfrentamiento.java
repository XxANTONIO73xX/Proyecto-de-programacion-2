package objetos;

import java.util.ArrayList;

/**
 * Esta clase tiene los parametros para crear los enfrentamientos.
 *
 * @author Equipo Maravilla Z
 * @version 02/05/2020
 */
public class Enfrentamiento {
    ArrayList<Equipo> enfrentamiento = new ArrayList<Equipo>();
    /**
     * contructor de Enfrentamiento
     * @param equipo1
     * @param equipo2 
     */
    public void Enfrentamiento(Equipo equipo1, Equipo equipo2){
        enfrentamiento.add(equipo1);
        enfrentamiento.add(equipo2);
    }
}
