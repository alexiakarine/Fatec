package classes;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class TelaCarinhoCompras extends javax.swing.JFrame {
    
   
    private ArrayList compra;
    
    public TelaCarinhoCompras() {
        initComponents();
        painel.setVisible(false);
        compra = new ArrayList();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        painel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltmodelo = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ltCor = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ltPonta = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        cbModelo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbCor = new javax.swing.JComboBox<>();
        cbPonta = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(ltmodelo);

        jLabel6.setText("Modelo");

        jScrollPane2.setViewportView(ltCor);

        jLabel7.setText("Cor");

        jScrollPane3.setViewportView(ltPonta);

        jLabel8.setText("Ponta");

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(93, 93, 93))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        cbModelo.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        cbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bic", "Cis", "Faber Castel", " " }));
        cbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModeloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel1.setText("Cor");

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel2.setText("Ponta");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel3.setText("Modelo");

        cbCor.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        cbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Preta", "Vermelha", "Rosa" }));
        cbCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCorActionPerformed(evt);
            }
        });

        cbPonta.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        cbPonta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.5", "0.7", "1.0", " " }));
        cbPonta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPontaActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 102, 102));
        btnAdd.setText("Adicionar ao Carrinho");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(153, 153, 153));
        btnCalcular.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 102, 102));
        btnCalcular.setText("Finalizar Compra");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/diminuir.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Escolha sua caneta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbCor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPonta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPonta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String modelo= cbModelo.getItemAt(cbModelo.getSelectedIndex());
        String cor= cbCor.getItemAt(cbCor.getSelectedIndex());
        String ponta= cbPonta.getItemAt(cbPonta.getSelectedIndex());
        
        Caneta x = new Caneta(modelo,cor,ponta);
        compra.add(x);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
         painel.setVisible(true);
         
         DefaultListModel elemento1 = new DefaultListModel();
         DefaultListModel elemento2 = new DefaultListModel();
         DefaultListModel elemento3 = new DefaultListModel();
         
         for(int i=0; i<compra.size(); i++)
          {
            Caneta x=(Caneta)compra.get(i);
            elemento1.addElement(x.getModelo());
            elemento2.addElement(x.getCor());
            elemento3.addElement(x.getPonta());
                        
          }
         ltmodelo.setModel(elemento1);
         ltCor.setModel(elemento2);
         ltPonta.setModel(elemento3);
               
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbModeloActionPerformed

    private void cbCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCorActionPerformed

    private void cbPontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPontaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPontaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCarinhoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarinhoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarinhoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarinhoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarinhoCompras().setVisible(true);
            }
        });
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cbCor;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JComboBox<String> cbPonta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JList<String> ltCor;
    private javax.swing.JList<String> ltPonta;
    private javax.swing.JList<String> ltmodelo;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
