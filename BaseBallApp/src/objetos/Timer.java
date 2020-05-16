package objetos;

import javax.swing.JLabel;

/**
 * Esta se usará como base para los jugadores y el coach.
 * @author equipo Maravilla Z
 * @version 16/05/2020
 */
public class Timer implements Runnable {

    private JLabel temporizador;
    private int segundos = 0;
    private int minutos = 0;

    /**
     * constructor de Timer
     * @param temporizador Guarda el tiempo.
     */
    public Timer(JLabel temporizador) {
        this.temporizador = temporizador;
    }
    /**
     * Metodo Runneable
     */
    @Override
    public void run() {

        while (true) {
            try {
                segundos++;
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                }
                if (segundos < 10 && minutos == 0) {
                    temporizador.setText("00 : 0" + segundos);
                } else if (segundos >= 10 && minutos == 0) {
                    temporizador.setText("00 : " + segundos);
                } else if (segundos < 10 && minutos < 10) {
                    temporizador.setText("0" + minutos + " : 0" + segundos);
                } else if (segundos < 10 && minutos >= 10) {
                    temporizador.setText(minutos + " : 0" + segundos);
                } else if (segundos >= 10 && minutos < 10) {
                    temporizador.setText("0" + minutos + " : " + segundos);
                } else if (segundos >= 10 && minutos >= 10) {
                    temporizador.setText(minutos + " : " + segundos);
                }
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}
