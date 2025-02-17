package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cargo;
import model.Funcionario;

/**
 *
 * @author eliomar.campos
 */
public class DAOFuncionario {

    public DAOFuncionario() {
        if (ConexaoMySql.getConnection() == null) {
            ConexaoMySql.createConnection(); //Abrir uma conexão e preencher a variável conexao
        }
    }

    public List<Funcionario> getAllFuncionarios(String ordenacao) {
        String sql = "SELECT * FROM funcionario f LEFT JOIN cargo c ON f.cargo_id = c.cargo_id ORDER BY " + ordenacao;
        ConexaoMySql.selecionar(sql);
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        try {
            while (ConexaoMySql.resultset.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(ConexaoMySql.resultset.getInt("funci_id"));
                funcionario.setNome(ConexaoMySql.resultset.getString("funci_nome"));
                funcionario.setCpf(ConexaoMySql.resultset.getString("funci_cpf"));
                funcionario.setSexo(ConexaoMySql.resultset.getString("funci_sexo"));

                if (ConexaoMySql.resultset.getString("cargo_id") == null) {
                    funcionario.setCargo(null);
                } else {
                    Cargo cargo = new Cargo();
                    cargo.setId(ConexaoMySql.resultset.getInt("cargo_id"));
                    cargo.setDescricao(ConexaoMySql.resultset.getString("cargo_descricao"));
                    cargo.setNome(ConexaoMySql.resultset.getString("cargo_nome"));
                    cargo.setRemuneracao(ConexaoMySql.resultset.getDouble("cargo_remuneracao"));

                    funcionario.setCargo(cargo);
                }

                listaDeFuncionarios.add(funcionario); //adiciona o objeto cargo na lista
            }

        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, "Erro ao percorrer o resultset");
        }

        return listaDeFuncionarios;
    }

    public List<Funcionario> getFiltrarFuncionarios(String coluna, String valor, String ordenacao) {
        String sql = "SELECT * "
                + "FROM funcionario WHERE " + coluna + " LIKE '%" + valor + "%' "
                + "ORDER BY " + ordenacao;
        ConexaoMySql.selecionar(sql);
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        try {
            while (ConexaoMySql.resultset.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(ConexaoMySql.resultset.getInt("funci_id"));
                funcionario.setNome(ConexaoMySql.resultset.getString("funci_nome"));
                funcionario.setCpf(ConexaoMySql.resultset.getString("funci_cpf"));
                funcionario.setSexo(ConexaoMySql.resultset.getString("funci_sexo"));

                listaDeFuncionarios.add(funcionario); //adiciona o objeto cargo na listaÏ
            }

        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, "Erro ao percorrer o resultset");
        }

        return listaDeFuncionarios;
    }

    public boolean insertFuncionario(Funcionario fun) {
        String codigoCargo = fun.getCargo() == null ? "null" : "" + fun.getCargo().getId();

        String sql = "INSERT INTO funcionario (funci_nome, funci_sexo, funci_cpf, cargo_id) "
                + "VALUES ('" + fun.getNome() + "', '" + fun.getSexo() + "', '" + fun.getCpf() + "', "+codigoCargo+")";
        return ConexaoMySql.atualizar(sql);
    }

    public boolean deletarFuncionario(int codigo) {
        String sql = "DELETE FROM funcionario WHERE funci_id =" + codigo;
        return ConexaoMySql.atualizar(sql);
    }

    public boolean atualizarFuncionario(Funcionario fun) {
        String codigoCargo = fun.getCargo() == null ? "null" : "" + fun.getCargo().getId();
        
        String sql = "UPDATE funcionario SET funci_nome='" + fun.getNome() + "', "
                + "funci_sexo='" + fun.getSexo() + "', funci_cpf='" + fun.getCpf() + "', cargo_id="+codigoCargo
                + " WHERE funci_id=" + fun.getId();
        return ConexaoMySql.atualizar(sql);
    }

}
