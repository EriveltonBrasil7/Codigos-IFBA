package testes;

import controller.ConexaoMySql;
import java.sql.SQLException;

public class CadastroLocalJDBC {

    public static void main(String[] args) {
        ConexaoMySql.createConnection();
        ConexaoMySql.selecionar("SELECT * FROM local");

        try {

            while (ConexaoMySql.resultset.next()) {
                System.out.println("Código: " + ConexaoMySql.resultset.getInt("id_Local"));
                System.out.println("Nome: " + ConexaoMySql.resultset.getString("nome_Local"));
                System.out.println("Taxa Embarque: " + ConexaoMySql.resultset.getString("taxaEmbar_Local"));
            }

        } catch (SQLException ex) {
            System.out.println("Algo de errado não está certo");
            System.out.println("Talvez não exista essa linha no resultset");
        }

        String nome = "Rodoviaria";
        float taxaEmbarque = 55.5f;

        //String sqlInsert = 
        //ConexaoMySql.atualizar(sqlInsert);
        
        
        //NÃO PRECISA DESSA CLASSE, POIS O CONSOLE JA TEM A FUNÇÃO!!!!!!!!
    }
    
}
