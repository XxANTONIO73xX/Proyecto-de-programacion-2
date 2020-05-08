package objetos;

/**
 * Esta clase tiene los parametros para crear los enfrentamientos.
 *
 * @author Equipo Maravilla Z
 * @version 02/05/2020
 */
public class Enfrentamiento {

    private Equipo equipo1;
    private Equipo equipo2;

    /**
     * Sobrecarga de enfrentamiento.
     */
    public Enfrentamiento() {
    }

    /**
     * Constructor de enfrentamiento.
     *
     * @param equipo1 Equipo que participará en el enfrentamiento.
     * @param equipo2 Equipo que participará en el enfrentamiento.
     */
    public Enfrentamiento(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    //Getters And Seters.
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
}
