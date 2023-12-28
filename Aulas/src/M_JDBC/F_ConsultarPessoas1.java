package M_JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class F_ConsultarPessoas1 {

    public static void main(String[] args) throws SQLException {
        Connection conexao = C_FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas";
        Statement stmt = conexao.createStatement();

        ResultSet resultado = stmt.executeQuery(sql);

        List<F_Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new F_Pessoa(codigo,nome));
        }
        for(F_Pessoa p : pessoas){
            System.out.println(p.getCodigo() +" => "+p.getNome());
        }


        stmt.close();
        conexao.close();
    }

}


// %va termina com va;
// va% começa com va;