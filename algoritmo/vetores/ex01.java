import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] pais;
		
		pais = new String[5];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i <5;i++) {
			System.out.println("País["+i+"]: ");
			pais[i] = entrada.next();
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println("País["+i+"]: " +pais[i]);
		}
		entrada.close();
	}

}
