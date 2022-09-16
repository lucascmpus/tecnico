import java.util.Scanner;

public class testeQuestao01 {

	public static void main(String[] args) {
		questao01 teste = new questao01();
		Scanner entrada = new Scanner(System.in);
		// Matricula
		System.out.println("Digite a matricula");
		teste.setMatricula(entrada.nextInt());
		// Nota1
		System.out.println("Digite a primeira nota");		
		teste.setNota1(entrada.nextDouble());
		// Nota2 
		System.out.println("Digite a segunda nota");
		teste.setNota2(entrada.nextDouble());
		// Nota Trabalho
		System.out.println("Digite a nota do trabalho");
		teste.setNotaTrabalho(entrada.nextDouble());

		teste.media();
		
		questao01 teste2 = new questao01(102,10,5,6);
		teste2.media();
		entrada.close();
	}

}
