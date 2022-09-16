
public class TesteVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onibus onb1 = new Onibus("NFT2020", 2002, 2);
		onb1.mostrarDados();
		
		System.out.println();
		
		MicroOnibus microOnb = new MicroOnibus("NFT2020", 2003, 4, 2);
		microOnb.mostrarDados();
	
		System.out.println();
		
		Caminhao camin = new Caminhao("NFT22", 2001, 3);
		camin.mostrarDados();
		
	}

}
