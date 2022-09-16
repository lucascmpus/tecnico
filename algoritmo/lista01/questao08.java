package lista01;

public class questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double aluguel, km, dia, diaria, precoKM, valorDiaria, valorKM;
		
		valorDiaria = 75.5;
		precoKM = 0.35;
		km = 10;
		dia = 5;
		
		
		diaria = dia * valorDiaria;
		valorKM = km * precoKM;
		
		aluguel = diaria + valorKM;
		
		System.out.printf("O valor total foi de R$: %.2f", aluguel);
		
	}

}
