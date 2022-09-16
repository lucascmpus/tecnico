import java.util.Scanner;

public class exemplo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int valor = entrada.nextInt();
		
		int p = 0,i = 0;
		
		if (valor % 2 ==0) {
			p = valor;
		} else {
			i = valor;
		}
		System.out.println("o valor de P é " + p);
		System.out.println("o valor de i é " + i);
		
		
		entrada.close();
	}

}
