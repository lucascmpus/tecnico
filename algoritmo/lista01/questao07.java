package lista01;

public class questao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario = 1000;
		double valeT = 0.06;
		double salarioFam = 0.02;
		double salarioFinal;
		
		salarioFinal = (salario - (salario * valeT)) * (1+salarioFam);
		
		System.out.printf("O salário final é: %.2f", salarioFinal);
	}

}
