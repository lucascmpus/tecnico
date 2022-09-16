package lista01;

public class questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int custoFabrica = 2000;
		double distribuicao = 0.28;
		double imposto = 0.45;
		
		double total = custoFabrica + (custoFabrica * distribuicao) + (custoFabrica * imposto);
		
		System.out.println(total);
		System.out.println(custoFabrica * distribuicao);
		
		
	}

}
