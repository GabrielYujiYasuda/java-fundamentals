package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost/learningjava";
        final String user = "root";
        final String password = "123123";

        Connection conexao = DriverManager.getConnection(url, user,
                password);

        System.out.println("Success connection!");
        conexao.close();
    }
}
