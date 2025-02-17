/*
  A CLASSE PESSOA AQUI, IRÁ SERVIR COMO UMA CLASSE ABSTRATA, ou seja, serve apenas para servir o seu código (atributos e métodos) para
outras classes filhas. Na herança de classe, a classe mãe é abstrata, pois a mesma nunca é instanciada, mas apenas o seus filhos são 
instanciados.
*/

package paradigma_orientado_objetos;

public class Pessoa {
    private String nome;
    private String sexo;
    //podemos dizer que Pessoa possui um Endereco
    private Endereco endereco; //este atributo é do tipo classe Endereco, ou seja, é possível inserir um objeto do tipo Endereco aqui dentro desse atributo. Portanto, é possível inserir um objeto de classe dentro do objeto de outra classe

    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void validarEndereco(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

      
    
    
}
