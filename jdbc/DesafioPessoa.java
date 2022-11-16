package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua pesquisa: ");
        String letras = input.nextLine();

        Connection conexao = Conexoes.getConnection();
        Statement stmt = conexao.createStatement();

        String sql = "SELECT * FROM pessoas\n" +
                "WHERE nome LIKE '%"+letras+"%';";

        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");

            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p: pessoas) {
            System.out.printf("codigo: %d\n", p.getCodigo());
            System.out.printf("nome: %s\n\n", p.getNome());
        }

        input.close();
        stmt.close();
        conexao.close();
    }
}
