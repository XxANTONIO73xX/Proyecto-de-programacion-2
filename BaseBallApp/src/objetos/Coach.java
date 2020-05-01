package objetos;

import java.util.ArrayList;

/**
 * Esta se usará como base para determinar lo que hace el coach.
 * @author jose_
 * @version 29/04/2020
 */
public class Coach extends Persona { 
    private ArrayList<Estrategia> estrategias;

    /**
     * constructor de coach
     * @param estrategias sus estrategias 
     * @param nombre su nombre
     * @param apellido su apellido 
     * @param edad su edad
     * @param altura su altura 
     * @param peso su peso
     */
    public Coach(ArrayList<Estrategia> estrategias, String nombre, String apellido, int edad, float altura, float peso) {
        super(nombre, apellido, edad, altura, peso);
        this.estrategias = estrategias;
    }
    /**
     * sobrecarga de coach
     */
    public Coach() {
        super(null, null, 0, 0, 0);
    }

    
    
    
    
    //getters and setters
    public ArrayList<Estrategia> getEstrategias() {
        return estrategias;
    }

    public void setEstrategias(ArrayList<Estrategia> estrategias) {
        this.estrategias = estrategias;
    }

}
