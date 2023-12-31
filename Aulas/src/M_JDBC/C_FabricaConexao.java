package M_JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class C_FabricaConexao {

    public static Connection getConexao(){
        try{
            Properties prop = getProperties();
            String url = prop.getProperty("banco.url");
            String usuario = prop.getProperty("banco.user");
            String senha = prop.getProperty("banco.password");
            return DriverManager.getConnection(url,usuario,senha);
        }catch (SQLException | IOException e){
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String path = "/conexao.properties";
        prop.load(C_FabricaConexao.class.getResourceAsStream(path));
        return prop;
    }

}
