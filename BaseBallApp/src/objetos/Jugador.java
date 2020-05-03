package objetos;

/**
 * En esta clase se van a crear los jugadores heredando atributos de la clase
 * persona.
 *
 * @author equipo Maravilla Z
 * @version 02/05/2020
 */
public class Jugador extends Persona {

    private String posicion;
    private String brazo;
    private int numero;

    /**
     * constructor de jugador
     * @param posicion la posicion del jugador
     * @param brazo el brazo que domina
     * @param numero numero del jugador
     * @param nombre nombre del jugador
     * @param apellido apellido del jugador
     * @param edad edad del jugador
     * @param altura altura del jugador
     * @param peso peso del jugador
     */
    public Jugador(String posicion, String brazo, int numero, String nombre, String apellido, int edad, float altura, float peso) {
        super(nombre, apellido, edad, altura, peso);
        this.posicion = posicion;
        this.brazo = brazo;
        this.numero = numero;
    }
    //setters y getters
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getBrazo() {
        return brazo;
    }

    public void setBrazo(String brazo) {
        this.brazo = brazo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
