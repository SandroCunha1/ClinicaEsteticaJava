/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MenuController;
import java.awt.ComponentOrientation;

/**
 *
 * @author aluno
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuController controller;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.controller = new MenuController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        cadastroCliente = new javax.swing.JMenuItem();
        cadastroFornecedor = new javax.swing.JMenuItem();
        cadastroFuncionario = new javax.swing.JMenuItem();
        menuProcedimento = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        menuDeslogar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("    FINESSE Clínica Estética - Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/derek-finch-bD1bK7IUvd8-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -270, 630, 820));

        jMenuBar1.setRequestFocusEnabled(false);

        menuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/cadastro.png"))); // NOI18N
        menuCadastro.setText("Cadastro");

        cadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/cadastro_resized.png"))); // NOI18N
        cadastroCliente.setText("Cadastro do cliente");
        cadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastroCliente);

        cadastroFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/cadastro (1)_resized.png"))); // NOI18N
        cadastroFornecedor.setText("Cadastro de fornecedor");
        menuCadastro.add(cadastroFornecedor);

        cadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/carteira-de-identidade_resized.png"))); // NOI18N
        cadastroFuncionario.setText("Cadastro de funcionarios");
        cadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastroFuncionario);

        jMenuBar1.add(menuCadastro);

        menuProcedimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/beleza.png"))); // NOI18N
        menuProcedimento.setText("Procedimentos");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/botox_resized.png"))); // NOI18N
        jMenuItem4.setText("Armonização ");
        menuProcedimento.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/massagem-facial_resized.png"))); // NOI18N
        jMenuItem5.setText("Massagem");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuProcedimento.add(jMenuItem5);

        jMenuBar1.add(menuProcedimento);

        menuAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/agenda-32.png"))); // NOI18N
        menuAgenda.setText("Agenda");
        menuAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAgendaMouseClicked(evt);
            }
        });
        menuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendaActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuAgenda);

        menuDeslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/sair (1).png"))); // NOI18N
        menuDeslogar.setText("Deslogar");
        menuDeslogar.setAutoscrolls(true);
        menuDeslogar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuDeslogar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuDeslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDeslogarMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuDeslogar);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroClienteActionPerformed

    private void cadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroFuncionarioActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAgendaActionPerformed

    private void menuAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAgendaMouseClicked
        // TODO add your handling code here:
        this.controller.abrirParaAgenda();
    }//GEN-LAST:event_menuAgendaMouseClicked

    private void menuDeslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDeslogarMouseClicked
        // TODO add your handling code here:
        this.controller.voltarParaLogin();
    }//GEN-LAST:event_menuDeslogarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroCliente;
    private javax.swing.JMenuItem cadastroFornecedor;
    private javax.swing.JMenuItem cadastroFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuDeslogar;
    private javax.swing.JMenu menuProcedimento;
    // End of variables declaration//GEN-END:variables
}
