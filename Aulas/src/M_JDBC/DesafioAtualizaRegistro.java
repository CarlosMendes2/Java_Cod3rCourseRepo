package M_JDBC;

import java.sql.*;
import java.util.Scanner;

public class DesafioAtualizaRegistro {

    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        Connection conexao = C_FabricaConexao.getConexao();
        // mostra id e nomes
        // seleciona id
        // atualiza nome
        imprimeCodigoPessoa(conexao);
        updateNameByCode(conexao,scan);

    }

    private static void updateNameByCode(Connection cnx, Scanner scan) throws SQLException {
        String sql = "UPDATE pessoas SET nome = ? where codigo = ?";
        PreparedStatement pstmt = cnx.prepareStatement(sql);
        System.out.println("Codigo: ");
        pstmt.setInt(2,inputInt(scan));
        System.out.println("Novo nome:");
        pstmt.setString(1,inputString(scan));
        pstmt.executeUpdate();
        System.out.println("Lista atualizada");
        imprimeCodigoPessoa(cnx);
    }

    private static String inputString(Scanner scan) {
        if(scan.hasNext()){
            return scan.next();
        }scan.nextLine();
        return inputString(scan);
    }


    private static void imprimeCodigoPessoa(Connection cnx) throws SQLException {

        Statement stmt = cnx.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM pessoas");

        while (res.next()){
            int id = res.getInt("codigo");
            String name = res.getString("nome");
            System.out.println(id + " - " +name);
        }

    }
    private static int inputInt(Scanner scan) {
        if(scan.hasNextInt()){
            return scan.nextInt();
        }scan.nextLine();
        return inputInt(scan);
    }
}
