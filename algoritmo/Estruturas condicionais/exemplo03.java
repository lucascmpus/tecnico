import java.util.Scanner;

public class exemplo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		int n = 0;
		
		if (num>10) {
			System.out.println(num);
		} else {
			System.out.println(n);
		}
		entrada.close();
	}

}
