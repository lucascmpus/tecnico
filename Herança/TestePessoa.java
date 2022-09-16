
public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa ninguem = new Pessoa();
		ninguem.mostrarDados();

		Pessoa alguem= new Pessoa("Alguém", "Rua XYZ 100");
		alguem.mostrarDados();
		
		PessoaFisica ze = new PessoaFisica();
		ze.mostrarDados();
		
		PessoaFisica joao = new PessoaFisica("999.888.444-00");
		joao.mostrarDados();
		
		PessoaFisica eva = new PessoaFisica("Eva", "Rua do parais, nr1", "000.000.002-00");
		eva.mostrarDados();

	}

}
