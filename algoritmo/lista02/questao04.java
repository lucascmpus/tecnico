import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite nome, sexo (F,M) e valor da compra: ");
		String name = input.next();
		char sexo = input.next().charAt(0);
		double value = input.nextDouble();
		
		if(sexo == 'F') {
			value = value * 0.87;
			System.out.println("Valor final da compra é de R$: " + value);
		}else if (sexo == 'M') {
			value = value * 0.95;
			System.out.println("Valor final da compra é de R$: "+ value);
		} else {
			System.out.println("Sexo inválido");
		}
		
		input.close();	
		
	}

}
