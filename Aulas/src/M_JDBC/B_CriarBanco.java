package M_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class B_CriarBanco {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306"; // 3306 é a padrão, ñ precisava.
        String usuario = "root";
        String senha = "12345678";
        Connection conexao = DriverManager.getConnection(url,usuario,senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_javaCod3r"); // comando que vai ser executado no banco de dados
        conexao.close();

    }
}
