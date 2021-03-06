

package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class VistaPreparacionBPjvsCpu extends javax.swing.JPanel {

   
    public VistaPreparacionBPjvsCpu() {
        initComponents();
        btComenzar.setEnabled(false);
    }

    public JButton getBtAtras() {
        return btAtras;
    }

    public JButton getBtComenzar() {
        return btComenzar;
    }

    public JButton getBtAdministrarPj() {
        return btAdministrarPj;
    }

    public JComboBox<String> getLtCPU() {
        return ItemCpu;
    }

    public JTextArea getTxtEstadisticas() {
        return txtEstadisticas;
    }
    public JButton getBtSeleccionar(){
        return SeleccCpu;
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ItemCpu = new javax.swing.JComboBox<>();
        btAtras = new javax.swing.JButton();
        btAdministrarPj = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btComenzar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEstadisticas = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        SeleccCpu = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Preparacion Batalla Pj Vs Cpu");

        ItemCpu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ItemCpu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPU1", "CPU2", "CPU3" }));

        btAtras.setText("Atras");

        btAdministrarPj.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btAdministrarPj.setText("Administrar Personaje");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Seleccionar  una Cpu rival:");

        btComenzar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btComenzar.setText("Comenzar");

        txtEstadisticas.setColumns(20);
        txtEstadisticas.setForeground(new java.awt.Color(0, 0, 255));
        txtEstadisticas.setRows(5);
        txtEstadisticas.setCaretColor(new java.awt.Color(51, 0, 255));
        txtEstadisticas.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        txtEstadisticas.setEnabled(false);
        txtEstadisticas.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(txtEstadisticas);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Estadisticas Cpus");

        SeleccCpu.setText("Seleccionar");
        SeleccCpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccCpuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAtras)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAdministrarPj, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ItemCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SeleccCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(241, 241, 241)
                            .addComponent(jLabel1))))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(SeleccCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btAdministrarPj)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtras)
                    .addComponent(btComenzar))
                .addGap(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccCpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccCpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccCpuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ItemCpu;
    private javax.swing.JButton SeleccCpu;
    private javax.swing.JButton btAdministrarPj;
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btComenzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtEstadisticas;
    // End of variables declaration//GEN-END:variables
}
