import java.util.Scanner;

public class questao04 {

    public static double Kelvin(double a){
        double kelvin;
        kelvin = a + 273.15;
        return kelvin;
    }

    public static double Fahrenheit(double a){
        double fahrenheit;
        fahrenheit = (a * 1.8) + 32;
        return fahrenheit;
    }

    public static int Entrada(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static void main(String[]args){
        System.out.println("Digite a temperatura em Celsius: ");
        int temp = Entrada();
        System.out.println("Converter para ºF(1) ou ºK(2): ");
        int conversao = Entrada();
        
        if(conversao == 1){
            System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit(temp) );
        } else if (conversao == 2){
            System.out.println("A temperatura em Kelvin é: " + Kelvin(temp));
        } else{
            System.out.println("Codigo inválido");
        }
    }
}
