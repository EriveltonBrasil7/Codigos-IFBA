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

    public List<Funcionario> getAllFuncionarios(String ordem) {
        String sql = "SELECT * "
                + "FROM funcionario f LEFT JOIN cargo c ON f.cargo_id = c.cargo_id "
                + "ORDER BY f." + ordem;
        System.out.println(sql);
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
                    cargo.setNome(ConexaoMySql.resultset.getString("cargo_nome"));
                    cargo.setDescricao(ConexaoMySql.resultset.getString("cargo_descricao"));
                    cargo.setRemuneracao(ConexaoMySql.resultset.getFloat("cargo_remuneracao"));
                    funcionario.setCargo(cargo);
                }

                listaDeFuncionarios.add(funcionario); //adiciona o objeto cargo na lista
            }

        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, "Erro ao percorrer o resultset");
        }

        return listaDeFuncionarios;
    }

    public List<Funcionario> getFiltrarFuncionarios(String coluna, String valor, String ordem) {
        String sql = "SELECT * "
                + "FROM funcionario f LEFT JOIN cargo c ON f.cargo_id = c.cargo_id "
                + "WHERE " + coluna + " LIKE '%" + valor + "%' "
                + "ORDER BY f." + ordem;
        ConexaoMySql.selecionar(sql);
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        try {
            while (ConexaoMySql.resultset.next()) {
                Cargo cargo = new Cargo();
                cargo.setId(ConexaoMySql.resultset.getInt("cargo_id"));
                cargo.setNome(ConexaoMySql.resultset.getString("cargo_nome"));
                cargo.setDescricao(ConexaoMySql.resultset.getString("cargo_descricao"));
                cargo.setRemuneracao(ConexaoMySql.resultset.getFloat("cargo_remuneracao"));

                Funcionario funcionario = new Funcionario();
                funcionario.setId(ConexaoMySql.resultset.getInt("func_id"));
                funcionario.setNome(ConexaoMySql.resultset.getString("func_nome"));
                funcionario.setCpf(ConexaoMySql.resultset.getString("func_cpf"));
                funcionario.setSexo(ConexaoMySql.resultset.getString("func_sexo"));
                funcionario.setCargo(cargo);

                listaDeFuncionarios.add(funcionario); //adiciona o objeto cargo na listaÏ
            }

        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, "Erro ao percorrer o resultset");
        }

        return listaDeFuncionarios;
    }

    public boolean insertFuncionario(Funcionario fun) {
        String codigoCargo = fun.getCargo() == null ? "null" : "" + fun.getCargo().getId();

        String sql = "INSERT INTO funcionario (func_nome, func_sexo, func_cpf, cargo_id) "
                + "VALUES ('" + fun.getNome() + "', '" + fun.getSexo() + "', '" + fun.getCpf() + "', " + codigoCargo + ")";
        return ConexaoMySql.atualizar(sql);
    }

    public boolean deletarFuncionario(int codigo) {
        String sql = "DELETE FROM funcionario WHERE func_id =" + codigo;
        return ConexaoMySql.atualizar(sql);
    }

    public boolean atualizarFuncionario(Funcionario fun) {
        String codigoCargo = fun.getCargo() == null ? "null" : ""+fun.getCargo().getId();

        String sql = "UPDATE funcionario SET func_nome='" + fun.getNome() + "', "
                + "func_sexo='" + fun.getSexo() + "', func_cpf='" + fun.getCpf() + "', cargo_id=" + codigoCargo
                + " WHERE func_id=" + fun.getId();
        System.out.println(sql);
        return ConexaoMySql.atualizar(sql);
    }

}
