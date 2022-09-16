
public class Veiculo {
	private String placa;
	private int ano;
	
	Veiculo(){}
	
	Veiculo(String placa, int ano){
		this.placa = placa;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void mostrarDados() {
		System.out.println();
		System.out.println("Placa: " + this.placa);
		System.out.println("Ano: " + this.ano);
	}

}
