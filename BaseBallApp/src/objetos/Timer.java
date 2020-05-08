/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import javax.swing.JLabel;

/**
 *
 * @author Propietario
 */
public class Timer implements Runnable{
    private JLabel temporizador; 
    private int segundos = 0; 
    private int minutos = 0; 
    public boolean estado = true;
   
    public Timer(JLabel temporizador) {
        this.temporizador = temporizador;
    }
    

    @Override
    public void run() {
        
        while(estado){
            try {
                segundos++;
                if(segundos == 60){
                    segundos = 0;
                    minutos++;
                }
                if(segundos < 10 && minutos == 0){
                    temporizador.setText("00 : 0" +segundos);
                }else if(segundos >= 10 && minutos == 0 ){
                    temporizador.setText("00 : " + segundos);
                }else if(segundos < 10 && minutos < 10){
                    temporizador.setText("0"+minutos +" : 0" +segundos);
                }else if(segundos <10 && minutos >= 10){
                    temporizador.setText(minutos + " : 0" + segundos);
                }else if(segundos >= 10 && minutos < 10){
                    temporizador.setText("0"+minutos+" : " + segundos);
                }else if(segundos >= 10 && minutos >= 10){
                    temporizador.setText(minutos +" : "+ segundos);
                } 
                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
    }
    
}
