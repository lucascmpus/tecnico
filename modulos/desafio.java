import java.util.Random;
import java.util.Scanner;

public class desafio {
	
	public static int aleatorio() {
		Random gerador = new Random();
		int numAlea = gerador.nextInt(10);
		return numAlea;
	}
	
	public static int entrada() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu número: ");
		return entrada.nextInt();		
	}
	
	public static void validacao(int n1) {
		if(n1 % 2 == 0) {
			System.out.println("Valor par");
		} else {
			System.out.println("Valor impar");
		}		
	}
	
	public static String ladoJogo() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu lado(impar,par): ");
		return entrada.next();
	}

	public static void main(String[] args) {
		String lado = ladoJogo();
		int numero = entrada();
		int numeroPC = aleatorio();
		int soma = numero+numeroPC;
		System.out.println("Numero: " + numero);
		System.out.println("Numero PC: " + numeroPC);
		System.out.print("O valor é: " + soma +" -- ");
		validacao(soma);
				
				
		if (lado == "impar") {
			if (soma % 2 >0) {
				System.out.println("Você ganhou!");
			} else {
				System.out.println("Você perdeu");
			}
		} else {
			if (soma % 2 == 0) {
				System.out.println("Você ganhou");
			}else {
				System.out.println("Você perdeu");
			}
		}
		
	}

}
