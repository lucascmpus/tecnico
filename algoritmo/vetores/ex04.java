import java.util.Arrays;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int[] num = new int[10];
		int[] par = new int[10];
		int[] impar = new int[10];
		int contPar = 0;
		int contImpar = 0;
		
		for(int i=0;i<num.length;i++) {
			System.out.print("Número " + i+": ");
			num[i]=entrada.nextInt();
		}
				
		for(int i=0; i< num.length; i++) {
			if(num[i]%2==0) {
				par[contPar]= num[i];
				contPar++;	
			} else {
				impar[contImpar]=num[i];
				contImpar++;
			}
		}
		
	
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(par));
		System.out.println(Arrays.toString(impar));
		entrada.close();
	}

}
