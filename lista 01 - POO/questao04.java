
public class questao04 {
	private int andarAtual;
	private int totalAndares;
	private int capacidadeElevador;
	private int capacidadeAtual;
	
	questao04(){	}
	
	questao04(int capacidade, int total){
		this.andarAtual = 0;
		this.totalAndares = total;
		this.capacidadeElevador = capacidade;
		this.capacidadeAtual = 0;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getCapacidadeAtual() {
		return capacidadeAtual;
	}

	public void setCapacidadeAtual(int capacidadeAtual) {
		this.capacidadeAtual = capacidadeAtual;
	}
	
	public void entrarPessoa() {
		if (capacidadeAtual >= capacidadeElevador) {
			System.out.println("Capacidade máxima");
		} else {			
			this.capacidadeAtual += 1;
			System.out.println("Entrou uma pessoa, quantidade atual de pessoas no elevador é de: " + this.capacidadeAtual);
		}
	}
	
	public void sairPessoa() {
		if (capacidadeAtual>0) {
			this.capacidadeAtual -= 1;
			System.out.println("Capacidade atual: " +  this.capacidadeAtual);
		} else {
			System.out.println("Elevador vázio");
		}
	}
	
	public void SubirOuDescer(int a) {
		if(a < this.andarAtual) {
			this.andarAtual = a;
			System.out.println("Você desceu para o andar " + a);
		}else if (a> this.andarAtual & a<this.totalAndares) {
			this.andarAtual = a;
			System.out.println("Você subiu para o andar " + a);
		}
	}

	public void mostrar() {
		System.out.println("Andar atual: " +this.andarAtual);
		System.out.println("Pessoas: " + this.capacidadeAtual);
	}
	
}
