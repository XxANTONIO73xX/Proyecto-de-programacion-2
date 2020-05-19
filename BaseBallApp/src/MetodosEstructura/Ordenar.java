package MetodosEstructura;

import java.util.ArrayList;
import objetos.Equipo;
import objetos.Jugador;

/**
 * esta clase sirve para emplear metodos de estructura de datos
 * @author Equipo Maravilla Z
 * @version 16/05/2020
 */
public class Ordenar {
    /**
     * contructor de Ordenar 
     */
    public Ordenar() {
    }
    /**
     * con este metodo empleas el metodo de ordenamiento burbuja
     * @param jugadores ArrayList a ordenar
     * @param nElementos El numero de elementos que hay en el ArrayList
     */
    public void bubbleSort(ArrayList<Jugador> jugadores, int nElementos) {
        /*
        Este método es clásico y muy sencillo, aunque poco eficiente. 
        Se basa en comparar elementos adyacentes de la lista (vector) e intercambiar sus valores si estan desordenados. 
        De este modo se dice que los valores más pequeños burbujean hacia la parte superior de la lista (hacia el primer elemento) , 
        mientras que los valores más grandes se hunden hacia el fondo de la lista.        
         */
        Jugador auxiliar;

        for (int i = 0; i < nElementos - 1; i++) {

            for (int j = 0; j < nElementos - 1; j++) {

                if (jugadores.get(j).getNumero() > jugadores.get(j + 1).getNumero()) {

                    auxiliar = jugadores.get(j);
                    jugadores.set(j, jugadores.get(j + 1));
                    //vector[j + 1] = auxiliar;
                    jugadores.set((j + 1), auxiliar);
                }

            }

        }
    }
    
    /**
     * este metodo sirve para acomodar los equipos de menor a mayor
     * @param vector el Array a acomodar
     * @param nElementos el numero de elementos dentro del array
     */
        public void insertionSort(ArrayList<Equipo> vector, int nElementos) {

        /*
        Este método esta basado en la técnica utilizada por los jugadores de cartas para clasificar sus cartas. 
        El jugador va colocando (insertando) cada carta en su posición correcta.
        Este método se basa en considerar una parte de la lista ya ordenada y situar cada uno de los elementos 
        restantes insertándolos en el lugar que le corresponda por su valor, todos los valores a la derecha se desplazan una posición para dejar espacio.
         */
        for (int i = 1; i < nElementos; i++) {

            Equipo aux = vector.get(i);
            int j;

            for (j = i - 1; j >= 0 && vector.get(j).getId() > aux.getId(); j--) {
                //vector[j + 1] = vector[j];
                vector.set(j + 1, vector.get(j));
                //vector[j] = aux;
                vector.set(j, aux);
            }

        }
    }
}
