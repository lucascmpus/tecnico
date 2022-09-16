import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		
		double notaFinal = (nota1+nota2)/2;
		
		if (notaFinal >= 7) {
			System.out.println("Você foi aprovado com "+ notaFinal);
		}else if (notaFinal <= 4.9) {
			System.out.println("Você foi reprovado com " + notaFinal);
		} else {
			System.out.println("Você está de recuperação com "+notaFinal);
		}
		input.close();
	}

}
