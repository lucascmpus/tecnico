import java.util.Arrays;

public class questao03 {
    public static void main(String[] args) {
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            if (num[i] % 2 > 0) {
                num[i] = 2;
            } else {
                num[i] = 1;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
