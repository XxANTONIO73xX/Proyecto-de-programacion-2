
package objetos;

/**
 * Esta se usará como base para las estrategias del coach.
 * @author jose_
 * @version 29/04/2020
 */
public class Estrategia {
    
    private String nombreEstrategia;
    private String Descripcion;
    
    /**
     * Constructor de Estrategia
     * @param nombreEstrategia el nombre de la estrategia.
     * @param Descripcion la descripcion de la estrategia.
     */

    public Estrategia(String nombreEstrategia, String Descripcion) {
        this.nombreEstrategia = nombreEstrategia;
        this.Descripcion = Descripcion;
    }

    //getters and setters
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
