package mx.itson.objetos;

/**
 * Esta se usará como base para los jugadores y el coach.
 *
 * @author equipo Maravilla Z
 * @version 02/05/2020
 */
public abstract class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private float altura;
    private float peso;

    /**
     * Constructor de persona.
     *
     * @param nombre el nombre de la persona
     * @param apellido el apellido de la persona
     * @param edad la edad de la persona
     * @param altura la altura de la persona
     * @param peso el peso de la persona
     */
    public Persona(String nombre, String apellido, int edad, float altura, float peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    //Getters And Seters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
