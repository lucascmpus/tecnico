import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] num = new int[6];
		
		
		for(int i = 0; i < 6; i++) {
			System.out.println(i+": ");
			num[i] = entrada.nextInt();
		}
		
		System.out.print("Ordem inversa:");
		for(int i = 5; i>=0;i--) {
			System.out.print(" "+num[i]);
		}
		
		entrada.close();
	}

}
