
public class TesteMoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moto biz = new Moto();
		
		biz.lerDados();
		biz.mostrarDados();
		System.out.println("vrum vrum vrum");
		biz.Acelerar(100);
		biz.Desacelerar(20);
		biz.mostrarDados();
		biz.Parar();
		System.out.println("Velocidade atual: "+biz.velocidade);
	}

}
