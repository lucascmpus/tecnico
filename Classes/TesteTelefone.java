
public class TesteTelefone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefone telebahia = new Telefone();
		telebahia.FazerLigacacao();
		telebahia.AtenderLigacao();
		
		
		Celular maxitel = new Celular();
		maxitel.FazerLigacacao();
		maxitel.EnviarEmail("bala@baloso.com");
		maxitel.enviarSMS("SMSSSS");
	}

}
