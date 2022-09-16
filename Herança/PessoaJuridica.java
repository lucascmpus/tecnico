
public class PessoaJuridica extends Pessoa {
	private String CNPJ;
	private String IE;
	
	PessoaJuridica(){}
	
	PessoaJuridica(String nomePJ, String endPJ, String CNPJ, String IE){
		super(nomePJ, endPJ);
		this.CNPJ = CNPJ;
		this.IE = IE;
	}
	
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("CPF: " + this.CNPJ);
		System.out.println("IE: " + this.IE);
	}
}
