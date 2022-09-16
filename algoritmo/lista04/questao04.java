import java.util.Arrays;
import java.util.Random;

public class questao04 {
    public static void main(String[]args){
        Random numeros = new Random();
        int[] num = new int[7];
        for(int i = 0; i < num.length; i++){
            num[i] = numeros.nextInt(0,26);
        }
        System.out.println(Arrays.toString(num));
    }
}
