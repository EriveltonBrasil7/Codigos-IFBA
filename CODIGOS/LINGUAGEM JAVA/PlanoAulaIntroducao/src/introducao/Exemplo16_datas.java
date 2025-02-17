/*
    Trabalhando com Datas no formato brasileiro
*/

package introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo16_datas {
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //O método parse da classe SimpleDateFormat converte de String para Date, de acordo com o formato definido no construtor 
        //O método format da classe SimpleDateFormat converte de Date para String, de acordo com o formato definido no construtor
   
        //Converter de Date para String no formato brasileiro
        Date dat = new Date();
        System.out.println("Formato String brasileiro: "+formato.format(dat));
 
        
        //Converter de String no formato brasileiro para Date
        String datString = "01/12/1987 13:50:01";
        try {
            dat = formato.parse(datString);
            System.out.println("Formato Date: "+dat);
        } catch (ParseException ex) {
            System.out.println("Erro ao converter de String para Date");
        }
        
    }
}
