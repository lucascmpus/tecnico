
public class Celular extends Telefone {
	public String formaTeclado;
	public double cargaBateria;
/*
	public void FzerLigacao() {
		System.out.println("Ligação do zap");
	}
	
	public void AtenderLigacao() {
		System.out.println("Fala zé");
	}
*/
	public void enviarSMS(String texto) {
		System.out.println("SMS: "+ texto);
	}
	
	public void EnviarEmail(String destino) {
		System.out.println("Email: \nPara:"+destino);
	}
}
