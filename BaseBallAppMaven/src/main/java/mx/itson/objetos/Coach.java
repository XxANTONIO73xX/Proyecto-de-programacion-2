package mx.itson.objetos;

import java.util.ArrayList;

/**
 * Esta se usará como base para determinar el coach.
 *
 * @author equipo Maravilla Z
 * @version 02/05/2020
 */
public class Coach extends Persona {

    private ArrayList<Estrategia> estrategias;

    /**
     * constructor de coach
     *
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
     * Sobrecarga de Coach.
     */
    public Coach() {
        super(null, null, 0, 0, 0);
    }

    //Getters And Seters.
    public ArrayList<Estrategia> getEstrategias() {
        return estrategias;
    }

    public void setEstrategias(ArrayList<Estrategia> estrategias) {
        this.estrategias = estrategias;
    }
    
    public static boolean Agregar(ArrayList<Estrategia> estrategiasDelCoach, String nombre, String apellido, int edad, float altura, float peso, Equipo equipo){
        boolean fueAgregado = false;
        try {
            Coach coach = new Coach(estrategiasDelCoach, nombre, apellido, edad, altura, peso);
            equipo.setCoach(coach);
            fueAgregado = true;
        } catch (Exception e) {
            return false;
        }
        return fueAgregado;
    }
}
