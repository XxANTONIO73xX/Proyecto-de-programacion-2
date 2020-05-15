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
    Jugador auxiliar1 = new Jugador("", "", 0, "", "", 0, 0, 0);
    Jugador auxiliar2 = new Jugador("", "", 0, "", "", 0, 0, 0);
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
        int out = 0;
        int bola = 0;
        int strike = 0;
        int carrera = 0;
        Random aleatorio = new Random();
            try {
        for (int i = 1; i <= 9; i++) {
            JOptionPane.showMessageDialog(null, "Ha empezado la entrada numero: " + i);
            CambiarEntradas(out);
            out = 0;
            lblOut.setText(Integer.toString(out));
            bola = 0;
            lblBola.setText(Integer.toString(bola));
            strike = 0;
            lblStrike.setText(Integer.toString(strike));
            carrera = 0;
                Thread.sleep(1000);
                if (lblEntrada.getText().equals("Alta")) {
                    out = 0;
                    carrera = Integer.parseInt(MarcadorLocal.getText());
                    base1 = new Jugador("", "", 0, "", "", 0, 0, 0);
                    base2 = new Jugador("", "", 0, "", "", 0, 0, 0);
                    base3 = new Jugador("", "", 0, "", "", 0, 0, 0);
                    do {
                        for (int j = 0; j < enfrentamiento.get(0).getJugadores().size() - 1; j++) {
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
                                    strike = 0;
                                    lblStrike.setText(Integer.toString(strike));
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
                                    if (base1.getNumero() != 0) {
                                        carrera++;
                                        MarcadorLocal.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base1.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                        Thread.sleep(2000);
                                    }
                                    if (base2.getNumero() != 0) {
                                        carrera++;
                                        MarcadorLocal.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base2.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                        Thread.sleep(2000);
                                    }
                                    if (base3.getNumero() != 0) {
                                        carrera++;
                                        MarcadorLocal.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base3.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                        Thread.sleep(2000);
                                    }
                                    break;
                                }
                            }
                            if(out == 3){
                              break;  
                            }
                        }
                    } while (out < 3);
                }
                Thread.sleep(1000);
                if (lblEntrada.getText().equals("Baja")) {
                    out = 0;
                    carrera = Integer.parseInt(MarcadorVisitante.getText());
                    base1 = new Jugador("", "", 0, "", "", 0, 0, 0);
                    base2 = new Jugador("", "", 0, "", "", 0, 0, 0);
                    base3 = new Jugador("", "", 0, "", "", 0, 0, 0);
                    do {
                        for (int j = 0; j < enfrentamiento.get(1).getJugadores().size() - 1; j++) {
                            int caso = 1 + aleatorio.nextInt(4);
                            switch (caso) {
                                case 1: { // hit
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "EL bateador acierta", lblTiempo.getText()});
                                    RecorrerBases(enfrentamiento.get(1).getJugadores().get(j), base1, base2, base3, carrera, MarcadorVisitante);
                                    Thread.sleep(2000);
                                    break;
                                }
                                case 2: { // strike
                                    strike++;
                                    lblStrike.setText(Integer.toString(strike));
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "EL bateador hace un strike", lblTiempo.getText()});
                                    int subcaso = 1 + aleatorio.nextInt(2);
                                    Thread.sleep(2000);
                                    switch (subcaso) {
                                        case 1: { //hace un hit y se recorre
                                            MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "El bateador acierta", lblTiempo.getText()});
                                            RecorrerBases(enfrentamiento.get(1).getJugadores().get(j), base1, base2, base3, carrera, MarcadorVisitante);
                                            Thread.sleep(2000);
                                            break;
                                        }
                                        case 2: { // hace otros strikes y se le acumula un out
                                            strike++;
                                            lblStrike.setText(Integer.toString(strike));
                                            MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "EL bateador hace un strike", lblTiempo.getText()});
                                            Thread.sleep(1000);
                                            strike++;
                                            lblStrike.setText(Integer.toString(strike));
                                            MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "EL bateador hace un strike y acumula un out", lblTiempo.getText()});
                                            Thread.sleep(1000);
                                            out++;
                                            lblOut.setText(Integer.toString(out));
                                            Thread.sleep(2000);
                                            break;
                                        }
                                    }
                                    strike = 0;
                                    lblStrike.setText(Integer.toString(strike));
                                    break;
                                }
                                case 3: { // out
                                    out++;
                                    lblOut.setText(Integer.toString(out));
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "el bateador acerto y corrio hacia primera", lblTiempo.getText()});
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "el bateador es ponchado antes de llegar", lblTiempo.getText()});
                                    Thread.sleep(2000);
                                    break;
                                }
                                case 4: { // homeRun
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(j).getNombre(), "EL bateador hace un HOME RUN", lblTiempo.getText()});
                                    carrera++;
                                    MarcadorVisitante.setText(Integer.toString(carrera));
                                    if (base1.getNumero() != 0) {
                                        carrera++;
                                        MarcadorVisitante.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base1.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                        Thread.sleep(2000);
                                    }
                                    if (base2.getNumero() != 0) {
                                        carrera++;
                                        MarcadorVisitante.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base2.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                        Thread.sleep(2000);
                                    }
                                    if (base3.getNumero() != 0) {
                                        carrera++;
                                        MarcadorVisitante.setText(Integer.toString(carrera));
                                        MtblEventosAleatorios.addRow(new Object[]{base3.getNombre(), "Corre hacia HOME", lblTiempo.getText()});
                                        Thread.sleep(2000);
                                    }
                                    break;
                                }
                            }
                            if(out == 3){
                              break;  
                            }
                        }
                    } while (out < 3);
                }

            }

        } catch (Exception e) {
                System.out.println(e);
            }

    }

    public void CambiarEntradas(int out) {
        if (lblEntrada.getText().equals("Alta")) {
            if (out == 3) {
                lblEntrada.setText("Baja");
            }
        } else if (lblEntrada.getText().equals("Baja")) {
            if (out == 3) {
                lblEntrada.setText("Alta");
            }
        }
    }


    public void RecorrerBases(Jugador jugador1, Jugador base1, Jugador base2, Jugador base3, int carrera, JLabel Marcador) {
        //home
        if (base3.getNumero() != 0) {
            MtblEventosAleatorios.addRow(new Object[]{base3.getNombre(), "Llega a home acumulando una carrera", lblTiempo.getText()});
            carrera++;
            Marcador.setText(Integer.toString(carrera));
        }
        //base2
        if (base1.getNumero() != 0) {
        auxiliar1 = base1;
        base2 = auxiliar1;
            MtblEventosAleatorios.addRow(new Object[]{auxiliar1.getNombre(), "Corre a segunda base", lblTiempo.getText()});
        }
        //base3
        if (base2.getNumero() != 0) {
        auxiliar2 = base2;
        base3 = auxiliar2;
            MtblEventosAleatorios.addRow(new Object[]{auxiliar2.getNombre(), "Corre a tercera base", lblTiempo.getText()});

        }
        //base1
        jugador1 = base1;
        MtblEventosAleatorios.addRow(new Object[]{jugador1.getNombre(), "Corre a primera base", lblTiempo.getText()});
        
    }
}
