/*Assuntos
    - Conceito de classes (atributos e métodos)
    - Conceito de objetos - Criação de novos objetos (ou novas instâncias) de uma classe
    - Encapsulamento ou proteção de atributos (private)
    - Conceito de Herança (classes que herdam atributos e métodos de uma classe "mãe")
    - Conceito de composição (classe que está composta em outra classe)
*/

package paradigma_orientado_objetos;

public class CadastroCliente {
    public static void main(String[] args) {
       
        //CADASTRANDO CLIENTE 01 (criando objeto e preenchendo)
        Cliente cli1 = new Cliente(); //o new cria um novo objeto na memória (ou uma nova instância) da classe Cliente
        cli1.setNome("Eliomar Campos"); //através do método público setNome(), é inserido um valor no atributo privado nome
        cli1.setSexo("Macho!"); //através do método público seSexo(), é inserido um valor no atributo privado sexo
        cli1.setPontosFidelidade(443);
        cli1.setDiaVencimento(5);
        //Cadastrando endereco (criando objeto e preenchendo)
        Endereco end1 = new Endereco(); //o new cria um novo objeto na memória (ou uma nova instância) da classe Endereco
        end1.setBairro("BNH"); //através do método público setBairro(), é inserido um valor no atributo privado bairro
        end1.setCep("0488541");
        end1.setCidade("Paulo Afonso");
        end1.setEstado("Bahia");
        end1.setNumero("30");
        end1.setRua("Barcelona");
        //Inserindo um objeto do tipo Endereco dentro de outro objeto do tipo Cliente
        cli1.setEndereco(end1); //O método setEndereco passa o objeto end1 para o atributo endereco do objeto cli1
        
        
        //CADASTRANDO CLIENTE 02 (criando objeto e preenchendo)
        Cliente cli2 = new Cliente();
        cli2.setNome("Rafaela Ramalho");
        cli2.setSexo("Feminino!");
        cli2.setPontosFidelidade(888);
        cli2.setDiaVencimento(10);
        //cadastrando enredeco
        cli2.setEndereco(end1); //suponha que esse cliente reside na mesma casa do primeiro cliente, então não precisamos criar e preencher um novo objeto, basta aproveitarmos o mesmo já criado e preenchido
        
        
        //LISTANDO CLIENTES (listando os atributos dos objetos)
        System.out.println("CLIENTE 01: ");
        System.out.println("Nome: "+cli1.getNome()); //o método getNome() da classe Cliente retorna o valor contido no atributo nome
        System.out.println("Sexo: "+cli1.getSexo()); //o método getSexo() da classe Cliente retorna o valor contido no atributo sexo
        System.out.println("Dia de Vencimento: "+cli1.getDiaVencimento());
        System.out.println("Pontos Fidelidade: "+cli1.getPontosFidelidade());
        System.out.println("Rua: "+cli1.getEndereco().getRua()); //o método getEndereco() da classe Cliente retorna um objeto contido no atributo Endereco, depois o método getRua() retorna o valor contido no atributo rua da classe Endereco
        System.out.println("Bairro: "+cli1.getEndereco().getBairro()); //o método getEndereco() da classe Cliente retorna um objeto contido no atributo Endereco, depois o método getBairro() retorna o valor contido no atributo bairro da classe Endereco
        System.out.println("Cidade: "+cli1.getEndereco().getCidade()); //o método getEndereco() da classe Cliente retorna um objeto contido no atributo Endereco, depois o método getCidade() retorna o valor contido no atributo cidade da classe Endereco
        
        
        System.out.println("CLIENTE 02: ");
        System.out.println("Nome: "+cli2.getNome());
        System.out.println("Sexo: "+cli2.getSexo());
        System.out.println("Dia de Vencimento: "+cli2.getDiaVencimento());
        System.out.println("Pontos Fidelidade: "+cli2.getPontosFidelidade());
        System.out.println("Rua: "+cli2.getEndereco().getRua());
        System.out.println("Bairro: "+cli2.getEndereco().getBairro());
        System.out.println("Cidade: "+cli2.getEndereco().getCidade());
        
        
        
        
    }
}
