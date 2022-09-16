import java.util.Scanner;

public class exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int valor = entrada.nextInt();
		
		
		
		if (valor > 0) {
			System.out.println("O valor é positivo");
		} else if (valor == 0) {
			System.out.println("O valor é neutro");
		} else {
			System.out.println("O valor é negativo");
		}
		entrada.close();
	}

	
	
}
