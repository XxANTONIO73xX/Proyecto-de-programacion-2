package Interfaces;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import objetos.Equipo;
import objetos.Estrategia;
import objetos.Jugador;

/**
 * Este JDialog sirve para mostrar la ventana de creación de equipo.
 * @author equipo Maravilla Z
 * @version 02/05/2020
 */
public class JEquipos extends javax.swing.JDialog {

    ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    ArrayList<Estrategia> estrategias = new ArrayList<Estrategia>();
    //estrategias predeterminadas
    Estrategia una = new Estrategia("Toque de bola (Ofensiva)", "Golpe ligero a la pelota");
    Estrategia dos = new Estrategia("Robo de base (Ofensiva)", "Roba la base en el momento oportuno");
    Estrategia tres = new Estrategia("Doble Play (Defensiva)", "Doble OUT en una misma jugada");
    Estrategia cuatro = new Estrategia("Base por bola (Defensiva)", "Golpea al jugador con la bola, y asi evitar que bateé");
    Equipo equipo = new Equipo();
    DefaultTableModel MtblJugadores;
    /**
     * Constructor de JEquipos
     * @param parent parametro que se extiende de Jdialog
     * @param modal parametro que se extiende de Jdialog
     * @param equipos es el ArrayList en donde se guardaran los equipos
     */
    public JEquipos(java.awt.Frame parent, boolean modal, ArrayList<Equipo> equipos) {
        super(parent, modal);
        initComponents();
        estrategias.add(una);
        estrategias.add(dos);
        estrategias.add(tres);
        estrategias.add(cuatro);
        this.equipos = equipos;
        MtblJugadores = (DefaultTableModel) tblJugadores.getModel();
        cargarTabla(equipo);

    }
    /**
     * Metodo para mostrar en la tabla de este JDialog
     * @param equipo el objeto equipo de donde se sacara el ArrayList de Jugadores para cargar la lista con los datos
     */
    public void cargarTabla(Equipo equipo) {
        for (Jugador jugadores : equipo.getJugadores()) {
            MtblJugadores.addRow(new Object[]{
                jugadores.getNumero(),
                jugadores.getNombre(),
                jugadores.getPosicion(),
                jugadores.getBrazo()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfEstadio = new javax.swing.JTextField();
        txfNombreEquipo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarCoach = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarJugadores = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel2.setText("Agregar EQUIPO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        jLabel1.setText("Coach:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        jLabel3.setText("Nombre:");

        btnAgregar.setBackground(new java.awt.Color(102, 255, 102));
        btnAgregar.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        jLabel4.setText("Estadio:");

        btnAgregarCoach.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        btnAgregarCoach.setText("Agregar coach");
        btnAgregarCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCoachActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        jLabel5.setText("Jugador:");

        btnAgregarJugadores.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        btnAgregarJugadores.setText("Agregar Jugador");
        btnAgregarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarJugadoresActionPerformed(evt);
            }
        });

        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nombre", "Posicion", "Brazo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblJugadores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txfEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txfNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAgregarCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAgregarJugadores))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregarCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCoachActionPerformed
        //con esta accion abres la ventana JCoach
        JCoach Jcoach = new JCoach(null, true, equipos, equipo, estrategias);
        Jcoach.setVisible(true);
    }//GEN-LAST:event_btnAgregarCoachActionPerformed

    private void btnAgregarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarJugadoresActionPerformed
        //con esta accion abres la ventana JJugador
        JJugador player = new JJugador(null, true, equipos, equipo);
        player.setVisible(true);
    }//GEN-LAST:event_btnAgregarJugadoresActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Con esta acción agregas el equipo creado al ArrayList de equipos
        equipo.setNombre(txfNombreEquipo.getText());
        equipo.setEstadio(txfEstadio.getText());
        equipos.add(equipo);
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCoach;
    private javax.swing.JButton btnAgregarJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblJugadores;
    private javax.swing.JTextField txfEstadio;
    private javax.swing.JTextField txfNombreEquipo;
    // End of variables declaration//GEN-END:variables

}
