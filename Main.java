import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
        char ch;
        ch = 'X';
        System.out.println("ch contains " + ch);
        ch++; //incrementa ch
        System.out.println("ch is now " + ch);
        ch = 90; // dá a ch valor Z
        System.out.println("ch is now " + ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println(" Valor do tipoShort = " + tipoShort);
        System.out.println(" Valor do tipoChar = " + tipoChar);
        System.out.println(" Valor do tipoFloat = " + tipoFloat);
        System.out.println(" Valor do tipoDouble = " + tipoDouble);
        System.out.println(" Valor do tipoInt = " + tipoInt);
        System.out.println(" Valor do tipoLong = " + tipoLong);
        System.out.println(" Valor do tipoBooleano = " + tipoBooleano);
        System.out.println("Exemplo do while");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("******** Sistema de Cadastro ********");
            System.out.println("Opção 1: Cadastrar cliente");
            System.out.println("Opção 2: Cadastrar produto");
            System.out.println("Opção 3: Cadastrar vendedor");
            System.out.println("Opção 0: Sair");
            System.out.println("**************************************");
            System.out.print("Digite a opção: ");
            opcao = in.nextInt();
            System.out.println("**************************************");
            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhida.");
                    // cadastrar Cliente();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida.");
                    // cadastrar Produto();
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida.");
                    // cadastrar Vendedor();
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida.");
                    // Sair();
                    break;
                default:
                    System.out.println("O número escolhido é inválido!");
            }
        }while(opcao != 0);
    }


}