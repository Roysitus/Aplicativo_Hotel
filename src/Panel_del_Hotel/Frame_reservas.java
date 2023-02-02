/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel_del_Hotel;

import Arreglos.*;
import Conexion.Conectar;
import Paneles_De_Control.PanelControl_Users;
import TiposHabitaciones.*;
import TiposReservas.*;
import dao.clases.administradorCAD;
import dao.clases.reservasCAD;
import dao.clases.usuarioCAD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Frame_reservas extends javax.swing.JFrame {

    Arreglo_reserva_simple obj_simple = new Arreglo_reserva_simple();
    Arreglo_reserva_doble obj_doble = new Arreglo_reserva_doble();
    Arreglo_reserva_matrimonial obj_matrimonial = new Arreglo_reserva_matrimonial();

    Arreglo_habitacion_simple h_simple = new Arreglo_habitacion_simple();
    Arreglo_habitacion_doble h_doble = new Arreglo_habitacion_doble();
    Arreglo_habitacion_matrimonial h_matrimonial = new Arreglo_habitacion_matrimonial();

    administradorCAD cadAdministrador = new administradorCAD();
    usuarioCAD cadUsuario = new usuarioCAD();
    reservasCAD cadReservas = new reservasCAD();

    public Frame_reservas() {
        initComponents();
    }

    public double costo_servicio(String servicio, int cantidad) {
        double costo = 0;
        switch (servicio) {
            case "Solo Desayuno":
                costo = 15;
                break;
            case "Solo Almuerzo":
                costo = 25;
                break;
            case "Solo Cena":
                costo = 20;
                break;
            case "Desayuno - Almuerzo - Cena":
                costo = 60;
                break;
            case "Ninguno":
                costo = 0;
                break;
        }
        return costo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Login/volver.png"))); // NOI18N
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Reservas"));
        jScrollPane2.setViewportView(jTextArea2);

        jButton3.setText("Listar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(97, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar Reservas", jPanel3);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Habitacion"));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 202, 49));

        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de noches"));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 202, 48));

        jLabel1.setText("Fecha de Ingreso:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 202, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dia"));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 61, 41));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mes"));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 62, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createTitledBorder("Año"));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabel2.setText("Fecha de Salida:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dia"));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 61, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox5.setBorder(javax.swing.BorderFactory.createTitledBorder("Mes"));
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 62, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025" }));
        jComboBox6.setBorder(javax.swing.BorderFactory.createTitledBorder("Año"));
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solo Desayuno", "Solo Almuerzo", "Solo Cena", "Desayuno - Almuerzo - Cena", "Ninguno" }));
        jComboBox7.setBorder(javax.swing.BorderFactory.createTitledBorder("Servicio"));
        jPanel1.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 202, 40));

        jLabel3.setText("Serivico para la habitacion : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 50, 500));

        jButton1.setText("Hacer reserva");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 130, 30));

        jLabel4.setText("Tipo de Habitacion: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habitacion Simple", "Habitacion Doble", "Habitacion Matrimonial" }));
        jComboBox8.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));
        jPanel1.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 40));

        jButton2.setText("Nueva Reserva");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 130, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de la Reserva"));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 290, 300));

        jTextField3.setEditable(false);
        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Reserva"));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 290, 50));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Login/volver.png"))); // NOI18N
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, -1, -1));

        jTabbedPane1.addTab("Hacer Reserva", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Login/volver.png"))); // NOI18N
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 50, 40));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habitacion Simple", "Habitacion Doble", "Habitacion Matrimonial" }));
        jComboBox9.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));
        jPanel2.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, 200, 40));

        jLabel5.setText("Tipo de Habitacion: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, -1));

        jButton10.setText("Buscar Reserva");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 37, 140, 40));

        jButton11.setText("Modificar Reserva");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 37, 140, 40));

        jButton12.setText("Nuevo");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 37, 140, 40));

        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Reserva"));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, 200, 48));

        jTextField5.setEditable(false);
        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Habitacion"));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, 200, 52));

        jLabel6.setText("Fecha de Ingreso:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 202, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox10.setBorder(javax.swing.BorderFactory.createTitledBorder("Dia"));
        jPanel2.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 61, -1));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox11.setBorder(javax.swing.BorderFactory.createTitledBorder("Mes"));
        jPanel2.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 62, -1));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025" }));
        jComboBox12.setBorder(javax.swing.BorderFactory.createTitledBorder("Año"));
        jPanel2.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jLabel7.setText("Fecha de Salida:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox13.setBorder(javax.swing.BorderFactory.createTitledBorder("Dia"));
        jPanel2.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 61, -1));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox14.setBorder(javax.swing.BorderFactory.createTitledBorder("Mes"));
        jPanel2.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 62, -1));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025" }));
        jComboBox15.setBorder(javax.swing.BorderFactory.createTitledBorder("Año"));
        jPanel2.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        jLabel8.setText("Serivico para la habitacion : ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solo Desayuno", "Solo Almuerzo", "Solo Cena", "Desayuno - Almuerzo - Cena", "Ninguno" }));
        jComboBox16.setBorder(javax.swing.BorderFactory.createTitledBorder("Servicio"));
        jPanel2.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 202, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 14, 150));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 95, 456, 10));

        jTextField7.setEditable(false);
        jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Ingreso"));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, 52));

        jTextField8.setEditable(false);
        jTextField8.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Salida"));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 51));

        jTextField9.setEditable(false);
        jTextField9.setBorder(javax.swing.BorderFactory.createTitledBorder("Servicio para la habitacion"));
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, 49));

        jTextField11.setEditable(false);
        jTextField11.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de noches"));
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 200, 50));

        jTabbedPane1.addTab("Modificar Reserva", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String tipo = jComboBox8.getSelectedItem().toString();
        String nroHabitacion = jTextField1.getText(), fecha_ingreso = "", fecha_salida = "", servicio = "";
        int nroNoches;
        switch (tipo) {
            case "Habitacion Simple":
                HabitacionSimple bus = h_simple.buscar_habitacion(nroHabitacion);
                if (bus == null) {
                    JOptionPane.showMessageDialog(null, "El numero de la habitacion no existe o no es una habitacion simple");
                } else {
                    int pos = h_simple.buscar_posicion(nroHabitacion);
                    if (h_simple.obtener(pos).getHabilitado()) {
                        h_simple.obtener(pos).setHabilitado(false);
                        nroNoches = Integer.parseInt(jTextField2.getText());
                        fecha_ingreso = jComboBox1.getSelectedItem().toString() + "/" + jComboBox2.getSelectedItem().toString() + "/" + jComboBox3.getSelectedItem().toString();
                        fecha_salida = jComboBox4.getSelectedItem().toString() + "/" + jComboBox5.getSelectedItem().toString() + "/" + jComboBox6.getSelectedItem().toString();
                        servicio = jComboBox7.getSelectedItem().toString();
                        Reservas r_s = new Reservas(nroHabitacion, nroNoches, fecha_ingreso, fecha_salida, servicio, tipo, "");
                        cadReservas.crear(r_s);
                        double monto = nroNoches * h_simple.obtener(pos).getPrecio();
                        double total = monto + this.costo_servicio(servicio, nroNoches);
                        String nro_reserva = cadReservas.obtener().get((cadReservas.obtener().size() - 1)).getNroReserva();
                        jTextField3.setText(nro_reserva);
                        Reservas x = cadReservas.buscar(nro_reserva);
                        jTextArea1.setText(x.getNroReserva() + "\n" + x.getNroHabitacion() + "\n" + x.getNroNoches() + "\n" + x.getFecha_ingreso()
                                + "\n" + x.getFecha_salida() + "\n" + x.getServicio() + "\n" + x.getTipo());
                        JOptionPane.showMessageDialog(null, "Reseva exitosa");
                    } else {
                        JOptionPane.showMessageDialog(null, "La habitacion se encuentra ocupada");
                    }
                }
                break;
            case "Habitacion Doble":
                HabitacionDoble bus_d = h_doble.buscar_habitacion(nroHabitacion);
                if (bus_d == null) {
                    JOptionPane.showMessageDialog(null, "El numero de la habitacion no existe o no es una habitacion doble");
                } else {
                    int pos = h_doble.buscar_posicion(nroHabitacion);
                    if (h_doble.obtener(pos).getHabilitado()) {
                        h_doble.obtener(pos).setHabilitado(false);
                        nroNoches = Integer.parseInt(jTextField2.getText());
                        fecha_ingreso = jComboBox1.getSelectedItem().toString() + "/" + jComboBox2.getSelectedItem().toString() + "/" + jComboBox3.getSelectedItem().toString();
                        fecha_salida = jComboBox4.getSelectedItem().toString() + "/" + jComboBox5.getSelectedItem().toString() + "/" + jComboBox6.getSelectedItem().toString();
                        servicio = jComboBox7.getSelectedItem().toString();
                        Reservas r_s = new Reservas(nroHabitacion, nroNoches, fecha_ingreso, fecha_salida, servicio, tipo, "");
                        cadReservas.crear(r_s);
                        double monto = nroNoches * h_doble.obtener(pos).getPrecio();
                        double total = monto + this.costo_servicio(servicio, nroNoches);
                        String nro_reserva = cadReservas.obtener().get((cadReservas.obtener().size() - 1)).getNroReserva();
                        jTextField3.setText(nro_reserva);
                        Reservas x = cadReservas.buscar(nro_reserva);
                        jTextArea1.setText(x.getNroReserva() + "\n" + x.getNroHabitacion() + "\n" + x.getNroNoches() + "\n" + x.getFecha_ingreso()
                                + "\n" + x.getFecha_salida() + "\n" + x.getServicio() + "\n" + x.getTipo());
                        JOptionPane.showMessageDialog(null, "Reseva exitosa");
                    } else {
                        JOptionPane.showMessageDialog(null, "La habitacion se encuentra ocupada");
                    }
                }
                break;
            case "Habitacion Matrimonial":
                HabitacionMatrimonial bus_m = h_matrimonial.buscar_habitacion(nroHabitacion);
                if (bus_m == null) {
                    JOptionPane.showMessageDialog(null, "El numero de la habitacion no existe o no es una habitacion matrimonial");
                } else {
                    int pos = h_matrimonial.buscar_posicion(nroHabitacion);
                    if (h_matrimonial.obtener(pos).getHabilitado()) {
                        h_matrimonial.obtener(pos).setHabilitado(false);
                        nroNoches = Integer.parseInt(jTextField2.getText());
                        fecha_ingreso = jComboBox1.getSelectedItem().toString() + "/" + jComboBox2.getSelectedItem().toString() + "/" + jComboBox3.getSelectedItem().toString();
                        fecha_salida = jComboBox4.getSelectedItem().toString() + "/" + jComboBox5.getSelectedItem().toString() + "/" + jComboBox6.getSelectedItem().toString();
                        servicio = jComboBox7.getSelectedItem().toString();
                        Reservas r_s = new Reservas(nroHabitacion, nroNoches, fecha_ingreso, fecha_salida, servicio, tipo, "");
                        cadReservas.crear(r_s);
                        double monto = nroNoches * h_matrimonial.obtener(pos).getPrecio();
                        double total = monto + this.costo_servicio(servicio, nroNoches);
                        String nro_reserva = cadReservas.obtener().get((cadReservas.obtener().size() - 1)).getNroReserva();
                        jTextField3.setText(nro_reserva);
                        Reservas x = cadReservas.buscar(nro_reserva);
                        jTextArea1.setText(x.getNroReserva() + "\n" + x.getNroHabitacion() + "\n" + x.getNroNoches() + "\n" + x.getFecha_ingreso()
                                + "\n" + x.getFecha_salida() + "\n" + x.getServicio() + "\n" + x.getTipo());
                        JOptionPane.showMessageDialog(null, "Reseva exitosa");
                    } else {
                        JOptionPane.showMessageDialog(null, "La habitacion se encuentra ocupada");
                    }
                }
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        PanelControl_Users windows = new PanelControl_Users();
        windows.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        PanelControl_Users windows = new PanelControl_Users();
        windows.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        PanelControl_Users windows = new PanelControl_Users();
        windows.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String cadena = "";
        for (Reservas s : cadReservas.obtener()) {
            cadena+= s.getNroReserva() + "\n" + s.getNroHabitacion() + "\n" + s.getNroNoches() + "\n" + s.getFecha_ingreso() + 
                    "\n" + s.getFecha_salida() + "\n" + s.getServicio() + "\n" + s.getTipo() + ""
                    + "\n--------------------------------------- \n\n";;
        }
        jTextArea2.setText("Reservas de habitaciones: \n" + cadena);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea2.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String tipo = jComboBox9.getSelectedItem().toString();
        String nroReserva = jTextField4.getText();
        String nroHabitacion = "", fecha_ingreso = "", fecha_salida = "", servicio = "";
        int nroNoches;
        switch (tipo) {
            case "Habitacion Simple":
                jTextField5.setEditable(true);
                Reservas bus = cadReservas.buscar(nroReserva);
                if (bus == null) {
                    JOptionPane.showMessageDialog(null, "El numero de la habitacion no existe o no es una habitacion simple");
                } else {
                    jTextField5.setText(bus.getNroHabitacion());
                    jTextField7.setText(bus.getFecha_ingreso());
                    jTextField8.setText(bus.getFecha_salida());
                    jTextField9.setText(bus.getServicio());
                    jTextField11.setText("" + bus.getNroNoches());
                }
                break;
            case "Habitacion Doble":
                jTextField5.setEditable(true);
                Reservas bus_d = cadReservas.buscar(nroReserva);
                if (bus_d == null) {
                    JOptionPane.showMessageDialog(null, "El numero de la habitacion no existe o no es una habitacion doble");
                } else {
                    jTextField5.setText(bus_d.getNroHabitacion());
                    jTextField7.setText(bus_d.getFecha_ingreso());
                    jTextField8.setText(bus_d.getFecha_salida());
                    jTextField9.setText(bus_d.getServicio());
                    jTextField11.setText("" + bus_d.getNroNoches());
                }
                break;
            case "Habitacion Matrimonial":
                jTextField5.setEditable(true);
                Reservas bus_m = cadReservas.buscar(nroReserva);
                if (bus_m == null) {
                    JOptionPane.showMessageDialog(null, "El numero de la habitacion no existe o no es una habitacion matrimonial");
                } else {
                    jTextField5.setText(bus_m.getNroHabitacion());
                    jTextField7.setText(bus_m.getFecha_ingreso());
                    jTextField8.setText(bus_m.getFecha_salida());
                    jTextField9.setText(bus_m.getServicio());
                    jTextField11.setText("" + bus_m.getNroNoches());
                }
                break;
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String tipo = jComboBox9.getSelectedItem().toString();
        String nroReserva = jTextField4.getText();
        String nroHabitacion = jTextField5.getText(), fecha_ingreso = "", fecha_salida = "", servicio = "";
        int nroNoches = Integer.parseInt(jTextField11.getText());
        switch (tipo) {
            case "Habitacion Simple":
                Reservas bus = cadReservas.buscar(nroReserva);
                if (bus == null) {
                    JOptionPane.showMessageDialog(null, "El numero de la habitacion no existe o no es una habitacion simple");
                } else {
                    bus.setNroHabitacion(jTextField5.getText());
                    bus.setFecha_ingreso(jTextField7.getText());
                    bus.setFecha_salida(jTextField8.getText());
                    bus.setServicio(jComboBox16.getSelectedItem().toString());
                    bus.setServicio(jComboBox16.getSelectedItem().toString());
                    fecha_ingreso = jComboBox10.getSelectedItem().toString() + "/" + jComboBox11.getSelectedItem().toString() + "/" + jComboBox12.getSelectedItem().toString();
                    fecha_salida = jComboBox13.getSelectedItem().toString() + "/" + jComboBox14.getSelectedItem().toString() + "/" + jComboBox15.getSelectedItem().toString();

                    bus.setFecha_ingreso(fecha_ingreso);
                    bus.setFecha_salida(fecha_salida);
                    bus.setNroNoches(nroNoches);
                    cadReservas.actualizar(bus);
                    JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                }
                break;
            case "Habitacion Doble":
                Reservas bus_d = cadReservas.buscar(nroReserva);
                if (bus_d == null) {
                    JOptionPane.showMessageDialog(null, "El numero de la habitacion no existe o no es una habitacion doble");
                } else {
                    bus_d.setNroHabitacion(jTextField5.getText());
                    bus_d.setFecha_ingreso(jTextField7.getText());
                    bus_d.setFecha_salida(jTextField8.getText());
                    bus_d.setServicio(jComboBox16.getSelectedItem().toString());
                    bus_d.setServicio(jComboBox16.getSelectedItem().toString());
                    fecha_ingreso = jComboBox10.getSelectedItem().toString() + "/" + jComboBox11.getSelectedItem().toString() + "/" + jComboBox12.getSelectedItem().toString();
                    fecha_salida = jComboBox13.getSelectedItem().toString() + "/" + jComboBox14.getSelectedItem().toString() + "/" + jComboBox15.getSelectedItem().toString();

                    bus_d.setFecha_ingreso(fecha_ingreso);
                    bus_d.setFecha_salida(fecha_salida);
                    bus_d.setNroNoches(nroNoches);
                    cadReservas.actualizar(bus_d);
                    JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                }
                break;
            case "Habitacion Matrimonial":
                Reservas bus_m = cadReservas.buscar(nroReserva);
                if (bus_m == null) {
                    JOptionPane.showMessageDialog(null, "El numero de la habitacion no existe o no es una habitacion matrimonial");
                } else {
                    bus_m.setNroHabitacion(jTextField5.getText());
                    bus_m.setFecha_ingreso(jTextField7.getText());
                    bus_m.setFecha_salida(jTextField8.getText());
                    bus_m.setServicio(jComboBox16.getSelectedItem().toString());
                    bus_m.setServicio(jComboBox16.getSelectedItem().toString());
                    fecha_ingreso = jComboBox10.getSelectedItem().toString() + "/" + jComboBox11.getSelectedItem().toString() + "/" + jComboBox12.getSelectedItem().toString();
                    fecha_salida = jComboBox13.getSelectedItem().toString() + "/" + jComboBox14.getSelectedItem().toString() + "/" + jComboBox15.getSelectedItem().toString();

                    bus_m.setFecha_ingreso(fecha_ingreso);
                    bus_m.setFecha_salida(fecha_salida);
                    bus_m.setNroNoches(nroNoches);
                    cadReservas.actualizar(bus_m);
                    JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                }
                break;
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Frame_reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_reservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
