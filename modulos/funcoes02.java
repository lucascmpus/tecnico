import java.util.Scanner;

public class funcoes02 {
	
	public static double descont(double n1) {
		if(n1 <= 500) {
			n1 = n1 * 0.95;
		} else {
			n1 = n1 * 0.925;
		} return n1;
	}
	
	public static double lerN() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor da compra: ");
		return entrada.nextDouble();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor = lerN();
		System.out.println("Valor total da compra com desconto: " + descont(valor));
	}

}
