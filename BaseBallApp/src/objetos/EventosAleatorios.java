package objetos;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Esta se usará para configurar la lógica de los eventos que pasarán en los
 * enfrentamientos.
 *
 * @author Equipo Maravilla Z
 * @version 08/05/2020
 */
public class EventosAleatorios implements Runnable {

    private JLabel lblEntrada;
    private JLabel lblOut;
    private JLabel lblStrike;
    private JLabel lblBola;
    private JLabel MarcadorLocal;
    private JLabel MarcadorVisitante;
    private JLabel Local;
    private JLabel Visitante;
    private JLabel lblTiempo;
    private JTable tblEventosAleatorios;
    private Enfrentamiento enfrentamiento;
    DefaultTableModel MtblEventosAleatorios = (DefaultTableModel) tblEventosAleatorios.getModel();
    private int numero = (int) (Math.random() * 10 + 1);
    private int base1 = 0;
    private int base2 = 0;
    private int base3 = 0;
    private int base4 = 0;

    /**
     * @author Equipo Maravilla Z
     * @version 08/05/2020
     * @param lblEntrada Label dónde se guardan las entradas del partido.
     * @param lblOut Label dónde se guardan los outs del partdo.
     * @param lblStrike Label dónde se guardan los strikes del partido.
     * @param lblBola Label dónde se guardan las bolas del partido.
     * @param MarcadorLocal Label donde se guarda el número de carreras del
     * equipo local.
     * @param MarcadorVisitantel Label donde se guarda el número de carreras del
     * equipo visitante.
     * @param Local Guarda el nombre del equipo local.
     * @param Visitante Guarda el nombre del equipo visitante.
     * @param lblTiempo Label donde se muestra el tiempo que ha transcurriido en
     * el partido.
     * @param tblEventosAleatorios Tabla donde se cargan los eventos.
     * @param base1 Guarda las acciones en la 1ra base.
     * @param base2 Guarda las acciones en la 2da base.
     * @param base3 Guarda las acciones en la 3ra base.
     * @param base4 Guarda las acciones en la 4ta base.
     * @param numero Guarda el número de...
     */
    @Override
    public void run() {
        while (true) {
            switch (numero) {
                //Hit   
                case 1: {
                    if (base1 == 0) {
                        base1++;
                        if (enfrentamiento.getEquipo1().getNombre().equals(Local.getText())) {
                            int numeroJ = (int) (Math.random() * enfrentamiento.getEquipo1().getJugadores().size() - 1);
                            MtblEventosAleatorios.addRow(new Object[]{("el jugador " + enfrentamiento.getEquipo1().getJugadores().get(numeroJ).getNombre() + " hizo un hit y corrio a primera base"), lblTiempo.getText()});
                        } else if (enfrentamiento.getEquipo2().getNombre().equals(Local.getText())) {
                            int numeroJ = (int) (Math.random() * enfrentamiento.getEquipo1().getJugadores().size() - 1);
                            MtblEventosAleatorios.addRow(new Object[]{("el jugador " + enfrentamiento.getEquipo2().getJugadores().get(numeroJ).getNombre() + " hizo un hit y corrio a primera base"), lblTiempo.getText()});
                        }
                    }
                    break;
                }
                //Strike
                case 2: {
                    break;
                }
                //Bola
                case 3: {
                    break;
                }
                //Out
                case 4: {
                    break;
                }

            }
        }
    }

}
