import java.util.Scanner;

public class Moto {
	int velocidade;
	String cor;
	String marca;
	
	public void lerDados() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a marca: ");
		this.marca = entrada.next();
		System.out.println("Digite a velocidade: ");
		this.velocidade = entrada.nextInt();
		System.out.println("Digite a cor: ");
		this.cor = entrada.next();	
		entrada.close();
	}
	
	public void mostrarDados() {
		System.out.println("Marca: "+ this.marca);
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("Cor: " + this.cor );
	}
	
	public void Acelerar(int km) {
		this.velocidade += km;
	}
	
	public void Desacelerar(int km) {
		this.velocidade -= km;
	}
	
	public void Parar() {
		this.velocidade=0;
	}
	
}
