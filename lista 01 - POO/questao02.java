
public class questao02 {
	
	private String nomeFuncionario;
	private int matricula;
	private double salario;
	
	questao02(){	}
	
	questao02(String nome, int matricula, double salario){
		this.nomeFuncionario = nome;
		this.matricula = matricula;
		this.salario = salario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void receberAumento(double x) {
		this.salario += x;		
	}
	
	public double calcularGanhoBrutoAnual() {
		return this.salario*12;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + this.nomeFuncionario);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Salario: " +this.salario);
		System.out.println("Salário bruto anual: " + calcularGanhoBrutoAnual());
		
	}
}
