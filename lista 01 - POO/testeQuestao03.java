import java.util.Scanner;

public class testeQuestao03 {

	public static void main(String[] args) {
		questao03 teste = new questao03("LG", 25, 100, 0);
		Scanner entrada = new Scanner(System.in);
		
		teste.setVolume(entrada.nextInt());
		teste.setCanalAtual(entrada.nextInt());
		teste.mostrarDados();
		System.out.println("-------------");
		teste.mudarCanal(2);
		teste.alterarVolume(80);
		teste.mostrarDados();
		
		entrada.close();
	}

}
