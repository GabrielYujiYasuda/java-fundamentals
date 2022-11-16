package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {

        Connection conexao = Conexoes.getConnection();

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = input.nextLine();

        String sql = "INSERT INTO pessoas (nome)" +
                "VALUES (?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);

        stmt.execute();

        System.out.println("Pessoa incluida com sucesso!!!");
        input.close();

    }
}
