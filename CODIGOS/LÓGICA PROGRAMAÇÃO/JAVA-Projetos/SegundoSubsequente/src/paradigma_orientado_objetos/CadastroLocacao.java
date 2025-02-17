package paradigma_orientado_objetos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroLocacao {
    public static void main(String[] args) {
        Endereco end = new Endereco();
        end.setBairro("BTN");
        end.setCidade("Paulo Afonso");
        end.setRua("30 de julho");
        
        Cliente cli = new Cliente();
        cli.setNome("José Amancio");
        cli.setCpf("000414444");
        cli.setEndereco(end);
        
        Funcionario fun = new Funcionario();
        fun.setNome("Aparecido José");
        fun.setFuncao("Garoto de Programa");
        fun.setSalario(1000000000);
        
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo("Uno");
        veiculo.setMarca("Fiat");
        veiculo.setPlaca("FRE0800");
        veiculo.setPrecoDiaria(50);
        veiculo.setStatus("Disponível");
        
        //REALIZANDO UMA LOCAÇÃO
        Locacao loca = new Locacao();
        loca.setCliente(cli);
        loca.setFuncionario(fun);
        loca.setVeiculo(veiculo);
        loca.setStatus("Em andamento");
        loca.setValor(1005);
        Date dataSaida = new Date();
        loca.setDataSaida(dataSaida); 
        
        //Relatório de Locações
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        
        System.out.println("Data de Saída: "+formato.format(loca.getDataSaida()));
        System.out.println("Nome Cliente: "+loca.getCliente().getNome());
        System.out.println("Nome Funcionário: "+loca.getFuncionario().getNome());
        System.out.println("Placa Veículo: "+loca.getVeiculo().getPlaca());
        System.out.println("Marca: "+loca.getVeiculo().getMarca());
        System.out.println("Valor da diária: "+loca.getVeiculo().getPrecoDiaria());
        System.out.println("Valor Total a Pagar: "+loca.getValor());
        System.out.println("Status Da Locação: "+loca.getStatus());
        
        
    }
}
