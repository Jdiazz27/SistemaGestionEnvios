
package sistemadegestiondeenvios;




public class pantallaPrincipal extends javax.swing.JFrame {

    public pantallaPrincipal() {
          
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Sistemas de gestión de envíos");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        CalcularTyP = new javax.swing.JButton();
        Reporte = new javax.swing.JButton();
        Seguimiento = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(173, 214, 245));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 56, 105));
        jLabel9.setText("Sistema de gestion de envios");

        Salir.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 67, 127), 2));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        CalcularTyP.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        CalcularTyP.setText("Cálculo de tarifas y pagos");
        CalcularTyP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 67, 127), 2));
        CalcularTyP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularTyPActionPerformed(evt);
            }
        });

        Reporte.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Reporte.setText("Reportes de entregas");
        Reporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 67, 127), 2));
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });

        Seguimiento.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Seguimiento.setText("Seguimiento del paquete");
        Seguimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 67, 127), 2));
        Seguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeguimientoActionPerformed(evt);
            }
        });

        Registrar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Registrar.setText("Registrar pedidos y envíos");
        Registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 68, 130), 2));
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CalcularTyP, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CalcularTyP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(Seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        datosRemitente ventana = new datosRemitente();
        ventana.setLocationRelativeTo(null); // Centrar
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistrarActionPerformed

    private void CalcularTyPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularTyPActionPerformed
        PanelTarifas v2 = new PanelTarifas();
        v2.setLocationRelativeTo(null); 
        v2.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_CalcularTyPActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();  
    }//GEN-LAST:event_SalirActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        this.dispose(); 
    }//GEN-LAST:event_ReporteActionPerformed

    private void SeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeguimientoActionPerformed
        SeguimientoDelPaquete v3 = new SeguimientoDelPaquete();
        v3.setLocationRelativeTo(null); 
        v3.setVisible(true);
    }//GEN-LAST:event_SeguimientoActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new pantallaPrincipal().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularTyP;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Reporte;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Seguimiento;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
