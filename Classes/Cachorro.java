import java.util.Scanner;

public class Cachorro {
	public String nome;
	public double peso;
	public double altura;
	public String cor;
	
	public void lerDados() {		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		this.nome = entrada.next();
		System.out.println("Digite o peso: ");
		this.peso = entrada.nextDouble();
		System.out.println("Digite a altura: ");
		this.altura = entrada.nextDouble();
		System.out.println("Digite a cor: ");
		this.cor = entrada.next();
		entrada.close();
	}
		
	public void MostrarDados() {
		System.out.println("NOME: "+this.nome);
		System.out.println("COR: " + this.cor);
		System.out.println("ALTURA: " + this.altura);
		System.out.println("PESO: "+this.peso);
	}
	public void Latir(){
		System.out.println("ruff ruff");
	}
	
	public void Emagrecer(double peso) {
		this.peso -= peso;
	}
	public void Engordar(double peso) {
		this.peso += peso;
	}
}
