import java.util.Scanner;

public class Coisa {
	
	private double valor1;
	private double valor2;
	private double somaValores;
	private double multiplicacaoValores;
	
	public void lerValor() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor1: ");
		this.valor1 = ler.nextDouble();
		System.out.println("Digite o valor2: ");
		this.valor2 = ler.nextDouble();
		this.somaValores = this.valor1 + this.valor2;
		this.multiplicacaoValores = this.valor1  * this.valor2;
	}
	
	public void MostrarValor() {
		System.out.println("Valor1: "+this.valor1);
		System.out.println("Valor2: "+this.valor2);
		System.out.println("Soma dos valores: " + this.somaValores);
		System.out.println("Multiplicacao valores: "+this.multiplicacaoValores);
	}
}
