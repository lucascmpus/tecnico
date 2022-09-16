import java.util.Scanner;

public class funcoes01 {
	
	public static double somar(double n1, double n2) {
		return n1+n2;
	}
	
	public static double subtra(double n1, double n2) {
		return n1-n2;
	}

	public static double multi(double n1, double n2) {
		return n1*n2;
	}
	
	public static double div(double n1, double n2) {
		return n1/n2;
	}
	
	public static double lerN() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		return entrada.nextDouble();
	}
	
	public static void main(String[] args) {
		double nr1, nr2;
		nr1 = lerN();
		nr2 = lerN();
		System.out.println("Soma é "+somar(nr1, nr2));
	}

}
