
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int maior18 = 0;
		
		String[] nome = new String[5];
		int[] idade = new int[5];
		
		for(int i = 0; i<5;i++) {
			System.out.println("Nome "+i+": ");
			nome[i] = entrada.next();
			System.out.println("Idade "+i+": ");
			idade[i] = entrada.nextInt();
		}
		
		for(int i=0; i<5;i++) {
			if (idade[i] > 18) {
				maior18++;
				System.out.println(nome[i] + " é maior que 18anos");
			}			
		}
		System.out.println(maior18);
		entrada.close();
	}

}
