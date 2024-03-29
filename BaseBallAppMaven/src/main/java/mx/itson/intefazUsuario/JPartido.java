package mx.itson.intefazUsuario;

import mx.itson.intefazUsuario.JEnfrentamientos;
import mx.itson.metodosEstructura.Ordenar;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.objetos.Coach;
import mx.itson.objetos.Equipo;
import mx.itson.objetos.EventosAleatorios;
import mx.itson.objetos.Jugador;
import mx.itson.objetos.Timer;

/**
 * En este JFrame se simulara el partido y dara el acceso a la manipulación de
 * datos correspondientes.
 *
 * @author Equipo Maravilla Z
 * @version 16/05/2020
 */
public class JPartido extends javax.swing.JFrame {
    ArrayList<Equipo> equipos;
    ArrayList<Equipo> enfrentamiento;
    DefaultTableModel MtblEventosAleatorios;
    int i = 0;
    Timer tiempo;
    Thread t;
    EventosAleatorios eventosAleatorios;
    Thread EA;
    Ordenar ordenar;
    //Equipo predeterminado 1
    ArrayList<Jugador> Equipo1 = new ArrayList<Jugador>();
    Coach coach1 = new Coach(null, "Jose", "Salazar", 35, (float) 1.80, 85);
    Equipo Predeterminado1 = new Equipo(i, "Yaquis", "Obregon", Equipo1, coach1);
    //termina el codigo de Equipo predeterminado 1

    //Equipo predeterminado 2
    ArrayList<Jugador> Equipo2 = new ArrayList<Jugador>();
    Coach coach2 = new Coach(null, "Eduardo", "Lara", 35, (float) 1.80, 85);
    Equipo Predeterminado2 = new Equipo(i + 1, "Tomateros", "Estadio de Culiacan", Equipo2, coach2);
    //termina el codigo de Equipo predeterminado 2

    public JPartido() {
        initComponents();
        this.setLocationRelativeTo(null);
        equipos = new ArrayList<Equipo>();
        enfrentamiento = new ArrayList<Equipo>();
        MtblEventosAleatorios = (DefaultTableModel) tblEventosAleatorios.getModel();
        tiempo = new Timer(lbltiempo);
        t = new Thread(tiempo);
        ordenar = new Ordenar();
        eventosAleatorios = new EventosAleatorios(lblEntrada, lblOut, lblStrike, lblBola, lblMarcadorLocal, lblMarcadorVisitante, lbltiempo, tblEventosAleatorios, MtblEventosAleatorios, tiempo, t, lblNombreLocal, lblNombreVisitante, enfrentamiento);
        EA = new Thread(eventosAleatorios);
        //agrega jugadores de forma predeterminada al equipo predeterminado1
        for (int j = 1; j <= 30; j++) {
            Jugador jugador = new Jugador("", "", j, "YaquisPlayer" + j, "jugador" + j, 18, (float) 1.80, 80);
            Equipo1.add(jugador);
        }
        //agrega jugadores de forma predeterminada al equipo predeterminado2
        for (int j = 1; j <= 30; j++) {
            Jugador jugador = new Jugador("", "", j, "TomaterosPlayer" + j, "jugador" + j, 18, (float) 1.80, 80);
            Equipo2.add(jugador);
        }
        //se añaden ambos equipos al ArrayList
        equipos.add(Predeterminado1);
        equipos.add(Predeterminado2);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblEstadio = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        lblOut = new javax.swing.JLabel();
        lblStrike = new javax.swing.JLabel();
        lblBola = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNombreLocal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCoachLocal = new javax.swing.JLabel();
        lblCoachVisitante = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNombreVisitante = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblMarcadorLocal = new javax.swing.JLabel();
        lblMarcadorVisitante = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEventosAleatorios = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        lbltiempo = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        btnEmpezar1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAgregarEquipo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuMostrarEquipos = new javax.swing.JMenuItem();
        jMenuMostrarJugadores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuEliminarEquipo = new javax.swing.JMenuItem();
        jMenuEliminarJugadores = new javax.swing.JMenuItem();
        jMenuIniciarEnfrentamiento = new javax.swing.JMenu();
        JInicioEnfrentamiento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 2, 48)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel11.setText("Estadio:");

        lblEstadio.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        lblEstadio.setText("-----");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEstadio, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEstadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel3.setText("O");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel4.setText("S");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel5.setText("B");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel6.setText("Entrada:");

        lblEntrada.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        lblEntrada.setText("Alta");

        lblOut.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        lblOut.setText("-");

        lblStrike.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        lblStrike.setText("-");

