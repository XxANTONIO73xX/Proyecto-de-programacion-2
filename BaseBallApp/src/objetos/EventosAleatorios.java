package objetos;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

    ArrayList<Equipo> enfrentamiento;
    private JLabel lblEntrada;
    private JLabel lblNombreLocal;
    private JLabel lblNombreVisitante;
    private JLabel lblOut;
    private JLabel lblStrike;
    private JLabel lblBola;
    private JLabel MarcadorLocal;
    private JLabel MarcadorVisitante;
    private JLabel lblTiempo;
    private JTable tblEventosAleatorios;
    DefaultTableModel MtblEventosAleatorios;
    Jugador base1;
    Jugador base2;
    Jugador base3;
    Timer tiempo;
    Thread t;

    public EventosAleatorios(JLabel lblEntrada, JLabel lblOut, JLabel lblStrike, JLabel lblBola, JLabel MarcadorLocal, JLabel MarcadorVisitante, JLabel lblTiempo, JTable tblEventosAleatorios, DefaultTableModel MtblEventosAleatorios, Timer tiempo, Thread t, JLabel lblNombreLocal, JLabel lblNombreVisitante, ArrayList<Equipo> enfrentamiento) {
        this.lblEntrada = lblEntrada;
        this.lblOut = lblOut;
        this.lblStrike = lblStrike;
        this.lblBola = lblBola;
        this.MarcadorLocal = MarcadorLocal;
        this.MarcadorVisitante = MarcadorVisitante;
        this.lblTiempo = lblTiempo;
        this.tblEventosAleatorios = tblEventosAleatorios;
        this.MtblEventosAleatorios = MtblEventosAleatorios;
        this.tiempo = tiempo;
        this.t = t;
        this.lblNombreLocal = lblNombreLocal;
        this.lblNombreVisitante = lblNombreVisitante;
        this.enfrentamiento = enfrentamiento;
    }

    @Override
    public void run() {
        String entrada = lblEntrada.getText();
        int out = 0;
        int bola = 0;
        int strike = 0;
        int carrera = 0;
        Random aleatorio = new Random();

        for (int i = 1; i <= 9; i++) {
            JOptionPane.showMessageDialog(null, "Ha empezado la entrada numero: " + i);
            CambiarEntradas(out, entrada);
            out = 0;
            bola = 0;
            strike = 0;
            carrera = 0;
            try {
                Thread.sleep(1000);
                if (entrada.equals("Alta")) {
                    out = 0;
                    carrera = Integer.parseInt(MarcadorLocal.getText());
                    base1 = null;
                    base2 = null;
                    base3 = null;
                    do {
                        int numVueltas = 1 + aleatorio.nextInt(enfrentamiento.get(0).getJugadores().size());
                        for (int j = 1; j <= numVueltas; j++) {
                            int caso = 1 + aleatorio.nextInt(4);
                            switch (caso) {
                                case 1: { // hit
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(j).getNombre(), "EL bateador acierta", lblTiempo.getText()});
                                    RecorrerBases(enfrentamiento.get(0).getJugadores().get(j), base1, base2, base3, carrera, MarcadorLocal);
                                    Thread.sleep(2000);
                                    break;
                                }
                                case 2: { // strike
                                    strike++;
                                    lblStrike.setText(Integer.toString(strike));
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(j).getNombre(), "EL bateador hace un strike", lblTiempo.getText()});
                                    int subcaso = 1 + aleatorio.nextInt(2);
                                    Thread.sleep(2000);
                                    switch (subcaso) {
                                        case 1: { //hace un hit y se recorre
                                            MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(j).getNombre(), "El bateador acierta", lblTiempo.getText()});
                                            RecorrerBases(enfrentamiento.get(0).getJugadores().get(j), base1, base2, base3, carrera, MarcadorLocal);
                                            Thread.sleep(2000);
                                            break;
                                        }
                                        case 2: { // hace otros strikes y se le acumula un out
                                            strike++;
                                            lblStrike.setText(Integer.toString(strike));
                                            MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(j).getNombre(), "EL bateador hace un strike", lblTiempo.getText()});
                                            Thread.sleep(1000);
                                            strike++;
                                            lblStrike.setText(Integer.toString(strike));
                                            MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(j).getNombre(), "EL bateador hace un strike y acumula un out", lblTiempo.getText()});
                                            Thread.sleep(1000);
                                            out++;
                                            lblOut.setText(Integer.toString(out));
                                            Thread.sleep(2000);
                                            break;
                                        }
                                    }
                                    break;
                                }
                                case 3: { // out
                                    out++;
                                    lblOut.setText(Integer.toString(out));
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(j).getNombre(), "el bateador acerto y corrio hacia primera", lblTiempo.getText()});
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(j).getNombre(), "el bateador es ponchado antes de llegar", lblTiempo.getText()});
                                    Thread.sleep(2000);
                                    break;
                                }
                                case 4: { // homeRun
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(j).getNombre(), "EL bateador hace un HOME RUN", lblTiempo.getText()});
                                    carrera++;
                                    MarcadorLocal.setText(Integer.toString(carrera));
                                    if (base1 != null) {
                                        carrera++;
                                        MarcadorLocal.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base1.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                        Thread.sleep(2000);
                                    }
                                    if (base2 != null) {
                                        carrera++;
                                        MarcadorLocal.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base2.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                        Thread.sleep(2000);
                                    }
                                    if (base3 != null) {
                                        carrera++;
                                        MarcadorLocal.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base3.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                        Thread.sleep(2000);
                                    }
                                    break;
                                }
                            }
                        }
                    } while (out < 3);
                    break;
                }
                Thread.sleep(1000);
                if (entrada.equals("Baja")) {
                    out = 0;
                    carrera = Integer.parseInt(MarcadorVisitante.getText());
                    base1 = null;
                    base2 = null;
                    base3 = null;
                    do {
                        int numVueltas = 1 + aleatorio.nextInt(enfrentamiento.get(1).getJugadores().size());
                        for (int j = 1; j <= numVueltas; j++) {
                            int caso = 1 + aleatorio.nextInt(4);
                            switch (caso) {
                                case 1: { // hit
                                    Thread.sleep(2000);
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "EL bateador acierta", lblTiempo.getText()});
                                    RecorrerBases(enfrentamiento.get(1).getJugadores().get(j), base1, base2, base3, carrera, MarcadorLocal);
                                    break;
                                }
                                case 2: { // strike
                                    Thread.sleep(2000);
                                    strike++;
                                    lblStrike.setText(Integer.toString(strike));
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "EL bateador hace un strike", lblTiempo.getText()});
                                    int subcaso = 1 + aleatorio.nextInt(2);
                                    switch (subcaso) {
                                        case 1: { //hace un hit y se recorre
                                            Thread.sleep(2000);
                                            MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "El bateador acierta", lblTiempo.getText()});
                                            RecorrerBases(enfrentamiento.get(1).getJugadores().get(j), base1, base2, base3, carrera, MarcadorLocal);
                                            break;
                                        }
                                        case 2: { // hace otros strikes y se le acumula un out
                                            Thread.sleep(2000);
                                            strike++;
                                            lblStrike.setText(Integer.toString(strike));
                                            MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "EL bateador hace un strike", lblTiempo.getText()});
                                            strike++;
                                            lblStrike.setText(Integer.toString(strike));
                                            MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "EL bateador hace un strike y acumula un out", lblTiempo.getText()});
                                            out++;
                                            lblOut.setText(Integer.toString(out));
                                            break;
                                        }
                                    }
                                    break;
                                }
                                case 3: { // out
                                    Thread.sleep(2000);
                                    out++;
                                    lblOut.setText(Integer.toString(out));
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "el bateador acerto y corrio hacia primera", lblTiempo.getText()});
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "el bateador es ponchado antes de llegar", lblTiempo.getText()});
                                    break;
                                }
                                case 4: { // homeRun
                                    Thread.sleep(2000);
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "EL bateador hace un HOME RUN", lblTiempo.getText()});
                                    carrera++;
                                    MarcadorLocal.setText(Integer.toString(carrera));
                                    Thread.sleep(1000);
                                    if (base1 != null) {
                                        carrera++;
                                        MarcadorLocal.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base1.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                    }
                                    Thread.sleep(1000);
                                    if (base2 != null) {
                                        carrera++;
                                        MarcadorLocal.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base2.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                    }
                                    Thread.sleep(1000);
                                    if (base3 != null) {
                                        carrera++;
                                        MarcadorLocal.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base3.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                    }
                                    break;
                                }
                            }
                        }
                    } while (out < 3);
                    break;
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "el partido no ha comenzado");
            }

        }

    }

    public void CambiarEntradas(int out, String entrada) {
        if (entrada.equals("Alta")) {
            if (out == 3) {
                entrada = "Baja";
                lblEntrada.setText(entrada);
            }
        } else if (entrada.equals("Baja")) {
            if (out == 3) {
                entrada = "Alta";
                lblEntrada.setText(entrada);
            }
        }
    }

    public void RecorrerBases(Jugador jugador1, Jugador base1, Jugador base2, Jugador base3, int carrera, JLabel Marcador) {

        Jugador auxiliar1;
        Jugador auxiliar2;
        auxiliar1 = base1;
        auxiliar2 = base2;
        //home
        if (base3 != null) {
            MtblEventosAleatorios.addRow(new Object[]{base3.getNombre(), "Llega a home acumulando una carrera", lblTiempo.getText()});
            carrera++;
            Marcador.setText(Integer.toString(carrera));
        }
        //base1
        jugador1 = base1;
        MtblEventosAleatorios.addRow(new Object[]{jugador1.getNombre(), "Corre a primera base", lblTiempo.getText()});
        auxiliar1 = base2;
        //base2
        if (auxiliar1 != null) {
            MtblEventosAleatorios.addRow(new Object[]{auxiliar1.getNombre(), "Corre a segunda base", lblTiempo.getText()});
        }
        auxiliar2 = base3;
        //base3
        if (auxiliar2 != null) {
            MtblEventosAleatorios.addRow(new Object[]{auxiliar2.getNombre(), "Corre a tercera base", lblTiempo.getText()});

        }

    }
}
