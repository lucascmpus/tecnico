package lista01;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int diasPessoa = entrada.nextInt();
		
		int qtdAnos = diasPessoa/365;
		diasPessoa = diasPessoa % 365;
		
		int qtdMeses = diasPessoa/30;
		diasPessoa = diasPessoa % 30;
		
	
		int qtdDias = diasPessoa;
		
		System.out.printf("%d anos, %d meses %d dias", qtdAnos,qtdMeses, qtdDias);
		
		entrada.close();
			
		
	}

}
