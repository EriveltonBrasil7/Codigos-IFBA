package testes;

import controller.ConexaoMySql;

/**
 *
 * @author eliomar.campos
 */
public class DeleteEndereco {
    public static void main(String[] args) {
        ConexaoMySql.createConnection();
        
        String sql = "DELETE FROM endereco WHERE ender_id='2';";
        ConexaoMySql.atualizar(sql);
    }
}