        lblBola.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        lblBola.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblOut))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblStrike))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lblBola))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEntrada)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblStrike))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblBola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblEntrada))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblNombreLocal.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblNombreLocal.setText("---");
        lblNombreLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("LOCAL"));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("Coach:");

        lblCoachLocal.setText("-----");

        lblCoachVisitante.setText("-----");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Coach:");

        lblNombreVisitante.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblNombreVisitante.setText("---");
        lblNombreVisitante.setBorder(javax.swing.BorderFactory.createTitledBorder("VISITANTE"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCoachVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCoachLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCoachLocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCoachVisitante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblMarcadorLocal.setFont(new java.awt.Font("Trebuchet MS", 2, 36)); // NOI18N
        lblMarcadorLocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarcadorLocal.setText("0");

        lblMarcadorVisitante.setFont(new java.awt.Font("Trebuchet MS", 2, 36)); // NOI18N
        lblMarcadorVisitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarcadorVisitante.setText("0");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 2, 36)); // NOI18N
        jLabel15.setText("-");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 2, 36)); // NOI18N
        jLabel16.setText("-");

        jPanel6.setBackground(new java.awt.Color(51, 204, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("LOCAL");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(51, 204, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("VISITANTE");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13)))
        );

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/publicidad2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarcadorLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMarcadorVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(lblMarcadorLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarcadorVisitante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Publicidad1.png"))); // NOI18N

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tblEventosAleatorios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblEventosAleatorios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblEventosAleatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador", "Acción", "Minuto"
            }
        ));
        jScrollPane3.setViewportView(tblEventosAleatorios);
        if (tblEventosAleatorios.getColumnModel().getColumnCount() > 0) {
            tblEventosAleatorios.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblEventosAleatorios.getColumnModel().getColumn(1).setPreferredWidth(700);
            tblEventosAleatorios.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(0, 153, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Tiempo Trascurrido:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbltiempo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltiempo.setText("00 : 00");

        btnTerminar.setBackground(new java.awt.Color(0, 153, 255));
        btnTerminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Publicidad1.png"))); // NOI18N

        btnEmpezar1.setBackground(new java.awt.Color(0, 153, 255));
        btnEmpezar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEmpezar1.setText("Empezar");
        btnEmpezar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbltiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(1028, Short.MAX_VALUE)
                    .addComponent(btnEmpezar1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(550, 550, 550)
                    .addComponent(btnEmpezar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(23, 23, 23)))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jMenu1.setText("Agregar");

        jMenuAgregarEquipo.setText("Agregar Equipo");
        jMenuAgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgregarEquipoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAgregarEquipo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mostrar/Buscar");

        jMenuMostrarEquipos.setText("Mostrar/Buscar Equipos");
        jMenuMostrarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMostrarEquiposActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuMostrarEquipos);

        jMenuMostrarJugadores.setText("Mostrar/Buscar Jugadores");
        jMenuMostrarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMostrarJugadoresActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuMostrarJugadores);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Eliminar");

        jMenuEliminarEquipo.setText("Equipos");
        jMenuEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEliminarEquipoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuEliminarEquipo);

        jMenuEliminarJugadores.setText("Jugadores");
        jMenuEliminarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEliminarJugadoresActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuEliminarJugadores);

        jMenuBar1.add(jMenu3);

        jMenuIniciarEnfrentamiento.setText("Enfrentamiento");

        JInicioEnfrentamiento.setText("Iniciar");
        JInicioEnfrentamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JInicioEnfrentamientoActionPerformed(evt);
            }
        });
        jMenuIniciarEnfrentamiento.add(JInicioEnfrentamiento);

        jMenuBar1.add(jMenuIniciarEnfrentamiento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgregarEquipoActionPerformed
        //En este espacio se ejecutan las acciones correspondientes al botón de AGREGAR EQUIPO para mostrar su respectiva ventana.
        i++; //2
        i++; //3
        JEquipos team = new JEquipos(equipos, i);
        team.setVisible(true);
        Random alea = new Random();
        int n = 1 + alea.nextInt(4);
        equipos.get(0).setId(equipos.get(0).getId() + n);
        equipos.get(1).setId(equipos.get(1).getId() + n);
    }//GEN-LAST:event_jMenuAgregarEquipoActionPerformed

    private void jMenuMostrarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMostrarJugadoresActionPerformed
        //En este espacio se ejecutan las acciones correspondientes al botón de MOSTRAR JUGADOR para mostrar su respectiva ventana.
        MostrarJugadores mostrarJugadores = new MostrarJugadores(this, true, equipos);
        mostrarJugadores.setVisible(true);
    }//GEN-LAST:event_jMenuMostrarJugadoresActionPerformed

    private void jMenuMostrarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMostrarEquiposActionPerformed
        //En este espacio se ejecutan las acciones correspondientes al botón de MOSTRAR EQUIPO para mostrar su respectiva ventana.
        ordenar.insertionSort(equipos, equipos.size());
        MostrarEquipos mostrasEquipo = new MostrarEquipos(this, true, equipos);
        mostrasEquipo.setVisible(true);
    }//GEN-LAST:event_jMenuMostrarEquiposActionPerformed

    private void jMenuEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEliminarEquipoActionPerformed
        //En este espacio se ejecutan las acciones correspondientes al botón de ELIMINAR EQUIPO para mostrar su respectiva ventana.
        EliminarEquipos elimnarEquipos = new EliminarEquipos(this, true, equipos);
        elimnarEquipos.setVisible(true);
    }//GEN-LAST:event_jMenuEliminarEquipoActionPerformed

    private void jMenuEliminarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEliminarJugadoresActionPerformed
        //En este espacio se ejecutan las acciones correspondientes al botón de ELIMINAR JUGADORES para mostrar su respectiva ventana.
        EliminarJugadores elimunarJugadores = new EliminarJugadores(this, true, equipos);
        elimunarJugadores.setVisible(true);
    }//GEN-LAST:event_jMenuEliminarJugadoresActionPerformed

    private void JInicioEnfrentamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JInicioEnfrentamientoActionPerformed
        // En este espacio se hacen los preparativos para el enfrentamiento
        JEnfrentamientos enfrentamientos = new JEnfrentamientos(this, true, equipos, enfrentamiento);
        enfrentamientos.setVisible(true);
        lblNombreLocal.setText(enfrentamiento.get(0).getNombre());
        lblNombreVisitante.setText(enfrentamiento.get(1).getNombre());
        lblCoachLocal.setText(enfrentamiento.get(0).getCoach().getNombre());
        lblCoachVisitante.setText(enfrentamiento.get(1).getCoach().getNombre());
        lblEstadio.setText(enfrentamiento.get(0).getEstadio());
    }//GEN-LAST:event_JInicioEnfrentamientoActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // En este espacio se detienen los hilos y se valida quien fue el ganador
        EA.stop();
        t.stop();
        if (Integer.parseInt(lblMarcadorLocal.getText()) > Integer.parseInt(lblMarcadorVisitante.getText())) {
            JOptionPane.showMessageDialog(null, "Ganador: " + lblNombreLocal.getText());
        } else if (Integer.parseInt(lblMarcadorVisitante.getText()) > Integer.parseInt(lblMarcadorLocal.getText())) {
            JOptionPane.showMessageDialog(null, "Ganador: " + lblNombreVisitante.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Ganador: es un EMPATE");
        }
        
        //Rcorre la tabla completa removiendo toda la tabla cada vez que carga el método. 
        for (int i = MtblEventosAleatorios.getRowCount() - 1; i >= 0; i--) {
            MtblEventosAleatorios.removeRow(i);
        }
        lblNombreLocal.setText(null);
        lblNombreVisitante.setText(null);
        lblCoachLocal.setText(null);
        lblCoachVisitante.setText(null);
        lblEstadio.setText(null);        
        lbltiempo.setText("00:00");
        enfrentamiento.clear();
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnEmpezar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezar1ActionPerformed
        // En este espacio se da el inicio a los hilos
        t.start();
        EA.start();
    }//GEN-LAST:event_btnEmpezar1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JPartido().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JInicioEnfrentamiento;
    private javax.swing.JButton btnEmpezar1;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAgregarEquipo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuEliminarEquipo;
    private javax.swing.JMenuItem jMenuEliminarJugadores;
    private javax.swing.JMenu jMenuIniciarEnfrentamiento;
    private javax.swing.JMenuItem jMenuMostrarEquipos;
    private javax.swing.JMenuItem jMenuMostrarJugadores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBola;
    private javax.swing.JLabel lblCoachLocal;
    private javax.swing.JLabel lblCoachVisitante;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblEstadio;
    private javax.swing.JLabel lblMarcadorLocal;
    private javax.swing.JLabel lblMarcadorVisitante;
    private javax.swing.JLabel lblNombreLocal;
    private javax.swing.JLabel lblNombreVisitante;
    private javax.swing.JLabel lblOut;
    private javax.swing.JLabel lblStrike;
    private javax.swing.JLabel lbltiempo;
    private javax.swing.JTable tblEventosAleatorios;
    // End of variables declaration//GEN-END:variables
}
