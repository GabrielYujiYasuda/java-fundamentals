package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
//
//        final String url = "jdbc:mysql://localhost";
//        final String user = "root";
//        final String password = "123123";
//
//        Connection conexao = DriverManager.getConnection(url, user,
//                password);

        Connection conexao = Conexoes.getConnection();

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS learningJava");

        System.out.println("Banco criado com sucesso!");

        conexao.close();
    }
}
