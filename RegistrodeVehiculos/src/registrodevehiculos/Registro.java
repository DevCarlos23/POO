package registrodevehiculos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla;
    ArrayList<Dato> lista = new ArrayList<>();

    public Registro() {
        initComponents();
        configurarjTableVehiculos();
    }

    private void configurarjTableVehiculos() {
        modeloTabla = new DefaultTableModel(
                new String[]{"Tipo", "Marca", "Año", "País", "Modelo", "Estado"}, 0
        );
        jTableVehiculos.setModel(modeloTabla);
    }

    private void agregarCoches(Dato d) {
        modeloTabla.addRow(new Object[]{
            d.getTipoVehiculo(),
            d.getMarca(),
            d.getAñoDeFabricacion(),
            d.getPais(),
            d.getModelo(),
            d.getEstado()
        });
    }

    private void borrar() {
        TipoDeVehiculo.setSelectedIndex(0); // Tipo de vehículo
        Marca.setSelectedIndex(0); // Marca
        AñoDeFabricacion.setSelectedIndex(0); // Año de fabricación
        Pais.setText("");        // País
        Modelo.setText("");        // Modelo
        buttonGroup1.clearSelection();  // Limpia los radio buttons
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TipoDeVehiculo = new javax.swing.JComboBox<>();
        Marca = new javax.swing.JComboBox<>();
        AñoDeFabricacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Pais = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Modelo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Crear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CrearYGuardar = new javax.swing.JButton();
        Leer = new javax.swing.JButton();
        EliminarTXT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVehiculos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Estado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Programacion Orientada a odjetos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("REGISTRO DE VEHÍCULOS CONSECIONARIO ZZZZ");

        TipoDeVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de vehiculo", "Sedán", "Hatchback", "SUV", "Crossover", "Pickup", "Coupe", "Convertible", "Deportivo", "Station Wagon", "Van", "Minivan", "Camioneta", "Compacto", "Microcar", "Roadster", "Todo Terreno (4x4)", "Off-Road", "Eléctrico", "Híbrido", "Diesel", "Gasolina", "Autónomo", "Comercial", "Limusina", "Taxi", "Bus", "Camión", "Trailer", "Ambulancia", "Patrulla", "Carro de carrera" }));

        Marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Toyota", "Honda", "Nissan", "Mazda", "Hyundai", "Kia", "Chevrolet", "Ford", "Dodge", "Jeep", "RAM", "GMC", "Buick", "Cadillac", "Chrysler", "Volkswagen", "Audi", "BMW", "Mercedes-Benz", "Porsche", "Volvo", "Peugeot", "Renault", "Fiat", "Citroën", "Seat", "Skoda", "Lexus", "Infiniti", "Acura", "Subaru", "Suzuki", "Mitsubishi", "Jaguar", "Land Rover", "Mini", "Tesla", "Rivian", "Lucid", "Ferrari", "Lamborghini", "Maserati", "McLaren", "Bentley", "Rolls-Royce", "Aston Martin", "Bugatti", "Pagani", "Koenigsegg" }));

        AñoDeFabricacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año de fabricacion", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986" }));

        jLabel3.setText("Pais");

        jLabel4.setText("Modelo");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/agregar.png"))); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/eliminar.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/buscar.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cerrar.png"))); // NOI18N
        Crear.setText("Cerrar");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Eliminar)
                .addGap(29, 29, 29)
                .addComponent(Buscar)
                .addGap(27, 27, 27)
                .addComponent(Crear)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crear)
                    .addComponent(Buscar)
                    .addComponent(Eliminar)
                    .addComponent(Agregar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CrearYGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/crearyguadar.png"))); // NOI18N
        CrearYGuardar.setText("Crear y Guardar");
        CrearYGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearYGuardarActionPerformed(evt);
            }
        });

        Leer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/leer.png"))); // NOI18N
        Leer.setText("Leer");
        Leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerActionPerformed(evt);
            }
        });

        EliminarTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/txt.png"))); // NOI18N
        EliminarTXT.setText("Eliminar txt");
        EliminarTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CrearYGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Leer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EliminarTXT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearYGuardar)
                    .addComponent(Leer)
                    .addComponent(EliminarTXT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTableVehiculos.setToolTipText("");
        jScrollPane2.setViewportView(jTableVehiculos);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/red-mundial.png"))); // NOI18N
        jLabel5.setText(".");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/coche.png"))); // NOI18N
        jLabel6.setText(".");

        jLabel7.setText("Estado");

        Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semi nuevo", "Usado", "Nuevo" }));
        Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Pais)
                                .addComponent(Marca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TipoDeVehiculo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AñoDeFabricacion, javax.swing.GroupLayout.Alignment.LEADING, 0, 286, Short.MAX_VALUE)
                                .addComponent(Modelo))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(743, 743, 743)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(741, 741, 741)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoDeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AñoDeFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Esta seguro de cerrar", "Alerta", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_CrearActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int filaSeleccionada = jTableVehiculos.getSelectedRow();
        if (filaSeleccionada != -1) {
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "¿Desea eliminar el vehículo seleccionado?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                lista.remove(filaSeleccionada); // elimina del ArrayList
                modeloTabla.removeRow(filaSeleccionada); // elimina de la tabla
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un vehículo para eliminar.");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String modeloBuscado = JOptionPane.showInputDialog(this, "Ingrese el modelo a buscar:");

        if (modeloBuscado == null || modeloBuscado.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un modelo para buscar.");
            return;
        }

        modeloTabla.setRowCount(0);

        boolean encontrado = false;
        for (Dato d : lista) {
            if (d.getModelo().equalsIgnoreCase(modeloBuscado)) {
                modeloTabla.addRow(new Object[]{
                    d.getModelo(),
                    d.getMarca(),
                    d.getPais(),
                    d.getTipoVehiculo(),
                    d.getAñoDeFabricacion()
                });
                encontrado = true;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "No se encontró ningún vehículo con el modelo: " + modeloBuscado);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

        String tipoVehiculo = (String) TipoDeVehiculo.getSelectedItem();
        String marca = (String) Marca.getSelectedItem();
        String añoDeFabricacion = (String) AñoDeFabricacion.getSelectedItem();
        String pais = Pais.getText();
        String modelo = Modelo.getText();
        String estado = (String) Estado.getSelectedItem();

        if (!tipoVehiculo.equals("Tipo de vehiculo")
                && !marca.equals("Marca")
                && !añoDeFabricacion.equals("Año de fabricacion")
                && !pais.isEmpty()
                && !modelo.isEmpty()) {

            Dato nuevo = new Dato(tipoVehiculo, marca, añoDeFabricacion, pais, modelo, estado);
            lista.add(nuevo);
            agregarCoches(nuevo);
            borrar(); // Limpia los campos
            JOptionPane.showMessageDialog(this, "Vehículo agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Complete todos los campos antes de agregar.");
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void CrearYGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearYGuardarActionPerformed
        Archivo ar = new Archivo();
        ar.crearArchivo();
        ar.guardarEnArchivo(lista);
    }//GEN-LAST:event_CrearYGuardarActionPerformed

    private void EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoActionPerformed

    private void LeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerActionPerformed
        Archivo archivo = new Archivo();
        ArrayList<Dato> leidos = archivo.leerDesdeArchivo();

        lista = leidos;

        modeloTabla.setRowCount(0);

        for (Dato d : lista) {
            modeloTabla.addRow(new Object[]{
                d.getTipoVehiculo(),
                d.getMarca(),
                d.getAñoDeFabricacion(),
                d.getPais(),
                d.getModelo(),
                d.getEstado()
            });
        }

        JOptionPane.showMessageDialog(this, "Datos cargados correctamente.");
    }//GEN-LAST:event_LeerActionPerformed

    private void EliminarTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTXTActionPerformed
        Archivo arch = new Archivo();
        arch.eliminarArchivo();
    }//GEN-LAST:event_EliminarTXTActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> AñoDeFabricacion;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Crear;
    private javax.swing.JButton CrearYGuardar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton EliminarTXT;
    private javax.swing.JComboBox<String> Estado;
    private javax.swing.JButton Leer;
    private javax.swing.JComboBox<String> Marca;
    private javax.swing.JTextField Modelo;
    private javax.swing.JTextField Pais;
    private javax.swing.JComboBox<String> TipoDeVehiculo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableVehiculos;
    // End of variables declaration//GEN-END:variables
}
