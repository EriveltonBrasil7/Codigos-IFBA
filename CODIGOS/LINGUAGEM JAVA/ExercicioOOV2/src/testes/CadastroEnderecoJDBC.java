package testes;

import controller.ConexaoMySql;
import java.sql.SQLException;

public class CadastroEnderecoJDBC {

    public static void main(String[] args) {
        ConexaoMySql.createConnection();
        ConexaoMySql.selecionar("SELECT * FROM endereco");

        try {

            while (ConexaoMySql.resultset.next()) {
                System.out.println("Código: " + ConexaoMySql.resultset.getInt("ender_id"));
                System.out.println("Rua: " + ConexaoMySql.resultset.getString("ender_rua"));
                System.out.println("Número: " + ConexaoMySql.resultset.getString("ender_numero"));
            }

        } catch (SQLException ex) {
            System.out.println("Algo de errado não está certo");
            System.out.println("Talvez não exista essa linha no resultset");
        }
        
        String rua = "São francisco";
        String bairro = "Centro";
        String numero = "45";
        
        String sqlInsert = "INSERT INTO endereco (ender_rua, ender_numero, ender_bairro) VALUES ('"+rua+"', '"+numero+"', '"+bairro+"')";
        ConexaoMySql.atualizar(sqlInsert);
        
        
    }
}
