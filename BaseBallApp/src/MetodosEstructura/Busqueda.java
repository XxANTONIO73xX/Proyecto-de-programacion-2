/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosEstructura;

import java.util.ArrayList;
import objetos.Equipo;
import objetos.Jugador;

/**
 *
 * @author Propietario
 */
public class Busqueda {

    public Jugador busquedaBinaria(ArrayList<Jugador> vector, int nElmentos, String valor) {
        int inicio = 0;
        int fin = nElmentos - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio + fin) / 2;
            if (vector.get(pos).getNombre().equals(valor)) {
                return vector.get(pos);
            } else if (vector.get(pos).getNombre() != valor) {
                inicio = pos + 1;
            } else {
                fin = pos - 1;
            }
        }
        return null;
    }

    public Equipo busquedaLineal(ArrayList<Equipo> vector, int nElmentos, String valor) {
        int i;
        for (i = 0; i < nElmentos; i++) {
            if (vector.get(i).getNombre().equals(valor)) {
                return vector.get(i);
            }
        }
        return null;
    }

}
