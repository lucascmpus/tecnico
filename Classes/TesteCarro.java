
public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro fusca = new Carro();
		fusca.altura = 1.4;
		fusca.velocidadeMaxima = 200;
		fusca.cor = "Preto";
		
		fusca.AndarParaFrente();
		fusca.AndarParaTras();
		fusca.Parar();
		fusca.Buzinar();
		
		System.out.println("Velocidade máxima é de: "+fusca.velocidadeMaxima);
		
		Carro ferrari = new Carro();
		ferrari.velocidadeMaxima = 2000;
		System.out.println("Velocidade maxima de: ");
	}

}
