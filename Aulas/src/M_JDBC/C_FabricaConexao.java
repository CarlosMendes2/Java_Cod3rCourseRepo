package M_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C_FabricaConexao {

    public static Connection getConexao(){
        try{
            String url = "jdbc:mysql://localhost/curso_javacod3r";
            String usuario = "root";
            String senha = "12345678";
            return DriverManager.getConnection(url,usuario,senha);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
