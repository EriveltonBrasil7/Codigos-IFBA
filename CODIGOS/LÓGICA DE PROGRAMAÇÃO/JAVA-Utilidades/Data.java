package utilitarias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Data {
   public static String dia, mesTexto, mesNumero, ano, diaSemana;
   
   public static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
   //O método parse da classe SimpleDateFormat converte de String para Date, de acordo com o formato definido no construtor 
   //O método format da classe SimpleDateFormat converte de Date para String, de acordo com o formato definido no construtor 
   
   
   /**
    * O objetivo desse método é converter uma data no formato String "dd/MM/yyyy HH:mm:ss", para o formato date
    */
   public Date parseDataBrasil(String dataBrasil){  
	  Date data = null;
       try {
          data = formato.parse(dataBrasil);
       } catch (ParseException ex) {
           Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
       }
	return data;  
   }
   
    /**
    * O objetivo desse método é converter uma data no formato Date, para o formato String "dd/MM/yyyy HH:mm:ss"
    */
   public static String formatDataBrasil(Date data){
		  String dataBrasil = formato.format(data);
		  return dataBrasil;  
	   }
   
    
   /**
    * Iniciaza a data do sistema no formato brasileiro
    */
   public static String inicializarDataSistemaBrasil(){
	   Date dataSistema = new Date();
	   return formatDataBrasil(dataSistema);
   }
   
   /**
    * Inicializar a data atual do sistema, e preenche as variáveis separadamente
    */
   public void inicializarDataSistemaPorParte(){
	   Date dataSistema = new Date();
	   ano = "" + (1900 + dataSistema.getYear());
	   dia = "" + dataSistema.getDate();
	   
	   switch(dataSistema.getDay()){
	   		case 0: 
	   			diaSemana = "Domingo"; break;
	   		case 1: 
	   			diaSemana = "Segunda"; break;
	   		case 2: 
	   			diaSemana = "Terça"; break;
	   		case 3: 
	   			diaSemana = "Quarta"; break;
	   		case 4: 
	   			diaSemana = "Quinta"; break;
	   		case 5: 
	   			diaSemana = "Sexta"; break;
	   		case 6: 
	   			diaSemana = "Sábado"; break;
	   }
	   
	   switch(dataSistema.getMonth()){
	   		case 0:
	   			mesTexto = "Janeiro"; 
	   			mesNumero = "01"; break;
	   		case 1:
	   			mesTexto = "Fevereiro";
	   			mesNumero = "02"; break;
	   		case 2:
	   			mesTexto = "Março";
	   			mesNumero = "03"; break;
	   		case 3:
	   			mesTexto = "Abril";
	   			mesNumero = "04"; break;
	   		case 4:
	   			mesTexto = "Maio";
	   			mesNumero = "05"; break;
	   		case 5:
	   			mesTexto = "Junho";
	   			mesNumero = "06"; break;
	   		case 6:
	   			mesTexto = "Julho";
	   			mesNumero = "07"; break;
	   		case 7:
	   			mesTexto = "Agosto";
	   			mesNumero = "08"; break;
	   		case 8:
	   			mesTexto = "Setembro";
	   			mesNumero = "09"; break;
	   		case 9:
	   			mesTexto = "Outubro";
	   			mesNumero = "10"; break;
	   		case 10:
	   			mesTexto = "Novembro";
	   			mesNumero = "11"; break;
	   		case 11:
	   			mesTexto = "Dezembro";
	   			mesNumero = "12"; break;
	   }
	   
   }
}
