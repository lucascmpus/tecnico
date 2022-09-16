import java.util.Arrays;
import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // Arrays
        String[] nomes = new String[6];
        char[] sexo = new char[6];
        double[] salario = new double[6];

        // Variaveis
        int qtdM = 0;
        int qtdF = 0;
        double salarioMasc = 0;
        double salarioFem = 0;
        double mediaMasc = 0;
        double mediaFem = 0;
        double maiorSalarioMasc = 0;
        double menorSalarioFem = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o [" + i + "] nome: ");
            nomes[i] = entrada.next();
            System.out.print("Digite o [" + i + "] sexo(m,f): ");
            sexo[i] = entrada.next().charAt(0);
            System.out.print("Digite o [" + i + "] salario: ");
            salario[i] = entrada.nextDouble();

            // quantidade de funcionarios por sexo
            if (sexo[i] == 'f') {
                qtdF++;
            } else {
                qtdM++;
            }
            // Media dos salarios
            if (sexo[i] == 'f') {
                salarioFem += salario[i];
            } else {
                salarioMasc += salario[i];
            }
            // Maior salário de um funcionario masculino
            if (sexo[i] == 'm') {
                maiorSalarioMasc = salario[i];
            }
            if (salario[i] > maiorSalarioMasc) {
                maiorSalarioMasc = salario[i];
            }
            // Menor salario funcionaria feminina
            if (sexo[i] == 'f') {
                menorSalarioFem = salario[i];
            }
            if (salario[i] < menorSalarioFem) {
                menorSalarioFem = salario[i];
            }
        }
        // Médias
        mediaFem = salarioFem / qtdF;
        mediaMasc = salarioMasc / qtdM;

        // Prints
        System.out.println("Nomes: " + Arrays.toString(nomes));
        System.out.println("Sexo: " + Arrays.toString(sexo));
        System.out.println("Salário: " + Arrays.toString(salario));
        System.out.println("Quantidade F: " + qtdF);
        System.out.println("Quantidade M: " + qtdM);
        System.out.println("Média Feminina: " + mediaFem);
        System.out.println("Média Masculina: " + mediaMasc);
        Arrays.sort(salario);
        double salarioMax = salario[0];
        double salarioMin = salario[6];
        System.out.println("Salário máximo: " + salarioMax);
        System.out.println("Salário mínimo: " + salarioMin);

        entrada.close();
    }
}
