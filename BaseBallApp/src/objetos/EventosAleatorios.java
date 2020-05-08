/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Propietario
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

    @Override
    public void run() {
        while (true) {
            switch (numero) {
                //Hit   
                case 1: {
                    if (base1 == 0) {
                        base1++;
                    }else if(base1 == 1){
                        base1++; 
                        base2++;
                    }else if(base1 == 2){
                        base1++;
                        base2++;
                        base3++;
                    }else if(base1 == 3){
                        base1++;
                        base2++;
                        base3++;
                        base4++;
                    }
                
                    if (enfrentamiento.getEquipo1().getNombre().equals(Local.getText())) {
                        int numeroJ = (int) (Math.random() * enfrentamiento.getEquipo1().getJugadores().size() - 1);
                        MtblEventosAleatorios.addRow(new Object[]{("el jugador " + enfrentamiento.getEquipo1().getJugadores().get(numeroJ).getNombre() + " hizo un hit y corrio a primera base"), lblTiempo.getText()});
                    if(base1 == 4 || base2 == 4 || base3 == 4 || base4 == 4){
                        
                    }                    
                    } else if (enfrentamiento.getEquipo2().getNombre().equals(Local.getText())) {
                        int numeroJ = (int) (Math.random() * enfrentamiento.getEquipo1().getJugadores().size() - 1);
                        MtblEventosAleatorios.addRow(new Object[]{("el jugador " + enfrentamiento.getEquipo2().getJugadores().get(numeroJ).getNombre() + " hizo un hit y corrio a primera base"), lblTiempo.getText()});
                    if(base1 == 4 || base2 == 4 || base3 == 4 || base4 == 4){
                        
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
