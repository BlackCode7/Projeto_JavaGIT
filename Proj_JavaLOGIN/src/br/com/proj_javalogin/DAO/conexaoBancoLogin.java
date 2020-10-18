/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proj_javalogin.DAO;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class conexaoBancoLogin {

    // metodo faz conexão
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // chamando o driver do banco na biblioteca
        String driver = "com.mysql.jdbc.Driver";
        // armazenar informação do banco
        // Quando for colocar este banco em um servidor, só é preciso mudar o localhost pelo nome 
        // do banco onde eu hospedei e o nome também precisa se modificado
        String url = "jdbc:mysql://localhost:3306/veterinariadb";
        String user = "root";
        String password = "";
        
        // fazendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }

}
