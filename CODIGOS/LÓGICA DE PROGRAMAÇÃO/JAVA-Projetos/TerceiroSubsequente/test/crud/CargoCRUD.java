package crud;
import controller.DAOCargo;
import java.util.ArrayList;
import java.util.List;
import model.Cargo;

public class CargoCRUD {
    
    static DAOCargo dao;
    
    public static void main(String[] args) {
       
        dao = new DAOCargo();
       
       //cadastrarCargos();
       //excluirCargo(1);
              
       Cargo c = new Cargo();
       c.setId(2);
       c.setNome("Secretária");
       c.setDescricao("Organizar as coisas");
       c.setRemuneracao(50);
       atualizarCargo(c);
       
       listarCargos(); 
   
      
    }
    
    public static void atualizarCargo(Cargo c){
        dao.atualizarCargo(c);
    }
    
    public static void excluirCargo(int id){
       boolean status = dao.deletarCargo(id);
       if(status == false){
           System.out.println("Não é possível excluir");
       }else{
           System.out.println("Sucesso ao excluir");
       }
    }
    
    public static void cadastrarCargos(){
        Cargo c = new Cargo();
        c.setNome("Porteiro");
        c.setDescricao("Responsável por vigiar");
        c.setRemuneracao(950);
        
        
        Cargo c2 = new Cargo();
        c2.setNome("Diretor");
        c2.setDescricao("Administrar tudo");
        c2.setRemuneracao(25000);
        
        dao.insertCargo(c);    
        dao.insertCargo(c2);
    }
    
    public static void listarCargos(){
        List<Cargo> lista = new ArrayList<>();
        
        lista = dao.getAllCargos("cargo_id");
        
        for(Cargo car : lista){
            System.out.println("ID: "+car.getId());
            System.out.println("Nome: "+car.getNome());
        }
        
        //FOR tradicional
//        for(int i=0; i < lista.size(); i++){
//            Cargo car = lista.get(i);
//            System.out.println("ID: "+car.getId());
//            System.out.println("Nome: "+car.getNome());
//        }
        
        
        
    }
}
