import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if(num1>num2) {
			System.out.println("O "+num1+ " é maior");
		}else if (num2>num1) {
			System.out.println("O " +num2+" é maior");
		}else {
			System.out.println("Os dois numeros são iguais");
		}
		
		
		input.close();
	}

}
