
public class questao01 {
	private int matricula;
	private double nota1;
	private double nota2;
	private double notaTrabalho;
	
	questao01(){		
	}
	
	questao01(int matricula, double nota1, double nota2, double notaTrabalho){
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaTrabalho = notaTrabalho;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
	public void media() {
		double media = (this.nota1 + this.nota2 + this.notaTrabalho)/3;
		if (media >= 7) {
			System.out.println("Você foi aprovado");
		}else {
			System.out.println("Você foi reprovado");
		}
	}
	
	
}
