package MetodosEstructura;

import java.util.ArrayList;
import objetos.Equipo;
import objetos.Jugador;

/**
 * esta clase sirve para emplear metodos de estructura de datos
 * @author Equipo Maravilla Z
 * @version 16/05/2020
 */
public class Busqueda {
    /**
     * en este metodo empleas el metodo de busqueda binaria 
     * @param vector ArrayList donde se buscara el valor
     * @param nElmentos numero de elementos del ArrayList
     * @param valor referencia con la cual se busca el elemento
     * @return el valor encontrado o en caso de no, retorna null
     */
    public Jugador busquedaBinaria(ArrayList<Jugador> vector, int nElmentos, int valor) {
        int inicio = 0;
        int fin = nElmentos - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio + fin) / 2;
            if (vector.get(pos).getNumero() == valor) {
                return vector.get(pos);
            } else if (vector.get(pos).getNumero() < valor) {
                inicio = pos + 1;
            } else {
                fin = pos - 1;
            }
        }
        return null;
    }
    /**
     * con este metodo empleas el metodo de busqueda lineal
     * @param vector ArrayList donde se buscara el valor
     * @param nElmentos numero de elementos del ArrayList
     * @param valor referencia con la cual se busca el elemento
     * @return el valor encontrado o en caso de no, retorna null
     */
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
