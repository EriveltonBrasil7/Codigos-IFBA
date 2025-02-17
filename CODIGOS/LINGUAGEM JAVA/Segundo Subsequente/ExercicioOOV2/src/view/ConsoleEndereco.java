package view;

import controller.DAOEndereco;
import java.util.ArrayList;
import java.util.Scanner;
import model.Endereco;

/**
 *
 * @author eliomar.campos
 */
public class ConsoleEndereco {
    public static void main(String[] args) {
        //LISTANDO
        DAOEndereco dao = new DAOEndereco();
        ArrayList<Endereco> lista = dao.getAllEnderecos(); 
        
        for(Endereco end : lista){
            System.out.print("\n | Código: "+end.getId());
            System.out.print(" | Cidade: "+ end.getCidade());
            System.out.print(" | Estado: "+ end.getEstado());
            System.out.print(" | Numero: "+ end.getNumero());
            System.out.print(" | Bairro: "+ end.getBairro());
            System.out.print(" | Rua: "+ end.getRua());
        }
        
        
        //CADASTRANDO
        Scanner input = new Scanner(System.in);
        System.out.println("\n-------------------");
        System.out.println("CADASTRE UM NOVO ENDEREÇO");
        System.out.println("-------------------");
        
        Endereco ender = new Endereco();
        System.out.print("Cidade: ");
        ender.setCidade(input.nextLine()); 
        
        System.out.print("Bairro: ");
        ender.setBairro(input.nextLine()); 
        
        System.out.print("Estado: ");
        ender.setEstado(input.nextLine()); 
        
        System.out.print("Número: ");
        ender.setNumero(input.nextLine()); 
        
        System.out.print("Rua: ");
        ender.setRua(input.nextLine()); 
        
        dao.insertEndereco(ender); 
    }
}
