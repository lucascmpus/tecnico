import java.util.Arrays;
import java.util.Random;

public class questao07 {
    public static void main(String[]args){
        Random gerador = new Random();
        int[] num = new int[10];
        int somaTotal = 0;
        double media = 0;
        int maior = 0;
        int menor = 0;

        for(int i = 0; i < num.length; i++){
            num[i] = gerador.nextInt(0,50);
            somaTotal += num[i];
            media = somaTotal/num.length;
        }
        
        for (int i = 0; i< num.length; i++){
            if(i==0){
                maior = num[i];
                menor = num[i];
            }
            if (num[i] > maior){
                maior = num[i];
            }
            if (num[i] < menor){
                menor = num[i];
            }
        }


        System.out.println(Arrays.toString(num));
        System.out.println("Média: " +media);
        System.out.println("Soma total: "+somaTotal);
        System.out.println("Menor número: "+menor);
        System.out.println("Maior número: "+ maior);
    }
}
