import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int valorReais = input.nextInt();
		System.out.println(valorReais);
		
		System.out.println(valorReais/100 + "notas de 100");
		valorReais = valorReais%100;
		System.out.println(valorReais/50 + "notas de 50");
		valorReais = valorReais%50;
		System.out.println(valorReais/10 + "notas de 10");
		valorReais = valorReais%5;
		System.out.println(valorReais/5 + "notas de 5");
		int valor1 = valorReais;
		System.out.println(valor1 + "notas de 1");
		
		
		input.close();
	}

}
