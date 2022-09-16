import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade = 0;
        int idade18 = 0;
        int idade10 = 0;
        int idadeMaior = 0;

        for (int i = 0; i < 10; i++) {
            int idadeInd = entrada.nextInt();
            idade += idadeInd;

            if (i == 0) {
                idadeMaior = idadeInd;
            }

            if (idadeInd > idadeMaior) {
                idadeMaior = idadeInd;
            }

            if (idadeInd > 18) {
                idade18++;
            }

            if (idadeInd < 10) {
                idade10++;
            }
        }
        idade = idade / 10;

        System.out.println("Média de idade: " + idade);
        System.out.println("Maiores de 18 anos: " + idade18);
        System.out.println("Menores de 10 anos: " + idade10);
        System.out.println("A maior idade é: " + idadeMaior);
        entrada.close();
    }
}
