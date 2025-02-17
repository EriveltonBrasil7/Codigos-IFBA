package introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Exemplo17_datas {
    public static void main(String[] args) throws ParseException {
        //LocalDate dataAtual = LocalDate.now();
        //LocalDate dataFutura = LocalDate.parse("2018-04-22");
        
        //Sem envolver Date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");    
        LocalDate data1 = LocalDate.parse("30/12/2017", dtf);
        LocalDate data2 = LocalDate.parse("02/01/2018", dtf); 
        long intervaloDias = ChronoUnit.DAYS.between(data1, data2);
        System.out.println(intervaloDias);
        
        //Envolvendo Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data3 = sdf.parse("20/04/2018");
        Date data4 = sdf.parse("22/04/2018");
        //Converter Date para LocalDate
        LocalDate localDate3 = LocalDate.parse(sdf.format(data3), dtf);
        LocalDate localDate4 = LocalDate.parse(sdf.format(data4), dtf);
        intervaloDias = ChronoUnit.DAYS.between(localDate3, localDate4);
        System.out.println(intervaloDias);
        
        
        
    }
}
