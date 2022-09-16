import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int acima = 0;
		int taxa = 5;
		
		
		int radar = input.nextInt();
		
		if (radar > 80) {
			acima = radar - 80;
			acima = acima * taxa;
			System.out.println("Você terá que pagar R$: "+acima);
		} else {
			System.out.println("Você está na velocidade permitida");
		}
		input.close();
	}

}
