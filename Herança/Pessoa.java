
public class Pessoa {
	private String nome;
	private String endereco;
	
	Pessoa() {	}
	
	Pessoa(String nomeP, String end){
		this.nome = nomeP;
		this.endereco = end;
	}
	
	public void mostrarDados() {
		System.out.println();
		System.out.println("Nome: "+ this.nome);
		System.out.println("Endereço: " + this.endereco);
	}
}
