package testes;

import model.Endereco;
import model.Funcionario;
import model.Local;
import model.Onibus;
import model.Passageiros;
import model.Passagem;
import model.Pessoa;
import model.Poltrona;

public class TesteObjetos {

    public static void main(String[] args) {
        //Só Falta isso!!! 
        //TESTANDO OS OBJETOS

        Endereco end = new Endereco();
        end.setId(1);
        end.setRua("Adolfo Santos");
        end.setNumero(191);
        end.setBairro("Campo Grande");
        end.setCidade("Delmiro Gouveia");
        end.setEstado("AL");

        Endereco end1 = new Endereco();
        end1.setId(2);
        end1.setRua(" Santos");
        end1.setNumero(19);
        end1.setBairro("Campo ");
        end1.setCidade("Delmiro ");
        end1.setEstado("PE");

        Funcionario fun = new Funcionario();
        fun.setId(1);
        fun.setNome("Ana");
        fun.setCpf("15104088790");
        fun.setRg("540848");
        fun.setSexo("F");
        fun.setEmail("ana@gmail.com");
        fun.setCelular("8795-6214");
        fun.setFuncao("Recepcionista");
        fun.setSalario(950);
        fun.setEndereco(end);

        Local loc = new Local();
        loc.setId(1);
        loc.setNome("Delmiro");
        loc.setTaxaEmbarque(5.60);

        Local loc1 = new Local();
        loc1.setId(2);
        loc1.setNome("Paulo Afonso");
        loc1.setTaxaEmbarque(125);

        Onibus oni = new Onibus();
        oni.setId(1);
        oni.setPlaca("aaa25");
        oni.setTipo("Exclusiva");

        Passageiros passag = new Passageiros();
        passag.setId(1);
        passag.setEndereco(end1);
        passag.setNome("Erivelton");
        passag.setCpf("8084044448790");
        passag.setRg("1000000");
        passag.setSexo("M");
        passag.setEmail("erivelotn@gmail.com");
        passag.setCelularParente1("9879-5065");
        passag.setCelularParente2("5487-6054");
        passag.setNeceEspecial(false);
        passag.setTipoNeceEspecial("Não tem necessidade especial!");

        Poltrona polt = new Poltrona();
        polt.setId(1);
        polt.setDisponivel(true);
        polt.setNumero("45-46");
        polt.setTipo("Janela");
        polt.setOnibus(oni);

        Passagem passagem = new Passagem();
        passagem.setId(1);
        passagem.setDesconto(50.6);
        passagem.setDataEmbarque(25 - 05 - 60);
        passagem.setValorTotal(1200.6);
        passagem.setPassageiro(passag);
        passagem.setFuncionario(fun);
        passagem.setPoltrona(polt);
        passagem.setLocal(loc);
        passagem.setOrigem(loc1);
        passagem.setDestino(loc);
        passagem.setOnibus(oni);

        System.out.println("---------------RECIBO DE PASSAGEM---------------");

//        System.out.println("DADOS PASSAGEIRO");
//        System.out.println("Código: " + passagem.getPassageiro().getId());
//        System.out.println("Nome: " + passagem.getPassageiro().getNome());
//        System.out.println("CPF: " + passagem.getPassageiro().getCpf());
//        System.out.println("RG: " + passagem.getPassageiro().getRg());
//        System.out.println("Sexo: " + passagem.getPassageiro().getSexo());
//        System.out.println("Email: " + passagem.getPassageiro().getEmail());
//        System.out.println("Celular: " + passagem.getPassageiro().getCelular());
//        System.out.println("Cidade: " + passagem.getPassageiro().getEndereco().getCidade());
//        System.out.println("Bairro: " + passagem.getPassageiro().getEndereco().getBairro());
//        System.out.println("Rua: " + passagem.getPassageiro().getEndereco().getRua());
//        System.out.println("Número da Casa: " + passagem.getPassageiro().getEndereco().getNumero());
//        System.out.println("Estado: " + passagem.getPassageiro().getEndereco().getEstado());
//        System.out.println("Celular parente1: " + passagem.getPassageiro().getCelularParente1());
//        System.out.println("Celular parente2: " + passagem.getPassageiro().getCelularParente2());
//        System.out.println("Tem necessidade Especial? " + passagem.getPassageiro().getNeceEspecial());
//        System.out.println("Tipo de necessidade: " + passagem.getPassageiro().getTipoNeceEspecial());
//        System.out.println("---------------------------------------------");
//
//        System.out.println("DADOS FUNCIONÁRIO");
//        System.out.println("Código: " + passagem.getFuncionario().getId());
//        System.out.println("Nome: " + passagem.getFuncionario().getNome());
//        System.out.println("CPF: " + passagem.getFuncionario().getCpf());
//        System.out.println("RG: " + passagem.getFuncionario().getRg());
//        System.out.println("Sexo: " + passagem.getFuncionario().getSexo());
//        System.out.println("Email: " + passagem.getFuncionario().getEmail());
//        System.out.println("Celular: " + passagem.getFuncionario().getCelular());
//        System.out.println("Cidade: " + passagem.getFuncionario().getEndereco().getCidade());
//        System.out.println("Bairro: " + passagem.getFuncionario().getEndereco().getBairro());
//        System.out.println("Rua: " + passagem.getFuncionario().getEndereco().getRua());
//        System.out.println("Número da Casa: " + passagem.getFuncionario().getEndereco().getNumero());
//        System.out.println("Estado: " + passagem.getFuncionario().getEndereco().getEstado());
//        System.out.println("Data de Admissão: " + passagem.getFuncionario().getDataAdmissao());
//        System.out.println("Função: " + passagem.getFuncionario().getFuncao());
//        System.out.println("Salário: " + passagem.getFuncionario().getSalario());
//        System.out.println("---------------------------------------------");

        System.out.println("DADOS PASSAGEM");
        System.out.println("Código: " + passagem.getId());
        System.out.println("Data da Compra: " + passagem.getDataCompra());
        System.out.println("Data de Embarque: " + passagem.getDataEmbarque());
        System.out.println("Desconto: " + passagem.getDesconto());
        System.out.println("Valor Total: " + passagem.getValorTotal());
        System.out.println("Destino: " + passagem.getDestino().getNome());
        System.out.println("Origem: " + passagem.getOrigem().getNome());
        System.out.println("Código da poltrona: " + passagem.getPoltrona().getId());
        System.out.println("Numero da poltrona: " + passagem.getPoltrona().getNumero());
        System.out.println("Tipo de poltrona: " + passagem.getPoltrona().getTipo());
        System.out.println("Está disponível a poltrona? "+passagem.getPoltrona().getDisponivel());
        System.out.println("Código do Onibus: "+passagem.getPoltrona().getOnibus().getId());
        System.out.println("Placa do Onibus: "+passagem.getPoltrona().getOnibus().getPlaca());
        System.out.println("Tipo do Onibus: "+passagem.getPoltrona().getOnibus().getTipo());
        System.out.println("Código Local: "+passagem.getLocal().getId());
        System.out.println("Nome Local: "+passagem.getLocal().getNome());
        System.out.println("Taxa de Embarque: "+passagem.getLocal().getTaxaEmbarque());
        
    }
}
