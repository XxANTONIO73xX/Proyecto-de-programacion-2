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
        for(int i = 0; i < 9; i++){
            CambiarEntradas(out, entrada);
            if (entrada.equals("Alta")) {
               try {
                    lblEntrada.setText(entrada);
                    out = 0;
                    bola = 0;
                    strike = 0;
                    carrera = 0;
                    boolean estado = true;
                    int numero = aleatorio.nextInt(enfrentamiento.get(0).getJugadores().size());
                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(numero).getNombre(),"esta posicion para batear", lblTiempo.getText()});
                    Jugador jugadorNuevo = enfrentamiento.get(0).getJugadores().get(numero);
                    Thread.sleep(5000);
                    do {
                        int resultado = 1 + aleatorio.nextInt(4);
                        switch (resultado) {
                            case 1: {
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(numero).getNombre(), "cometio strike", lblTiempo.getText()});
                                strike++;
                                lblStrike.setText(Integer.toString(strike));
                                if (strike == 3) {
                                    out++;
                                    lblOut.setText(Integer.toString(out));
                                    estado = false;
                                    CambiarEntradas(out, entrada); 
                                }
                                Thread.sleep(5000);
                                break;
                            }
                            case 2: {
                                bola++;
                                lblBola.setText(Integer.toString(bola));
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(numero).getNombre(), "se le acumula una bola a favor", lblTiempo.getText()});
                                if (bola == 3) {
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(numero).getNombre(), "se le sede la primera base", lblTiempo.getText()});
                                    RecorrerBases(jugadorNuevo, base1, base2, base3, carrera);
                                    MarcadorLocal.setText(Integer.toString(carrera));
                                    estado = false;
                                                CambiarEntradas(out, entrada);

                                }
                               Thread.sleep(5000);
                                break;
                            }
                            case 3: {
                                out++;
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(numero).getNombre(), "el bateador acierta y corre hacia primero", lblTiempo.getText()});
                                Thread.sleep(3000);
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(numero).getNombre(), "es sacado por out cuando corria hacia su base", lblTiempo.getText()});
                               Thread.sleep(5000);
                                lblOut.setText(Integer.toString(out));
                                estado = false;
                                            CambiarEntradas(out, entrada);

                                break;
                            }
                            case 4: {
                                RecorrerBases(jugadorNuevo, base1, base2, base3, carrera);
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(numero).getNombre(), "el bateador acierta y corre hacia primero", lblTiempo.getText()});
                               Thread.sleep(5000);
                               estado = false;
                                           CambiarEntradas(out, entrada);
                               break;
                            }
                            case 5: {
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(0).getJugadores().get(numero).getNombre(), "el bateador acierta y hace un HomeRun", lblTiempo.getText()});
                                if (base1 != null) {
                                    carrera++;
                                    MarcadorLocal.setText(Integer.toString(carrera));
                                }
                               Thread.sleep(1000);
                                if (base2 != null) {
                                    carrera++;
                                    MarcadorLocal.setText(Integer.toString(carrera));
                                }

                               Thread.sleep(1000);
                                if (base3 != null) {
                                    carrera++;
                                    MarcadorLocal.setText(Integer.toString(carrera));
                                }
                               Thread.sleep(1000);
                               estado = false;
                                           CambiarEntradas(out, entrada);

                            }
                        }
                    } while (estado == true);
                    Thread.sleep(10000);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "no comenzo el partido");
                }
            }
            if (entrada.equals("Baja")) {
               try {
                    lblEntrada.setText(entrada);
                    out = 0;
                    bola = 0;
                    strike = 0;
                    carrera = 0;
                    boolean estado = true;
                    int numero = (int) (Math.random() * enfrentamiento.get(1).getJugadores().size());
                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(numero).getNombre(),"esta posicion para batear", lblTiempo.getText()});
                    Jugador jugadorNuevo = enfrentamiento.get(1).getJugadores().get(numero);
                    Thread.sleep(5000);
                    do {
                        int resultado = (int) (Math.random() * 4 + 1);
                        switch (resultado) {
                            case 1: {
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(numero).getNombre(), "cometio strike", lblTiempo.getText()});
                                strike++;
                                lblStrike.setText(Integer.toString(strike));
                                if (strike == 3) {
                                    out++;
                                    lblOut.setText(Integer.toString(out));
                                    estado = false;
                                                CambiarEntradas(out, entrada);

                                }
                                Thread.sleep(5000);
                                break;
                            }
                            case 2: {
                                bola++;
                                lblBola.setText(Integer.toString(bola));
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(numero).getNombre(), "se le acumula una bola a favor", lblTiempo.getText()});
                                if (bola == 3) {
                                    MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(numero).getNombre(), "se le sede la primera base", lblTiempo.getText()});
                                    RecorrerBases(jugadorNuevo, base1, base2, base3, carrera);
                                    MarcadorLocal.setText(Integer.toString(carrera));
                                    estado = false;
                                                CambiarEntradas(out, entrada);

                                }
                               Thread.sleep(5000);
                                break;
                            }
                            case 3: {
                                out++;
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(numero).getNombre(), "el bateador acierta y corre hacia primero", lblTiempo.getText()});
                                Thread.sleep(3000);
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(numero).getNombre(), "es sacado por out cuando corria hacia su base", lblTiempo.getText()});
                               Thread.sleep(5000);
                                lblOut.setText(Integer.toString(out));
                                estado = false;
                                            CambiarEntradas(out, entrada);

                                break;
                            }
                            case 4: {
                                RecorrerBases(jugadorNuevo, base1, base2, base3, carrera);
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(numero).getNombre(), "el bateador acierta y corre hacia primero", lblTiempo.getText()});
                               Thread.sleep(5000);
                               estado = false;
                                           CambiarEntradas(out, entrada);

                                break;
                            }
                            case 5: {
                                MtblEventosAleatorios.addRow(new Object[]{enfrentamiento.get(1).getJugadores().get(numero).getNombre(), "el bateador acierta y hace un HomeRun", lblTiempo.getText()});
                                if (base1 != null) {
                                    carrera++;
                                    MarcadorLocal.setText(Integer.toString(carrera));
                                }
                               Thread.sleep(1000);
                                if (base2 != null) {
                                    carrera++;
                                    MarcadorLocal.setText(Integer.toString(carrera));
                                }

                               Thread.sleep(1000);
                                if (base3 != null) {
                                    carrera++;
                                    MarcadorLocal.setText(Integer.toString(carrera));
                                }
                               Thread.sleep(1000);
                               estado = false;
                                           CambiarEntradas(out, entrada);

                            }
                        }
                    } while (estado == true);
                    Thread.sleep(10000);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "no comenzo el partido");
                }
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

    public void RecorrerBases(Jugador jugador1, Jugador base1, Jugador base2, Jugador base3, int carrera) {
        Jugador auxiliar1;
        Jugador auxiliar2;
        auxiliar1 = base1;
        auxiliar2 = base2;
        jugador1 = base1;
        auxiliar1 = base2;
        auxiliar2 = base3;

        if (base3 != null) {
            carrera++;
        }
    }
}
