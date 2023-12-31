package M_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class G_ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner scan  = new Scanner(System.in);
        System.out.println("Informe o código: ");
        int codigo = scan.nextInt();

        Connection conexao = C_FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas Where codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1,codigo);

        if(stmt.executeUpdate() > 0){
            System.out.println("Pessoa excluída com sucesso!");
        }else{
            System.out.println("Nada feito!");
        }

        conexao.close();
        scan.close();
    }

}
