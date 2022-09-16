import java.util.Scanner;

public class questao03 {

	public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano em que nasceu: ");

        int anoAtual = 2022;
        int anoPessoa = input.nextInt();

        int idade = anoAtual - anoPessoa;

        if(idade > 16){
            System.out.println("Você pode votar");
        } else if (idade >= 18) {
            System.out.println("Você é obrigado a votar");
        } else {
            System.out.println("Você não pode votar");
        }

        input.close();

	}

}
