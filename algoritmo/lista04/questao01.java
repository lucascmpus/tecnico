import java.util.Arrays;

public class questao01{
    public static void main(String[]args){
        int[] num = new int[10];

        for(int i = 0; i< num.length ;i++){
            if(num[i] ==0 ){
                num[0] = 10;
            }
            num[i] = 10 * (i+1);           
        }
        System.out.println(Arrays.toString(num));
        
    }
}