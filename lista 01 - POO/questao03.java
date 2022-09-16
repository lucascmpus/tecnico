
public class questao03 {
	private String marca;
	private int polegadas;
	private int canalAtual;
	private int volume;
	private int volumeMaximo;
	private int volumeMinimo;
	
	questao03(){}
	questao03(String marca, int pol, int vMax, int vMin){
		this.marca = marca;
		this.polegadas = pol;
		this.volumeMaximo = vMax;
		this.volumeMinimo = vMin;
	}
	public int getCanalAtual() {
		return canalAtual;
	}
	public void setCanalAtual(int canalAtual) {
		switch(canalAtual) {
		case(2):
			this.canalAtual = canalAtual;
			System.out.println("Você está no canal: "+this.canalAtual);
			break;
		case(4):
			this.canalAtual = canalAtual;
			System.out.println("Você está no canal: "+this.canalAtual);
			break;
		case(5):
			this.canalAtual = canalAtual;
			System.out.println("Você está no canal: "+this.canalAtual);
			break;
		case(7):
			this.canalAtual = canalAtual;
			System.out.println("Você está no canal: "+this.canalAtual);
			break;
		case(9):
			this.canalAtual = canalAtual;
			System.out.println("Você está no canal: "+this.canalAtual);
			break;
		case(11):
			this.canalAtual = canalAtual;
			System.out.println("Você está no canal: "+this.canalAtual);
			break;
		case(13):
			this.canalAtual = canalAtual;
			System.out.println("Você está no canal: "+this.canalAtual);
			break;
		case(33):
			this.canalAtual = canalAtual;
			System.out.println("Você está no canal: "+this.canalAtual);
			break;
		}
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > volumeMaximo) {
			System.out.println("Volume máximo");
		} else if (volume < volumeMinimo) {
			System.out.println("Volume mínimo");
		} else {
			this.volume = volume;	
		}
	}
	public void alterarVolume(int volume) {
		setVolume(volume);
	}
	
	public void mudarCanal(int canal) {
		setCanalAtual(canal);
	}
	
	public void mostrarDados() {
		System.out.println("TV: "+this.marca);
		System.out.println("Polegadas: "+ this.polegadas);
		System.out.println("Volume máximo: " + this.volumeMaximo);
		System.out.println("Volume mínimo: " + this.volumeMinimo);
		System.out.println("Volume atual: " + this.volume);
		System.out.println("Canal atual: "+this.canalAtual);
	}
	public void mostrarCanal() {
		System.out.println("Canal atual: "+this.canalAtual);
	}
	public void mostrarVolume() {
		System.out.println("Volume atual: " + this.volume);
	}
	
}
