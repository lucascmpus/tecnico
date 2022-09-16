import java.util.Scanner;

public class questao03 {

    public static int Function(int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
    public static int Entrada(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        return entrada.nextInt();
    }
    public static void main(String[]args){
        int num1, num2;
        num1 = Entrada();
        num2 = Entrada();

        System.out.println("O número maior é: " + Function(num1, num2));
    }
}
