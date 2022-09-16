package lista01;

import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os numeros");
		int nota1 = entrada.nextInt();
		int nota2 = entrada.nextInt();
		int nota3 = entrada.nextInt();
		
		int total = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
		System.out.println(total);
		entrada.close();

	}

}
