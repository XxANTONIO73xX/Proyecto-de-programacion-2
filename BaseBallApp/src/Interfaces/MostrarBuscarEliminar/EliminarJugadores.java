package Interfaces.MostrarBuscarEliminar;

import MetodosEstructura.Busqueda;
import MetodosEstructura.Ordenar;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.Jugador;
import objetos.Equipo;

/**
 * Sirve para eliminar jugadores mediante una tabla y su respectiva busqueda.
 *
 * @author Equipo Maravilla Z
 * @version 16/05/2020 
 */
public class EliminarJugadores extends javax.swing.JDialog {
    ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    Equipo equipoSeleccionado = new Equipo();
    DefaultTableModel MtblJugadores;
/**
 * constructor de este JDialog
 * @param parent Atributo heredado por el JDialog
 * @param modal Atributo heredado por el JDialog
 * @param equipos ArrayList de equipo de donde se obtendra el ArrayList de jugadores
 */
    public EliminarJugadores(java.awt.Frame parent, boolean modal, ArrayList<Equipo> equipos) {
        super(parent, modal);
        initComponents();
        this.equipos = equipos;
        MtblJugadores = (DefaultTableModel) tblJugador.getModel();
        cbxEquipos();
    }
    
    /**
     * con este metodo cargas el Combobox de equipos para poder seleccionarlos despues.
     */
    public void cbxEquipos() {
        //Recorre el forEach para agregar los equipos pertenecientes al ArrayList (Equipo) al ComboBox.
        for (Equipo e : equipos) {
            cbxEquipo.addItem(e.getNombre());
        }
    }
    
    /**
     * con este metodo cargas la tabla de jugadores del equipo seleccionado en el ComboBox de equipos
     */
    public void cargarTabla() {
        //Recorre el forEach cargando a los jugadores del equipo seleccionado.
        for (Jugador j : equipoSeleccionado.getJugadores()) {
            MtblJugadores.addRow(new Object[]{
                j.getNombre(),
                j.getApellido(),
                j.getPosicion(),
                j.getNumero()
            });
        }
    }
    
    /**
     * con este metodo vacias la tabla facilitando la actualizacion a la tabla. 
     */
    public void vaciarTabla() {
        //Rcorre la tabla completa removiendo toda la tabla cada vez que carga el método. 
        for (int i = MtblJugadores.getRowCount() - 1; i >= 0; i--) {
            MtblJugadores.removeRow(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblJugador = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        txfEliminarJugador = new javax.swing.JTextField();
        btnEliminarJugador = new javax.swing.JButton();
        cbxEquipo = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setForeground(new java.awt.Color(255, 0, 0));

        tblJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre ", "Apellido", "Posicion", "Numero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblJugador);

        jLabel23.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("------- Ingrese el nombre del jugador a eliminar: -------");
        jLabel23.setFocusable(false);
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txfEliminarJugador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfEliminarJugador.setText("ingresa el numero del jugador");
        txfEliminarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEliminarJugadorActionPerformed(evt);
            }
        });

        btnEliminarJugador.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarJugador.setForeground(new java.awt.Color(255, 51, 0));
        btnEliminarJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_Streamline-70_185090.png"))); // NOI18N
        btnEliminarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarJugadorActionPerformed(evt);
            }
        });

        cbxEquipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxEquipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEquipoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txfEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel24.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Eliminar JUGADOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfEliminarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEliminarJugadorActionPerformed
        //Cambia el texto de txfEliminarJugador a null.
        txfEliminarJugador.setText(null);
    }//GEN-LAST:event_txfEliminarJugadorActionPerformed

    private void btnEliminarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarJugadorActionPerformed
       //en este espacio haces la accion de eliminar el jugador de su seleccion
        Busqueda busqueda = new Busqueda();
        Jugador eliminado = busqueda.busquedaBinaria(equipoSeleccionado.getJugadores(), equipoSeleccionado.getJugadores().size(), Integer.parseInt(txfEliminarJugador.getText()));
        int n = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar: " + eliminado.getNombre() + "  " + eliminado.getNumero(), "¿estas seguro?", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            equipoSeleccionado.getJugadores().remove(eliminado);
            vaciarTabla();
            cargarTabla();
            JOptionPane.showMessageDialog(this, "El Jugador fue eliminado");
        } else {
            JOptionPane.showMessageDialog(this, "Accion cancelada");
        }
    }//GEN-LAST:event_btnEliminarJugadorActionPerformed

    private void cbxEquipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEquipoItemStateChanged
        //en este espacio se selecciona el equipo a manipular
        for (Equipo e : equipos) {
            if (e.getNombre().equals(cbxEquipo.getSelectedItem().toString())) {
                equipoSeleccionado = e;
            }
        }
        vaciarTabla();
        cargarTabla();
    }//GEN-LAST:event_cbxEquipoItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarJugador;
    private javax.swing.JComboBox cbxEquipo;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblJugador;
    private javax.swing.JTextField txfEliminarJugador;
    // End of variables declaration//GEN-END:variables
}
