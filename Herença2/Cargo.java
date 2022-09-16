
public class Cargo {
	private String nomeCargo;
	private double salario;
	
	Cargo(){}
	
	Cargo(String nome, double valor){
		this.nomeCargo = nome;
		this.salario = valor;
	}
	
	public void aumentoSalario(double valor) {
		this.salario += valor;	
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
