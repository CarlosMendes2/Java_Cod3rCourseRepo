package M_JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class D_CriarTabelaPessoas {

    public static void main(String[] args) throws SQLException {

        Connection conexao = C_FabricaConexao.getConexao();
        String sql = "CREATE TABLE IF NOT EXISTS pessoas(" +
                "codigo INT AUTO_INCREMENT PRIMARY KEY," +
                "nome VARCHAR(80) NOT NULL" +
                ")";
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso!");
        conexao.close();

    }

}
// CREATE READ UPDATE DELETE