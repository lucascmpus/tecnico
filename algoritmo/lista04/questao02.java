import java.util.Arrays;

public class questao02 {
    public static void main(String[]args){
        int[] num = new int[10];
        int numero = 10;
        for(int i = 0; i < 10; i++){
            num[i] = numero - 1;
        }
        System.out.println(Arrays.toString(num));
    }
}
