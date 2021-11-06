package mx.itson.objetos;

import java.util.ArrayList;

/**
 * Esta se usará como base para las estrategias del coach.
 *
 * @author Equipo Maravilla Z
 * @version 02/05/2020
 */
public class Estrategia {

    private String nombreEstrategia;
    private String Descripcion;

    /**
     * Constructor de Estrategia.
     *
     * @param nombreEstrategia El nombre de la estrategia.
     * @param Descripcion La descripcion de la estrategia.
     */
    public Estrategia(String nombreEstrategia, String Descripcion) {
        this.nombreEstrategia = nombreEstrategia;
        this.Descripcion = Descripcion;
    }

    //Getters And Seters.
    public String getNombreEstrategia() {
        return nombreEstrategia;
    }

    public void setNombreEstrategia(String nombreEstrategia) {
        this.nombreEstrategia = nombreEstrategia;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public static boolean Agregar(ArrayList<Estrategia> estrategias, ArrayList<Estrategia> estrategiasDelCoach, String nombre){
        boolean fueAgreado = false;
        try {
            for(Estrategia e: estrategias){
                if(e.getNombreEstrategia().equals(nombre)){
                    estrategiasDelCoach.add(e);
                }
            }
        } catch (Exception e) {
            return false;
        }
        return fueAgreado;
    }
}
