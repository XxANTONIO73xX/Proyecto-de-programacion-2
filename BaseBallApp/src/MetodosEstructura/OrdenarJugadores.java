package MetodosEstructura;

import java.util.ArrayList;
import objetos.Jugador;

/**
 *
 * @author juan.m.osuna
 */
public class OrdenarJugadores {

    public OrdenarJugadores() {

    }

    public ArrayList<Jugador> bubbleSort(ArrayList<Jugador> jugadores, int nElementos) {

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
                    jugadores.remove(j);
                    jugadores.add(j, jugadores.get(j + 1)); 
                    jugadores.add((j + 1), auxiliar);

                }

            }

        }

        return jugadores;
    }

    public int[] insertionSort(int[] vector, int nElementos) {

        /*
        Este método esta basado en la técnica utilizada por los jugadores de cartas para clasificar sus cartas. 
        El jugador va colocando (insertando) cada carta en su posición correcta.
        Este método se basa en considerar una parte de la lista ya ordenada y situar cada uno de los elementos 
        restantes insertándolos en el lugar que le corresponda por su valor, todos los valores a la derecha se desplazan una posición para dejar espacio.
         */
        for (int i = 1; i < nElementos; i++) {

            int aux = vector[i];
            int j;

            for (j = i - 1; j >= 0 && vector[j] > aux; j--) {
                vector[j + 1] = vector[j];
                vector[j] = aux;
            }

        }

        return vector;
    }

    public int[] selectionSort(int[] vector, int nElementos) {

        /*
        Partiendo de una lista de elementos n (vector), se localiza el elemento mayor y se intercambia por el elemento 1, 
        se repite el proceso de n-1 elementos hasta terminar la ordenación de los elementos de la lista.
         */
        for (int i = 0; i < nElementos - 1; i++) {

            int min = i;

            for (int j = i + 1; j < nElementos; j++) {

                if (vector[j] < vector[min]) {
                    min = j;
                }
            }

            if (i != min) {

                int aux = vector[i];
                vector[i] = vector[min];
                vector[min] = aux;
            }

        }

        return vector;
    }

    public int[] shellSort(int[] vector, int nElementos) {
        for (int incremento = nElementos / 2;
                incremento > 0;
                incremento = (incremento == 2 ? 1 : (int) Math.round(incremento / 2.2))) {
            for (int i = incremento; i < vector.length; i++) {
                for (int j = i; j >= incremento && vector[j - incremento] > vector[j]; j -= incremento) {
                    int temp = vector[j];
                    vector[j] = vector[j - incremento];
                    vector[j - incremento] = temp;
                }
            }
        }
        return vector;
    }

    public int[] quickSort(int[] vector, int primero, int ultimo) {
        
        /*
        Es uno de los métodos más rápidos y más frecuentemente utilizados. 
        Cuenta con pequeño código y excelente velocidad de ejecución.
        */
        
        int i = primero, j = ultimo;
        int pivote = vector[(primero + ultimo) / 2];
        int auxiliar;

        do {
            while (vector[i] < pivote) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }

            if (i <= j) {
                auxiliar = vector[j];
                vector[j] = vector[i];
                vector[i] = auxiliar;
                i++;
                j--;
            }

        } while (i <= j);

        if (primero < j) {
            quickSort(vector, primero, j);
        }
        if (ultimo > i) {
            quickSort(vector, i, ultimo);
        }

        return vector;
    }

    public void imprimir(int[] vector, int nElementos) {
        for (int i = 0; i < nElementos; i++) {
            System.out.println("vector[" + i + "] = " + vector[i]);
        }
    }

}
