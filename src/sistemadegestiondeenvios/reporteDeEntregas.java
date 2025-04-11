/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemadegestiondeenvios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jdiaz
 */
public class reporteDeEntregas extends javax.swing.JFrame {

    /**
     * Creates new form datosDestinatario
     */
    public reporteDeEntregas() {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IdTxa = new javax.swing.JTextField();
        TipoId = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        repoTxa = new javax.swing.JTextArea();
        BuscarBtn = new javax.swing.JButton();
        ActualizarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte de entregas");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Id del paquete:");

        TipoId.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "‎", "Cedula", "Pasaporte", "NIT", " " }));
        TipoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de identificación:");

        repoTxa.setColumns(20);
        repoTxa.setRows(5);
        jScrollPane1.setViewportView(repoTxa);

        BuscarBtn.setText("Buscar");
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });

        ActualizarBtn.setText("Actualizar");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Actualizar estado del paquete");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IdTxa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(136, 136, 136)))
                        .addComponent(BuscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ActualizarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IdTxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BuscarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ActualizarBtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoIdActionPerformed

    }//GEN-LAST:event_TipoIdActionPerformed

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        String id = IdTxa.getText().trim();
        String tipoId = ((String) TipoId.getSelectedItem()).trim();
        String lineaPaquete = null;
        String lineaTarifa = null;

// Leer reporte_del_paquete.txt línea por línea
        try ( BufferedReader br = new BufferedReader(new FileReader("reporte_del_paquete.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 8) {
                    String tipoIdArchivo = datos[2].trim();
                    String idArchivo = datos[3].trim();
                    if (tipoIdArchivo.equalsIgnoreCase(tipoId) && idArchivo.equals(id)) {
                        lineaPaquete = linea;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            repoTxa.setText("❌ Error al leer el archivo reporte_del_paquete.txt");
            return;
        }

// Leer tarifa.txt (aquí asumimos que hay una línea por ID)
        try ( BufferedReader br = new BufferedReader(new FileReader("tarifa.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(id)) {
                    lineaTarifa = linea;
                    break;
                }
            }
        } catch (IOException e) {
            repoTxa.setText("❌ Error al leer el archivo tarifa.txt");
            return;
        }

// Mostrar resultado en repoTxa
        if (lineaPaquete != null) {
            String[] datos = lineaPaquete.split(",");
            StringBuilder resultado = new StringBuilder();
            resultado.append("📦 Datos del paquete:\n")
                    .append("Nombre: ").append(datos[0]).append("\n")
                    .append("Dirección: ").append(datos[1]).append("\n")
                    .append("Tipo de ID: ").append(datos[2]).append("\n")
                    .append("ID: ").append(datos[3]).append("\n")
                    .append("Teléfono: ").append(datos[4]).append("\n")
                    .append("Email: ").append(datos[5]).append("\n")
                    .append("Código de seguimiento: ").append(datos[6]).append("\n");

            // Mostrar en consola antes de añadir al área de texto
            System.out.println("Estado actual: " + datos[7]);

            resultado.append("Estado actual: ").append(datos[7]);

            if (lineaTarifa != null) {
                String[] tarifaDatos = lineaTarifa.split(",");
                if (tarifaDatos.length >= 6) {
                    resultado.append("\n\n💰 Costo total:\n")
                            .append("ID: ").append(tarifaDatos[0]).append("\n")
                            .append("Tipo de ID: ").append(tarifaDatos[1]).append("\n")
                            .append("Destino: ").append(tarifaDatos[2]).append("\n")
                            .append("Urgencia: ").append(tarifaDatos[3]).append("\n")
                            .append("Peso: ").append(tarifaDatos[4]).append(" kg\n")
                            .append("Total: $").append(tarifaDatos[5]);
                } else {
                    resultado.append("\n\n⚠️ No se pudo formatear la tarifa.");
                }
            } else {
                resultado.append("\n\n⚠️ No se encontró el costo en tarifa.txt.");
            }

            repoTxa.setText(resultado.toString());
        } else {
            repoTxa.setText("❌ No se encontraron datos con ese ID y tipo de identificación.");
        }

    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void ActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtnActionPerformed
        String id = IdTxa.getText().trim();
    String tipoId = ((String) TipoId.getSelectedItem()).trim();

    if (id.isEmpty() || tipoId.equals("‎")) {
        repoTxa.setText("Por favor, introduzca un ID y seleccione el tipo de identificación.");
        return;
    }

    try {
        // Leer estados disponibles
        String[] estados = new String[5];
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("estados.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null && count < estados.length) {
                estados[count++] = linea;
            }
        }

        // Leer el archivo de paquetes
        java.util.List<String> lineas = new java.util.ArrayList<>();
        String nuevaLinea = null;

        try (BufferedReader br = new BufferedReader(new FileReader("reporte_del_paquete.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 8 && datos[2].equalsIgnoreCase(tipoId) && datos[3].equals(id)) {
                    // Obtener el estado actual
                    String estadoActual = datos[7].trim();
                    // Buscar el siguiente estado
                    int indexActual = -1;
                    for (int i = 0; i < count; i++) {
                        if (estados[i].equalsIgnoreCase(estadoActual)) {
                            indexActual = i;
                            break;
                        }
                    }
                    // Actualizar al siguiente estado (si hay)
                    if (indexActual >= 0 && indexActual < count - 1) {
                        datos[7] = estados[indexActual + 1];
                        nuevaLinea = String.join(",", datos);
                        lineas.add(nuevaLinea);
                    } else {
                        // Ya está en el último estado
                        lineas.add(linea);
                        repoTxa.setText("📦 El paquete ya se encuentra en su estado final: " + estadoActual);
                        return;
                    }
                } else {
                    lineas.add(linea);
                }
            }
        }

        // Escribir de nuevo todo el archivo con la línea modificada
        try (java.io.FileWriter fw = new java.io.FileWriter("reporte_del_paquete.txt")) {
            for (String l : lineas) {
                fw.write(l + "\n");
            }
        }

        // Mostrar resultado actualizado en el JTextArea
        if (nuevaLinea != null) {
            String[] datos = nuevaLinea.split(",");
            StringBuilder resultado = new StringBuilder();
            resultado.append("📦 Datos del paquete:\n")
                    .append("Nombre: ").append(datos[0]).append("\n")
                    .append("Dirección: ").append(datos[1]).append("\n")
                    .append("Tipo de ID: ").append(datos[2]).append("\n")
                    .append("ID: ").append(datos[3]).append("\n")
                    .append("Teléfono: ").append(datos[4]).append("\n")
                    .append("Email: ").append(datos[5]).append("\n")
                    .append("Código de seguimiento: ").append(datos[6]).append("\n")
                    .append("Estado actualizado: ").append(datos[7]);
            repoTxa.setText(resultado.toString());
        } else {
            repoTxa.setText("❌ No se encontró ningún paquete con ese ID y tipo de identificación.");
        }

    } catch (IOException e) {
        repoTxa.setText("❌ Error al actualizar el estado del paquete.");
        e.printStackTrace();
    }
    }//GEN-LAST:event_ActualizarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(reporteDeEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reporteDeEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reporteDeEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reporteDeEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reporteDeEntregas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JTextField IdTxa;
    private javax.swing.JComboBox<String> TipoId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea repoTxa;
    // End of variables declaration//GEN-END:variables
}
