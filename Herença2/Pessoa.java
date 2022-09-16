
public class Pessoa {
	private String nomePessoa;
	private int idadePessoa;
	
	Pessoa(String nome, int idade){
		this.nomePessoa = nome;
		this.idadePessoa = idade;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public int getIdadePessoa() {
		return idadePessoa;
	}

	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
	
	
}
