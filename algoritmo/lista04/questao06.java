import java.util.Arrays;
import java.util.Random;

public class questao06 {
    public static void main(String[]args){
        int[] vetor = new int [10];
        Random gerador = new Random();
        int[] par = new int[10];
        int[] impar = new int[10];

        int qtdImpar = 0, qtdPar = 0;

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = gerador.nextInt(0,50);
        }

        for(int i = 0; i < vetor.length; i++){
            if (vetor [i] % 2 == 0){
                par[qtdPar] = vetor[i];
                qtdPar++;
            } else {
                impar[qtdImpar] = vetor[i];
                qtdImpar++;
            }
        }
        System.out.println(Arrays.toString(vetor));
        System.out.println(Arrays.toString(impar));
        System.out.println(Arrays.toString(par));
    }
}
