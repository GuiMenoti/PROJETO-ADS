/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONEXÃO;

import java.sql.*;

/**
 *
 * @author GuiMenoti
 */
public class ModuloConexao {

    //método responsavel por estabelecer a conexão com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //a linha abaixo "chama" o driver importado na biblioteca
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações referente ao banco 
        String url = "jdbc:mysql://localhost:3307/dbnatural";
        String user = "root";
        String password = "";
        //Estabelecendo a conexão com o banco 
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }

    }
}
