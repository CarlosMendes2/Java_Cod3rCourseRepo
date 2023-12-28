package M_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A_TesteConexao {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306"; // 3306 é a padrão, ñ precisava.
        String usuario = "root";
        String senha = "12345678";
        //?useSSL=false para nao necessitar uma conexao segura
        //?verifyServerCertificate=false&useSSL=true
        Connection conexao = DriverManager.getConnection(url,usuario,senha);

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }
}
    