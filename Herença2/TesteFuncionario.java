
public class TesteFuncionario {
	
	public static void mostrarDados(Funcionario fun) {
		System.out.println("Nome: " + fun.getNomePessoa());
		System.out.println("Idade: " + fun.getIdadePessoa());
		System.out.println("Matricula: " + fun.getMatricula());
		System.out.println("Cargo:" + fun.getCargo().getNomeCargo());
		System.out.println("Salario: " + fun.getCargo().getSalario());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo gerente = new Cargo("Gerente", 1000);
		Pessoa fulano = new Pessoa("Fulaninho", 12);
		Funcionario trabalhador = new Funcionario(fulano, 20);
		
		trabalhador.setCargo(gerente);
		mostrarDados(trabalhador);
		
	}

}
