
public class Onibus extends Veiculo {
	private int assentos;
	
	Onibus(String placa, int ano, int assentos){
		super(placa,ano);
		this.assentos = assentos;
	}
	
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Assentos: " + this.assentos);
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
}
