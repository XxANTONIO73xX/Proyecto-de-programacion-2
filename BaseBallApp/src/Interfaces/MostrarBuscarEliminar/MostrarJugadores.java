package Interfaces.MostrarBuscarEliminar;

import MetodosEstructura.Busqueda;
import MetodosEstructura.Ordenar;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.Equipo;
import objetos.Jugador;

/**
 * Sirve para mostrar jugadores mediante una tabla y su respectiva busqueda.
 *
 * @author Equipo Maravilla Z
 * @version 2/5/2020 15PM
 */
/**
 * Instancia clases y arreglos que se utilizaran en la clase.
 */
public class MostrarJugadores extends javax.swing.JDialog {

    /**
     * Instancia clases y arreglos que se utilizaran en la clase.
     */
    ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    Equipo equipoSeleccionado = new Equipo();
    DefaultTableModel MtblJugadores;
    Ordenar ordenar = new Ordenar();
    Busqueda busqueda = new Busqueda();
    public MostrarJugadores(java.awt.Frame parent, boolean modal, ArrayList<Equipo> equipos) {
        super(parent, modal);

        /**
         * Inicia los componentes ya sean tablas, metodos, etc.
         */
        initComponents();
        this.equipos = equipos;
        MtblJugadores = (DefaultTableModel) tblJugadores.getModel();
        
        cbxEquipos();
    }

    public void cbxEquipos() {
        //Recorre el forEach para agregar los equipos pertenecientes al ArrayList (Equipo) al ComboBox.
        for (Equipo e : equipos) {
            cbxEquipo.addItem(e.getNombre());
        }
    }

    public void cargarTabla() {
        //Recorre el forEach para agregar los equipos pertenecientes al ArrayList (Jugador) a la tabla.
        for (Jugador j : equipoSeleccionado.getJugadores()) {
            MtblJugadores.addRow(new Object[]{
                j.getNombre(),
                j.getApellido(),
                j.getPosicion(),
                j.getNumero()
            });
        }
    }

    public void vaciarTabla() {
        //Rcorre la tabla completa removiendo toda la tabla cada vez que carga el método. 
        for (int i = MtblJugadores.getRowCount() - 1; i >= 0; i--) {
            MtblJugadores.removeRow(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel34 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txfNombreJugador = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();
        cbxEquipo = new javax.swing.JComboBox();
        jPanel35 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel34.setBackground(new java.awt.Color(0, 204, 0));
        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("--------------- Ingrese el numero del jugador: ---------------");
        jLabel20.setFocusable(false);
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txfNombreJugador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_search_322497 (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Posicion", "Numero"
            }
        ));
        jScrollPane1.setViewportView(tblJugadores);

        cbxEquipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxEquipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEquipoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(txfNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel19)
                .addGap(309, 309, 309))
        );

        jPanel35.setBackground(new java.awt.Color(0, 153, 255));
        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Buscador de JUGADOR");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEquipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEquipoItemStateChanged
        //Recorre el forEach comprobando que el nombre del objeto seleccionado coincida con algun nombre de algún objeto del ArrayList (Equipo).
        for (Equipo e : equipos) {
            if (e.getNombre().equals(cbxEquipo.getSelectedItem().toString())) {
                equipoSeleccionado = e;
                break;
            }
        }
        ordenar.bubbleSort(equipoSeleccionado.getJugadores(), equipoSeleccionado.getJugadores().size());
        vaciarTabla();
        cargarTabla();

    }//GEN-LAST:event_cbxEquipoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       // try{
        Jugador encontrado = busqueda.busquedaBinaria(equipoSeleccionado.getJugadores(), equipoSeleccionado.getJugadores().size(), Integer.parseInt(txfNombreJugador.getText())); 
        vaciarTabla();
        MtblJugadores.addRow(new Object[]{encontrado.getNombre(), encontrado.getApellido(), encontrado.getPosicion(), encontrado.getNumero()});
       // }catch(Exception e){
         //  JOptionPane.showMessageDialog(this, "El jugador no existe!!");
       // }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxEquipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblJugadores;
    private javax.swing.JTextField txfNombreJugador;
    // End of variables declaration//GEN-END:variables
}
