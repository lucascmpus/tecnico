
public class Funcionario extends Pessoa{
	private int matricula;
	private Cargo cargo;

	
	Funcionario(Pessoa pes, int matricula){
		super(pes.getNomePessoa(), pes.getIdadePessoa());
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
		
}
