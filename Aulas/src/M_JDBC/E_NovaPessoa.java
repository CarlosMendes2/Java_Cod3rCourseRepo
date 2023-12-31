package M_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class E_NovaPessoa {

    public static void main(String[] args) throws SQLException {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scan.next();

        Connection conexao = C_FabricaConexao.getConexao();

        String sql = "INSERT INTO pessoas (nome) VALUES(?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1,nome);

        stmt.execute();

        System.out.println("Pessoa incluida!");
        scan.close();
    }

}
/* O que havia sido ensinado anteriormente era concatenando strings, mas isso abre margem
* para SQLInjection, logo foi criado o PreparedStatement para utilizar a lógica que usamos nos métodos
* de parametros, assim evitamos ataques de SQLInjection.
 */