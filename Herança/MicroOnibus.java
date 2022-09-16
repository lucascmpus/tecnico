
public class MicroOnibus extends Onibus {
	private int nrPortas;
	
	MicroOnibus(String placa, int ano, int assentos, int nrPortas) {
		super(placa, ano, assentos);
		this.nrPortas = nrPortas;
	}
	
	public void mostrarDados() {
		System.out.println("PLACA DO ONIBUS: " + this.getPlaca());
		System.out.println("ANO: " + this.getAno());
		System.out.println("ASSENTOS: " + this.getAssentos());
		System.out.println("NRPORTAS: " + this.nrPortas);
	}

	public int getNrPortas() {
		return nrPortas;
	}

	public void setNrPortas(int nrPortas) {
		this.nrPortas = nrPortas;
	}

}
