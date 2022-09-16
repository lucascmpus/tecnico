import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada =  new Scanner(System.in);
		String nome = entrada.next();
		double nota1 = entrada.nextInt();
		double nota2 = entrada.nextInt();
		
		double media = (nota1 + nota2)/2;
		
		if (media >= 7) {
			System.out.println(nome + ", você foi aprovado!");
		}else {
			System.out.println(nome + ", você foi reprovado!");
		}
		
		entrada.close();
		
	}

}
