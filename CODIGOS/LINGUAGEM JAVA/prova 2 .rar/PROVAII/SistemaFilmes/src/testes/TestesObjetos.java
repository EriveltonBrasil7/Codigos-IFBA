package testes;

import java.util.ArrayList;
import model.Cargo;
import model.Cliente;
import model.Endereco;
import model.Filme;
import model.Funcionario;
import model.Locacao;
import model.Midia;
import model.Tipo;
import model.Usuario;

public class TestesObjetos {

    public static void main(String[] args) {

        Endereco endereco1 = new Endereco();
        endereco1.setId(1);
        endereco1.setRua("Adolfo Santos");
        endereco1.setNumero("191");
        endereco1.setBairro("Campo Grande");
        endereco1.setCidade("Delmiro Gouveia");
        endereco1.setEstado("Alagoas");
        endereco1.setCep("57840-000");

        Endereco endereco2 = new Endereco();
        endereco2.setId(2);
        endereco2.setRua("Castelo Branco");
        endereco2.setNumero("21");
        endereco2.setBairro("Centro");
        endereco2.setCidade("Paulo Afonso");
        endereco2.setEstado("Bahia");
        endereco2.setCep("14780-000");

        Cliente cliente1 = new Cliente();
        cliente1.setEnderResidencial(endereco1);
        cliente1.setId(1);
        cliente1.setNome("Ana");
        cliente1.setSexo("F");
        cliente1.setCpf("123.647.879.07");
        cliente1.setRg("255498-65");
        cliente1.setPontosFidelidade(25);
        cliente1.setAdimplente(true);

        Cargo cargo1 = new Cargo();
        cargo1.setId(1);
        cargo1.setNome("Recepcionista");
        cargo1.setAtribuicoes("Experiente na recepção.");

        Usuario usuario1 = new Usuario();
        usuario1.setId(1);
        usuario1.setLogin("201720040009");
        usuario1.setSenha("***************");
        usuario1.setPerfil("Amador");

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setEnderResidencial(endereco2);
        funcionario1.setId(1);
        funcionario1.setNome("Erivelton");
        funcionario1.setSexo("M");
        funcionario1.setCpf("123.794.344.04");
        funcionario1.setRg("248487-65");
        funcionario1.setSalario(954);
        funcionario1.setNumeroCtps("8041848048");
        funcionario1.setCargo(cargo1);
        funcionario1.setUsuario(usuario1);

        Filme filme1 = new Filme();
        filme1.setId(1);
        filme1.setTitulo("Deus não estar morto");
        filme1.setSinopse("Filme baseado em uma historia real");
        filme1.setGenero("Drama");
        filme1.setValor(15.6);

        Tipo tipo1 = new Tipo();
        tipo1.setId(1);
        tipo1.setNome("filme");
        tipo1.setValorAcrescimento(15);

//        Midia midias1 = new Midia();
//        midias1.setId(1);
//        midias1.setCodBarra("54 0049494094 09");
//        midias1.setStatus("Nova");
//        midias1.setFilme(filme1);
//        midias1.setTipo(tipo1);
        ArrayList<Midia> midias1 = new ArrayList<>();

        Midia midia1 = new Midia();
        midia1.id = 1;
        midia1.codBarra = "000.000.000-00";
        midia1.status = "nova";
        midias1.add(midia1);

        Locacao locacao1 = new Locacao();
        locacao1.setId(1);
        locacao1.setStatus("Disponível");
        locacao1.setValorTotal(10.5);
        locacao1.setFormaPagamento("Dinheiro");
        locacao1.setEnderEntrega(endereco1);
        locacao1.setCliente(cliente1);
        locacao1.setFuncionario(funcionario1);
        locacao1.setMidias(midias1);

        System.out.println("------------------DADOS DA LOCAÇÃO-----------------");
        System.out.println("Código: " + locacao1.getId());
        System.out.println("Status: " + locacao1.getStatus());
        System.out.println("Valor total: " + locacao1.getValorTotal());
        System.out.println("Forma de Pagamento: " + locacao1.getFormaPagamento());
        System.out.println("Nome do Funcionário: " + locacao1.getFuncionario().getNome());
        System.out.println("---Dados do Cliente---");
        System.out.println("Nome: " + locacao1.getCliente().getNome());
        System.out.println("CPF: " + locacao1.getCliente().getCpf());
        System.out.println("Rua: " + locacao1.getCliente().getEnderResidencial().getRua());
        System.out.println("Número: " + locacao1.getCliente().getEnderResidencial().getNumero());
        System.out.println("Bairro: " + locacao1.getCliente().getEnderResidencial().getBairro());
        System.out.println("Cidade: " + locacao1.getCliente().getEnderResidencial().getCidade());
        System.out.println("Estado: " + locacao1.getCliente().getEnderResidencial().getEstado());
        System.out.println("CEP: " + locacao1.getCliente().getEnderResidencial().getCep());
        System.out.println("---Dados do Filme---");
         
        for(Midia midia : locacao1.getMidias()){
            System.out.println("\nFILME:"+midia.getFilme().getTitulo());
            midias1.get(0);
        }

    }

}
