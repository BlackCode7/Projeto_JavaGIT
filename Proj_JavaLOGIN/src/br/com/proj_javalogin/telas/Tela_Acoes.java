/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proj_javalogin.telas;

/**
 *
 * @author Usuario
 */
public class Tela_Acoes extends javax.swing.JFrame {

    /**
     * Creates new form tela_acoes
     */
    public void telaClientes(){
        //AQUI CLIENTES - chamando tela cadastro de clientes aqui
        Cadastro_Clientes clientes = new Cadastro_Clientes();
        clientes.setVisible(true);
        //this.dispose();
    }
    
    
    
    
    public Tela_Acoes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTcadastroFuncionario = new javax.swing.JButton();
        BTcadastroCliente = new javax.swing.JButton();
        BTestoqueProduto = new javax.swing.JButton();
        BTcadastroFornecedor = new javax.swing.JButton();
        BTgasto = new javax.swing.JButton();
        BTlucro = new javax.swing.JButton();
        BTconsulta = new javax.swing.JButton();
        Btrevisao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Ações Veterinária Bandeirantes");
        setResizable(false);

        BTcadastroFuncionario.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BTcadastroFuncionario.setText("Cadastro de Funcionários");
        BTcadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcadastroFuncionarioActionPerformed(evt);
            }
        });

        BTcadastroCliente.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BTcadastroCliente.setText("Cadastrar Clientes");
        BTcadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcadastroClienteActionPerformed(evt);
            }
        });

        BTestoqueProduto.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BTestoqueProduto.setText("Estoque de Produtos");
        BTestoqueProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTestoqueProdutoActionPerformed(evt);
            }
        });

        BTcadastroFornecedor.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BTcadastroFornecedor.setText("Cadastro de Fornecedores");
        BTcadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcadastroFornecedorActionPerformed(evt);
            }
        });

        BTgasto.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BTgasto.setText("Gastos");
        BTgasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTgastoActionPerformed(evt);
            }
        });

        BTlucro.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BTlucro.setText("Lucros");
        BTlucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTlucroActionPerformed(evt);
            }
        });

        BTconsulta.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BTconsulta.setText("Consultas");

        Btrevisao.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        Btrevisao.setText("Revisões");
        Btrevisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtrevisaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTcadastroCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(BTconsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btrevisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTgasto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTcadastroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTestoqueProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTcadastroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(BTlucro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTcadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTcadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTestoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btrevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTcadastroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTlucro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTgasto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(460, 355));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTcadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcadastroFornecedorActionPerformed
        // TODO add your handling code here:
        
        
        //AQUI
        
        
        
    }//GEN-LAST:event_BTcadastroFornecedorActionPerformed

    private void BTcadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcadastroClienteActionPerformed
        //AQUI CLIENTES - chamando tela cadastro de clientes aqui
        telaClientes();
               
    }//GEN-LAST:event_BTcadastroClienteActionPerformed

    private void BTcadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcadastroFuncionarioActionPerformed
        // TODO add your handling code here:
        
        
        // AQUI FUNCIONARIOS
        
        
    }//GEN-LAST:event_BTcadastroFuncionarioActionPerformed

    private void BTestoqueProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTestoqueProdutoActionPerformed
        // TODO add your handling code here:
        
        
        // ESTOQUE PRODUTOS
        
        
    }//GEN-LAST:event_BTestoqueProdutoActionPerformed

    private void BTgastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTgastoActionPerformed
        // TODO add your handling code here:
        
        
        //GASTOS
        
        
    }//GEN-LAST:event_BTgastoActionPerformed

    private void BTlucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTlucroActionPerformed
        // TODO add your handling code here:
        
        
        //LUCROS
        
        
    }//GEN-LAST:event_BTlucroActionPerformed

    private void BtrevisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtrevisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtrevisaoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Acoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Acoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Acoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Acoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Acoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTcadastroCliente;
    private javax.swing.JButton BTcadastroFornecedor;
    private javax.swing.JButton BTcadastroFuncionario;
    private javax.swing.JButton BTconsulta;
    private javax.swing.JButton BTestoqueProduto;
    private javax.swing.JButton BTgasto;
    private javax.swing.JButton BTlucro;
    private javax.swing.JButton Btrevisao;
    // End of variables declaration//GEN-END:variables
}
