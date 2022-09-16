import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Primeiro Valor: ");
		int primeiroValor = entrada.nextInt();
		System.out.print("Último Valor: ");
		int valorFinal = entrada.nextInt();
		System.out.print("Incremento: ");
		int incremento = entrada.nextInt();
		
		System.out.print("Contagem: ");
		while(valorFinal >= primeiroValor) {
			System.out.print(primeiroValor + " ");
			primeiroValor += incremento;
		}
		
		System.out.print("Acabou!");
		entrada.close();
		
	}

}
