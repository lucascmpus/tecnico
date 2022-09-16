import java.util.Scanner;
public class questao09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double max = 0;
        double min = 0;
        for(int i = 1; i <= 8; i++){
            double preco = entrada.nextDouble();
            if (i==1){
                min = preco;
                max = preco;
            }            
            if (preco > max) {
                max = preco;
            }
            if (preco < min){
                min = preco;
            }
        }
        System.out.println("max"+max);
        System.out.println("min"+min);
        entrada.close();
	}
}
