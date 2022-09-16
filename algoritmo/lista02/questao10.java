import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double salary = input.nextDouble();
		double valueHouse = input.nextDouble();
		int amountYear = input.nextInt();
		
		double installment = valueHouse/(amountYear * 12);
		double salaryPercent = (installment*100) /salary;
		System.out.printf("A prestação custa %.2f%% do seu salário... logo%n", salaryPercent);
		
		if(salaryPercent>=30) {
			System.out.println("seu emprestimo foi negado");
		}else {
			System.out.println("seu emprestimo foi aceito");
		}
		
		
		
		
		input.close();
	}

}
