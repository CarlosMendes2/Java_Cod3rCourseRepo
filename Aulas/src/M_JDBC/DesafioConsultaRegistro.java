package M_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioConsultaRegistro {

    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        consulta(scan);
        scan.close();
    }

    private static void consulta(Scanner scan) throws SQLException {
        System.out.println("Pesquisar/Sair");
        while (!digitar(scan).equalsIgnoreCase("sair")){
            System.out.println("Pesquisar nomes com: ");
            ResultSet result = consultaAnyLetra(scan);
            imprimeResultado(result);
            System.out.println("Digite 'sair' para sair da busca ou continue sua pesquisa");
        }
        System.out.println("Pesquisa finalizada!");
    }

    private static void imprimeResultado(ResultSet res) throws SQLException {

        List<F_Pessoa> pessoas = new ArrayList<>();

        while (res.next()){
            int codigo = res.getInt("codigo");
            String nome = res.getString("nome");
            pessoas.add(new F_Pessoa(codigo,nome));
        }
        for(F_Pessoa p : pessoas){
            System.out.println(p.getCodigo() +" => "+p.getNome());
        }
    }

    private static String digitar(Scanner scan) {
        return scan.nextLine();
    }
    private static ResultSet consultaAnyLetra(Scanner scn) throws SQLException {
        Connection conexao = C_FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas where nome like ? ";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,"%"+digitar(scn)+"%");
        return stmt.executeQuery();
    }

}
