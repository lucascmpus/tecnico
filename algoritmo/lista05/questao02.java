import java.util.Scanner;

public class questao02 {
    
    public static void Menu(){
        System.out.println("#### MENU ####");
        System.out.println("1 - EXIBIR OI");
        System.out.println("2 - CONTINUAR NO MENU");
        System.out.println("3 - SAIR");
    }

    public static int Opcao(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Opção: ");
        return entrada.nextInt();
    }
        
    public static void Case(int n1){
        switch(n1){
            case 1:
            System.out.println("Oi fulano");
            Menu();
            break;

            case 2:
            Menu();
            break;

            case 3:
            break;
        }
    }

    public static void main(String[]args){
        Menu();
        int option = Opcao();

        while(option != 3){
            Case(option);
            option = Opcao();
        }
    }
}
