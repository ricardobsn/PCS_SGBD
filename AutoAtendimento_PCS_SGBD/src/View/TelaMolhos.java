/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.ControleTelaMolhos;
import Model.Pedido;
import javax.swing.ImageIcon;

/**
 *
 * @author Diagramar
 */
public class TelaMolhos extends javax.swing.JFrame {
    
 ControleTelaMolhos novo;
    /**
     * Creates new form TelaMassas
     */
    public TelaMolhos(Pedido s, TelaAtendente atendente) {
        initComponents();
        this.setLocationRelativeTo(null);
        novo = new ControleTelaMolhos(this, atendente);
        novo.setPedido(s);
        proximo.setEnabled(false);
    }
    public void ativar(){
        bolognesa.setEnabled(true);
        funghi.setEnabled(true);
        sugo.setEnabled(true);
        quatroQueijos.setEnabled(true);
        branco.setEnabled(true);
        proximo.setEnabled(false);
    }
    public void desativar(){
        bolognesa.setEnabled(false);
        funghi.setEnabled(false);
        sugo.setEnabled(false);
        quatroQueijos.setEnabled(false);
        branco.setEnabled(false);
        proximo.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        funghi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        escolhaMolho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        proximo = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sugo = new javax.swing.JButton();
        quatroQueijos = new javax.swing.JButton();
        bolognesa = new javax.swing.JButton();
        branco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Molhos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(247, 224, 182));

        funghi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_funghi.png"))); // NOI18N
        funghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funghiActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(252, 207, 132));

        escolhaMolho.setBackground(new java.awt.Color(245, 156, 97));
        escolhaMolho.setToolTipText("");
        escolhaMolho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        escolhaMolho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaMolhoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sua(s) Escolha(s) :");

        proximo.setBackground(new java.awt.Color(252, 207, 132));
        proximo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proximo.setText("Próximo");
        proximo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });

        voltar.setBackground(new java.awt.Color(252, 207, 132));
        voltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(252, 207, 132));
        cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(797, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(escolhaMolho, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(escolhaMolho, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/titulo_molhos.png"))); // NOI18N

        sugo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_sugo.png"))); // NOI18N
        sugo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugoActionPerformed(evt);
            }
        });

        quatroQueijos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_quatro_queijos.png"))); // NOI18N
        quatroQueijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroQueijosActionPerformed(evt);
            }
        });

        bolognesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_bolognesa.png"))); // NOI18N
        bolognesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolognesaActionPerformed(evt);
            }
        });

        branco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_branco.png"))); // NOI18N
        branco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bolognesa, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(funghi, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sugo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quatroQueijos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(branco, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(348, 348, 348))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(quatroQueijos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(sugo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(funghi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(bolognesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(branco, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void escolhaMolhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaMolhoActionPerformed
        // TODO add your handling code here:
        ativar();
        escolhaMolho.setText("");
    }//GEN-LAST:event_escolhaMolhoActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        // TODO add your handling code here:
        novo.proximo(escolhaMolho.getText());
    }//GEN-LAST:event_proximoActionPerformed

    private void bolognesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolognesaActionPerformed
        desativar();
        escolhaMolho.setText("bolonhesa");
    }//GEN-LAST:event_bolognesaActionPerformed

    private void funghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funghiActionPerformed
        desativar();
        escolhaMolho.setText("funghi");
    }//GEN-LAST:event_funghiActionPerformed

    private void sugoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugoActionPerformed
        desativar();
        escolhaMolho.setText("sugo");
    }//GEN-LAST:event_sugoActionPerformed

    private void quatroQueijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroQueijosActionPerformed
        desativar();
        escolhaMolho.setText("4 queijos");
    }//GEN-LAST:event_quatroQueijosActionPerformed

    private void brancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brancoActionPerformed
        desativar();
        escolhaMolho.setText("branco");
    }//GEN-LAST:event_brancoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        novo.cancelar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        novo.voltar();
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMolhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMolhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMolhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMolhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaMolhos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bolognesa;
    private javax.swing.JButton branco;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton escolhaMolho;
    private javax.swing.JButton funghi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton proximo;
    private javax.swing.JButton quatroQueijos;
    private javax.swing.JButton sugo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
