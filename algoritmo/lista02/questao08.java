import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int codigo = input.nextInt();
		int qtd = input.nextInt();
		double total = 0;
		
		int doguinho = 100;
		int dogao = 101;
		int paoOvo = 102;
		int hamburguer = 103;
		int xburger = 104;
		int refri = 105;
		
		if(codigo == 100) {
			total = qtd * 2.5;
			System.out.println("O total é de R$: "+total);
		}else if(codigo==101) {
			total = qtd * 5.5;
			System.out.println("O total é de R$: "+total);
		}else if(codigo==102) {
			total = qtd*2.3;
			System.out.println("O total é de R$: "+total);
		}else if(codigo==103) {
			total = qtd*3.6;
			System.out.println("O total é de R$: "+total);
		}else if(codigo==104) {
			total = qtd*4;
			System.out.println("O total é de R$: "+total);
		}else if(codigo==105) {
			total = qtd*2;
			System.out.println("O total é de R$: "+total);
		}else {
			System.out.println("Codigo invalido");
		}
		
		
		input.close();
	}

}
