package MetodosEstructura;

import java.util.ArrayList;
import objetos.Equipo;
import objetos.Jugador;

/**
 *
 * @author juan.m.osuna
 */
public class Ordenar {

    public Ordenar() {

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

    public ArrayList<Equipo> quickSort(ArrayList<Equipo> vector, int primero, int ultimo) {
        
        /*
        Es uno de los métodos más rápidos y más frecuentemente utilizados. 
        Cuenta con pequeño código y excelente velocidad de ejecución.
        */
        
        int i = primero, j = ultimo;
        Equipo pivote = vector.get(((primero + ultimo) / 2));
        Equipo auxiliar;

        do {
            while (vector.get(i).getId() < pivote.getId()) {
                i++;
            }
            while (vector.get(j).getId() > pivote.getId()) {
                j--;
            }

            if (i <= j) {
                auxiliar = vector.get(j);
                vector.remove(j);
                vector.add(j, vector.get(i));
                vector.add(i, auxiliar);
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
}