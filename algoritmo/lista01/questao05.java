package lista01;

public class questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double din = 100;
		double dolar,euro, cotacaoDolar,cotacaoEuro;
		
		dolar = 5.07;
		euro = 5.08;
		
		cotacaoDolar = din / dolar;
		cotacaoEuro = din / euro;
		System.out.printf("A cotação em euro é: %.2f",cotacaoEuro );
		
	
		System.out.printf("\nA cotação em dolár é: %.2f ",cotacaoDolar);
		
	}

}
