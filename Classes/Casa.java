
public class Casa {
	private String endereco;
	private String cidade;
	private int quantQuartos;
	private int quantBanheiros;
	private int quantSalas;
	private double areaConstruida;
	
	Casa() {
		this.cidade =  "Salvador";
		this.quantBanheiros = 1;
		this.quantQuartos = 1;
		this.quantSalas = 1;
	}
	
	Casa(String end){
		endereco = end;
	}
	
	public void MostrarCasa() {
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Quant quartos: " + this.quantQuartos);
		System.out.println("Quant banheiros: " + this.quantBanheiros);
		System.out.println("Quant salas: " + this.quantSalas);
		System.out.println("Area construida: " + this.areaConstruida);
	}
	
}
