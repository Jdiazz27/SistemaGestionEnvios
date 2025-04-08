/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemadegestiondeenvios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class datosRemitente extends javax.swing.JFrame {

    public datosRemitente() {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana
        setTitle("Registro");
//        setIconImage(new ImageIcon(getClass().getResource("/imagenes/file.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TipoId = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        Id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AgregarCliente = new javax.swing.JButton();
        Datosdelpaquete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Datos del remitente");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        Nombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Tipo de identificación:");

        TipoId.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "‎", "Cedula", "Pasaporte", "NIT", " " }));
        TipoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoIdActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Teléfono:");

        Telefono.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Email:");

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Dirección de envío:");

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        Id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Ingrese id:");

        AgregarCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AgregarCliente.setText("Agregar cliente");
        AgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarClienteActionPerformed(evt);
            }
        });

        Datosdelpaquete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Datosdelpaquete.setText("Datos del paquete");
        Datosdelpaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosdelpaqueteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Datosdelpaquete, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel1))))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TipoId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Nombre)
                            .addComponent(Id)))
                    .addComponent(jLabel2))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(AgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(Datosdelpaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoIdActionPerformed

    }//GEN-LAST:event_TipoIdActionPerformed

    private void AgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarClienteActionPerformed
       String nombre = Nombre.getText().trim();
        String direccion = jTextField4.getText().trim();
        String tipoId = TipoId.getSelectedItem().toString();
        String id = Id.getText().trim();
        String telefono = Telefono.getText().trim();
        String email = jTextField3.getText().trim();

        // Validación de campos obligatorios
        if (nombre.isEmpty() || direccion.isEmpty() || id.isEmpty() || tipoId.equals("Seleccione...")) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación de formato de teléfono
        if (!telefono.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "El teléfono debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación básica de email
        if (!email.isEmpty() && (!email.contains("@") || !email.contains("."))) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un email válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Guardar en archivo
        try {
            FileWriter fw = new FileWriter("clientes.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nombre + "," + direccion + "," + tipoId + "," + id + "," + telefono + "," + email);
            bw.newLine();
            bw.close();
            
            JOptionPane.showMessageDialog(this, "Cliente agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            // Limpiar campos después de guardar
            Nombre.setText("");
            jTextField4.setText("");
            TipoId.setSelectedIndex(0);
            Id.setText("");
            Telefono.setText("");
            jTextField3.setText("");
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AgregarClienteActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void DatosdelpaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosdelpaqueteActionPerformed
        datosDestinatario destino = new datosDestinatario(); // Suponiendo que así se llama
        destino.setLocationRelativeTo(null); // Centra la ventana
        destino.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DatosdelpaqueteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println("Error al configurar el look and feel: " + ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datosRemitente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCliente;
    private javax.swing.JButton Datosdelpaquete;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Telefono;
    private javax.swing.JComboBox<String> TipoId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
