
public class Pessoa {
	
	private String nome;
	private int idade;
	private String corPreferida;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCorPreferida() {
		return corPreferida;
	}
	
	public void setCorPreferida(String corPreferida) {
		this.corPreferida = corPreferida;  
	}
	
	public void MostrarDados() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Cor preferida: " + this.corPreferida);
		
	}

	
	
}
