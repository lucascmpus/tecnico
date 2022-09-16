
public class Caminhao extends Veiculo{
	private int eixos;
	
	Caminhao(String placa, int ano, int eixo){
		super(placa, ano);
		this.eixos = eixo;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public void mostrarDados() {
		System.out.println("PLACA CAMINHAO: " + this.getPlaca());
		System.out.println("ANO CAMINHAO: " + this.getAno());
		System.out.println("Eixos: " + this.eixos);
	}	
}
