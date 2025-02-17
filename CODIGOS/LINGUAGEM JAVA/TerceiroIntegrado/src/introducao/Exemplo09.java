package introducao;

public class Exemplo09 {
    public static void main(String[] args) {
        
        for(int i=50; i < 10000000; i++){
            if(i%2 != 0){
                System.out.print(i+",");
            }
        }
    }
}
