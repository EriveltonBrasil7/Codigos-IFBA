package paradigma_orientado_objetos;

public class Funcionario extends Pessoa{ //extends indica que esta classe está herdando todo o código da classe Pessoa (seus atributos e métodos)
    private String numeroCtps;
    private float salario;
    

    public void calcularContraCheque(){
        
    }
    
    public String getNumeroCtps() {
        return numeroCtps;
    }

    public void setNumeroCtps(String numeroCtps) {
        this.numeroCtps = numeroCtps;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = (salario+100+50)-80; 
    }
    
    
    
    
}
