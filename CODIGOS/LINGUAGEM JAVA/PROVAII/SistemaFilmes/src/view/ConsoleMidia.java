package view;

import controller.DAOMidia;
import java.util.ArrayList;
import java.util.Scanner;
import model.Midia;

public class ConsoleMidia {

    public static void main(String[] args) {
        //LISTANDODE

        DAOMidia dao = new DAOMidia();
        ArrayList<Midia> lista = dao.getAllMidias();

        for (Midia mid : lista) {
            System.out.println("\n Código: " + mid.getId());
            System.out.println("Código de barras: " + mid.getCodBarra());
            System.out.println("Status: " + mid.getStatus());
        }
        
        //CADASTRANDO
        
        Scanner input = new Scanner(System.in);
        System.out.println("\n----------------------------");
        System.out.println("CADASTRE UMA NOVA MIDIA");
         System.out.println("-------------------");
         
        Midia mid = new Midia ();
         System.out.println("------MIDIA------");
         System.out.println("Código de Barras: ");
         mid.setCodBarra(input.nextLine());
         
         System.out.println("Status: ");
         mid.setStatus(input.nextLine());
         
         dao.insertMidia(mid);
        

        
    }
}