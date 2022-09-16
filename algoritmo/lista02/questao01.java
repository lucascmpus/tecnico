import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int ano = entrada.nextInt();
		
		if(ano % 4==0) {
			System.out.println("Ano é bissexto");
		} else {
			System.out.println("Não é bissexto");
		}
		entrada.close();
	}

}
