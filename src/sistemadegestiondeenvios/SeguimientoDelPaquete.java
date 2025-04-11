/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemadegestiondeenvios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author lhaur
 */
public class SeguimientoDelPaquete extends javax.swing.JFrame {

    /**
     * Creates new form SeguimientoDelPaquete
     */
    public SeguimientoDelPaquete() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Seguimientotxt = new javax.swing.JTextField();
        codigoBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        estadoTxa = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        buscarBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        IdTxa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TipoId = new javax.swing.JComboBox<>();

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/left-arrow.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 67, 127), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(198, 232, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 67, 124));
        jLabel1.setText("Seguimiento");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Estado del paquete:");

        Seguimientotxt.setEditable(false);

        codigoBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        codigoBtn.setText("Generar codigo");
        codigoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 67, 124), 2));
        codigoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Número de seguimiento:");

        estadoTxa.setColumns(20);
        estadoTxa.setRows(5);
        jScrollPane1.setViewportView(estadoTxa);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/left-arrow.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 67, 127), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buscarBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 67, 124), 2));
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Id del paquete:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de identificación:");

        TipoId.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "‎", "Cedula", "Pasaporte", "NIT", " " }));
        TipoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdTxa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(TipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(codigoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Seguimientotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(Seguimientotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IdTxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codigoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pantallaPrincipal p = new pantallaPrincipal();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pantallaPrincipal p = new pantallaPrincipal();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void codigoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBtnActionPerformed
        String idBuscado = IdTxa.getText().trim();
        String tipoIdBuscado = TipoId.getSelectedItem().toString();

        if (idBuscado.isEmpty() || tipoIdBuscado.equals("‎")) {
            estadoTxa.setText("Por favor, ingrese el ID y seleccione el tipo de identificación.");
            return;
        }

// Generar código de seguimiento aleatorio
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            codigo.append(random.nextInt(10));
        }
        String codigoGenerado = codigo.toString();
        Seguimientotxt.setText(codigoGenerado);  // Mostrar el código en el campo correspondiente

        StringBuilder infoCliente = new StringBuilder();
        boolean encontrado = false;
        String[] datosCliente = null;

        try ( BufferedReader br = new BufferedReader(new FileReader("clientes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 6) {
                    String tipoId = datos[2].trim();
                    String id = datos[3].trim();

                    if (tipoId.equals(tipoIdBuscado) && id.equals(idBuscado)) {
                        // Guardamos los datos para luego usarlos en estadoTxa y en el archivo
                        datosCliente = datos;
                        encontrado = true;
                        break;
                    }
                }
            }

            if (!encontrado) {
                estadoTxa.setText("Cliente no encontrado con esos datos.");
                return;
            }

        } catch (IOException e) {
            estadoTxa.setText("Error al leer el archivo de clientes.");
            e.printStackTrace();
            return;
        }

// Leer primer estado del archivo estados.txt
        String primerEstado = "";
        try ( BufferedReader br = new BufferedReader(new FileReader("estados.txt"))) {
            primerEstado = br.readLine();  // Solo se necesita el primer estado
        } catch (IOException e) {
            primerEstado = "Estado desconocido";
            e.printStackTrace();
        }

// Mostrar en el JTextArea (con etiquetas para el usuario)
        infoCliente.append("Cliente encontrado:\n\n")
                .append("Nombre: ").append(datosCliente[0]).append("\n")
                .append("Dirección: ").append(datosCliente[1]).append("\n")
                .append("Tipo de ID: ").append(datosCliente[2]).append("\n")
                .append("ID: ").append(datosCliente[3]).append("\n")
                .append("Teléfono: ").append(datosCliente[4]).append("\n")
                .append("Email: ").append(datosCliente[5]).append("\n")
                .append("Código de seguimiento: ").append(codigoGenerado).append("\n")
                .append("Estado actual: ").append(primerEstado).append("\n");

        estadoTxa.setText(infoCliente.toString());

                                                                                                // Guardar en archivo reporte_del_paquete.txt sin etiquetas
        try ( FileWriter fw = new FileWriter("reporte_del_paquete.txt", true)) {
            fw.write(
                    datosCliente[0] + ","
                    + // Nombre
                    datosCliente[1] + ","
                    + // Dirección
                    datosCliente[2] + ","
                    + // Tipo de ID
                    datosCliente[3] + ","
                    + // ID
                    datosCliente[4] + ","
                    + // Teléfono
                    datosCliente[5] + ","
                    + // Email
                    codigoGenerado + ","
                    + // Código de seguimiento
                    primerEstado + "\n" // Estado
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_codigoBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        String idBuscado = IdTxa.getText().trim();
        String tipoIdBuscado = TipoId.getSelectedItem().toString();

        if (idBuscado.isEmpty() || tipoIdBuscado.equals("Seleccione...")) {
            estadoTxa.setText("Por favor, ingrese el ID y seleccione el tipo de identificación.");
            return;
        }

        boolean encontrado = false;
        try ( BufferedReader br = new BufferedReader(new FileReader("clientes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                // Asegurar que haya suficientes campos
                if (datos.length >= 6) {
                    String tipoId = datos[2].trim();
                    String id = datos[3].trim();

                    if (tipoId.equals(tipoIdBuscado) && id.equals(idBuscado)) {
                        // Mostrar todos los datos en el JTextArea
                        estadoTxa.setText("Cliente encontrado:\n\n"
                                + "Nombre: " + datos[0] + "\n"
                                + "Dirección: " + datos[1] + "\n"
                                + "Tipo de ID: " + datos[2] + "\n"
                                + "ID: " + datos[3] + "\n"
                                + "Teléfono: " + datos[4] + "\n"
                                + "Email: " + datos[5]);
                        encontrado = true;
                        break;
                    }
                }
            }

            if (!encontrado) {
                estadoTxa.setText("Cliente no encontrado con esos datos.");
            }

        } catch (IOException e) {
            estadoTxa.setText("Error al leer el archivo de clientes.");
            e.printStackTrace();
        }

    }//GEN-LAST:event_buscarBtnActionPerformed

    private void TipoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoIdActionPerformed

    }//GEN-LAST:event_TipoIdActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeguimientoDelPaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdTxa;
    private javax.swing.JTextField Seguimientotxt;
    private javax.swing.JComboBox<String> TipoId;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton codigoBtn;
    private javax.swing.JTextArea estadoTxa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
