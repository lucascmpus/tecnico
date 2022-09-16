import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		int result = 0;
	
		
		while(numero > 0) {
			result += numero;
			System.out.print("Número: ");
			numero = entrada.nextInt();
		}
		System.out.println("A Soma foi de: " +result);
		entrada.close();
	}

}
