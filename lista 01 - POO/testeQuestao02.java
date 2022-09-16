import java.util.Scanner;

public class testeQuestao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		questao02 teste = new questao02();
		Scanner entrada = new Scanner(System.in);
		
		teste.setNomeFuncionario(entrada.next());
		teste.setMatricula(entrada.nextInt());
		teste.setSalario(entrada.nextDouble());
		teste.mostrarDados();
		
		System.out.println("-----------------");
		
		teste.receberAumento(2000);
		teste.mostrarDados();
		
		System.out.println("-----------------");
		
		questao02 teste2 = new questao02("lucas",20,3000);
		teste2.mostrarDados(); 
		
		
		entrada.close();
	}

}
