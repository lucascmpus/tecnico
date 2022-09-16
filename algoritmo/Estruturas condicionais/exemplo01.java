import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int valor = entrada.nextInt();
		
		if (valor % 2 == 0) {
			System.out.printf("%d é par", valor);
		} else {
			System.out.printf("%d é impar", valor);
		}
		
	}

}
