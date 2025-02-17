package introducao;

import javax.swing.JOptionPane;

public class Exemplo5 {
    public static void main(String[] args) {
        //TRABALHANDO COM STRINGS
        //Declarando...
        String nome1 = "Eliomar Gomes Campos";
        String nome2 = "Eliomar Gomes Campos";
        String nome3 = new String("Eliomar Gomes Campos");
        String nome4 = new String("Eliomar Gomes Campos");
        
        boolean resposta = nome1 == nome2;
        System.out.println("Nome1 é igual a nome2? "+resposta);
        
        resposta = nome1 == nome3;
        System.out.println("Nome1 é igual a nome3? "+resposta);
        
        resposta = nome1.equals(nome3);
        System.out.println("Nome1 é igual a nome3 (com equals) ? "+resposta);
        
        //Exibindo posição de memória
        System.out.println("Endereço de Nome1: "+System.identityHashCode(nome1));
        System.out.println("Endereço de Nome2: "+System.identityHashCode(nome2));
        System.out.println("Endereço de Nome3: "+System.identityHashCode(nome3));
        System.out.println("Endereço de Nome4: "+System.identityHashCode(nome4));
        System.out.println(nome1);
        
        //Utilizando alguns métodos da classe String
        System.out.println("Caixa Alta: "+nome1.toUpperCase());
        System.out.println("Caixa Baixa: "+nome1.toLowerCase());
        System.out.println("Substituindo Caracteres: "+nome1.toLowerCase().replace("e", "5").toUpperCase());
        System.out.println("Substring: "+nome1.substring(0, 7)+" "+nome1.substring(14, 20));
        System.out.println("A variável está vazia? "+nome1.isEmpty());
        
        
        if(nome1.isEmpty()){
            System.out.println("Ops! Preencha seu nome para Salvar!");
        }else{
            System.out.println("Salvo com sucesso!");
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso!");
        }
    }
}
