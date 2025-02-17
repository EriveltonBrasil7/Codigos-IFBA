package view;

import controller.DAOLocal;
import java.util.ArrayList;
import java.util.Scanner;
import model.Local;

public class ConsoleLocal {

    public static void main(String[] args) {
        //LISTANDO

        DAOLocal dao = new DAOLocal();
        ArrayList<Local> lista = dao.getAllLocais();

        for (Local loc : lista) {
            System.out.println("\n Código: " + loc.getId());
            System.out.println("Nome: " + loc.getNome());
            System.out.println("Taxa de Embarque: " + loc.getTaxaEmbarque());
        }
        
        
        //CADASTRANDO
        
        Scanner input = new Scanner(System.in);
        System.out.println("\n---------------
                -------------");
        System.out.println("CADASTRE UM NOVO ENDEREÇO");
         System.out.println("-------------------");
         
         Local loc = new Local ();
         System.out.println("------LOCAL------");
         System.out.println("Nome: ");
         loc.setNome(input.nextLine());
         
         System.out.println("Taxa de Embarque: ");
         loc.setTaxaEmbarque(input.nextDouble());
         
         dao.insertLocal(loc);
        

    }
}
