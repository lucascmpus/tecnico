import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa alguem = new Pessoa();
		
		Scanner entrada = new Scanner(System.in);
		
		
				
		alguem.setNome(entrada.next());
		alguem.setIdade(entrada.nextInt());
		alguem.setCorPreferida(entrada.next());
		
		
		System.out.println(alguem.getNome());
		System.out.println(alguem.getIdade());
		System.out.println(alguem.getCorPreferida());
		
		alguem.MostrarDados();
	}

}
