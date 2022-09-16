public class testeQuestao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		questao04 teste = new questao04(10,20);
		
		teste.entrarPessoa();
		teste.SubirOuDescer(2);
		
		teste.mostrar();
		System.out.println("___________________________");
		teste.entrarPessoa();
		teste.sairPessoa();
		teste.SubirOuDescer(1);
		teste.mostrar();
		
	}

}
