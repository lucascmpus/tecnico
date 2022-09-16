import java.util.Arrays;
import java.util.Scanner;

public class questao05 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];
        
        for(int i = 0; i < nomes.length; i++){
            nomes[i] = entrada.next();            
        }

        System.out.print("Nomes ordem inversa:");
        for (int i = 4; i > 0; i--){
            System.out.print(nomes[i] + " ");
        }
        System.out.println(Arrays.toString(nomes));
        entrada.close();
    }
}
