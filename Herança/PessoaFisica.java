
public class PessoaFisica extends Pessoa{
	private String CPF;
	
	PessoaFisica() {}
	
	PessoaFisica(String CPF){
		super();
		this.CPF = CPF;
	}
	
	PessoaFisica(String nomePf, String endPf, String Cpf){
		super(nomePf, endPf);
		this.CPF = Cpf;
	}
	
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("CPF: "+this.CPF);
	}

}
