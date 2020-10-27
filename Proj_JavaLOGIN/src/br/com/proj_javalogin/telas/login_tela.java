/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proj_javalogin.telas;

import java.sql.*;
import br.com.proj_javalogin.DAO.conexaoBancoLogin;
import java.awt.Color;
import javax.swing.JOptionPane;

public class login_tela extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

// Aqui estou criando o metodo logar, usando a tela de login e pesquisando dentro do banco de dados
    public void logar() {
        String sql = "select * from T_usuarios where usuario1=? and password1=?";
        try {
            //capturar o que esta sendo digitado na tela login, o '?' é substituido pelo
            // que foi digitado na caixa de login
            pst = conexao.prepareStatement(sql);
            pst.setString(1, CampoUsuario.getText());
            pst.setString(2, CampoPassword.getText());

            // executa a query no banco de dados
            rs = pst.executeQuery();

            // fazendo a execução com estruturas de condicionais
            // se existir um usuario e senha conrrespondente
            if (rs.next()) {
                // A linha abaixo verifica o campo perfil no banco de dados t_usuarioa
                String perfil = rs.getString(4);
                //System.out.println(perfil);
                //Criando uma estrutura de verifique qual o tipo de usuário esta logando na aplicação
                if (perfil.equals("admin")){
                    // chamando aqui a tela Tela_Acoes
                    Tela_Principal tela_principal = new Tela_Principal();
                    tela_principal.setVisible(true);
                    // estas 2 linhas liberam todos os recursos da aplicação para os usuários com perfil admin
                    // Aqui libera o relatório1
                    Tela_Principal.MenRelLucros.setEnabled(true);
                    //Aqui libera os usuários
                    Tela_Principal.MenuUsuario.setEnabled(true);
                    // esta linha pega no banco de dados o nome do usario que esta logado
                    Tela_Principal.VarUsuarioEsq.setText(rs.getString(2));
                    // Destacando o usuário admin com a cor vermelha
                    Tela_Principal.VarUsuarioEsq.setForeground(Color.red);
                    this.dispose();
                                        
                } else {
                    // Neste trecho de código se o usuário não tiver o perfil admin, ele é um usuário comum
                    Tela_Principal tela_principal = new Tela_Principal();
                    tela_principal.setVisible(true);
                    // Aqui nesta linha exibe o nome do usuário que esta logado na esquerda da tela principal
                    Tela_Principal.VarUsuarioEsq.setText(rs.getString(2));
                    this.dispose();
                }
                
                
                //Tela_Acoes tela_acoes = new Tela_Acoes();
                //tela_acoes.setVisible(true);
                //Este comando tela a tela de login, quando clicado
                //this.dispose();
                                 

            } else {
                JOptionPane.showMessageDialog(null, "usuário ou senha inválida(s)");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Creates new form login_tela
     */
    public login_tela() {
        initComponents();

        conexao = conexaoBancoLogin.conector();

// Condicional para modificação do valor da label lblStatus criada na tela de login        
        if (conexao != null) {
            lblStatus.setText("Conectado com Sucesso ao banco de Dados!");
        } else {
            lblStatus.setText("Falha na Conexão com o Banco de Dados!");
        }

        //System.out.println(conexao);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoPassword = new javax.swing.JPasswordField();
        BotaoEntrar = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login Veterinária Bandeirantes");
        setResizable(false);

        jLabel2.setText("Usuário");

        jLabel3.setText("Password");

        BotaoEntrar.setText("Entrar no Sistema");
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });

        lblStatus.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BotaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoPassword)
                            .addComponent(CampoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addGap(159, 159, 159))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(BotaoEntrar)
                .addGap(18, 18, 18)
                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        setSize(new java.awt.Dimension(607, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed
        // CHAMANDO AQUI o método logar()
        logar();
    }//GEN-LAST:event_BotaoEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(login_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JPasswordField CampoPassword;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
