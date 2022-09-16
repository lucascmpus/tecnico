import java.util.Random;

public class questao008 {
   public static void main(String[]args){
    
    Random rdm = new Random();

    int num5 = 0;
    int div3 = 0;
    
    System.out.print("Numeros sorteados: ");
    for(int i = 1; i<= 20; i++){
        int sorteado = rdm.nextInt(0,50);
        if(sorteado >= 25){
            num5++;
        }
        
        if(sorteado % 3 == 0){
            div3++;
        }
        System.out.print(sorteado + " ");
        
    }
    System.out.println("\nnumeros divisiveis por 3: "+div3);
    System.out.println("numeros maiores que 25: " +num5);
    
    
   }
}
