package lista01;

public class questao09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anoP,mesP,diaP,ano,mes,diasFinal;
		
		ano = 365;
		mes = 30;
		
		anoP = 24;
		mesP = 4;
		diaP = 0;
		
		diasFinal = (ano*anoP) + (mes * mesP) + diaP;
		System.out.println("Você tem " + diasFinal + " dias");
	}

}
