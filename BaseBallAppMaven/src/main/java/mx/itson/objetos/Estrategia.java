package mx.itson.objetos;

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

}
