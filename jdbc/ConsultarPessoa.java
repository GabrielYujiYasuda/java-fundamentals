package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoa {
    public static void main(String[] args) throws SQLException {

        Connection conexao = Conexoes.getConnection();

        String sql = "SELECT * FROM PESSOAS";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");

            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p: pessoas){
            System.out.printf("codigo: %d\n",p.getCodigo());
            System.out.printf("nome: %s\n\n", p.getNome());
        }

        conexao.close();
    }
}
