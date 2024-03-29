import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Receber dados do cliente
        Random valorAleatorio = new Random(); // Gerar número aleatorio 0 a 100.

        // Variaveis atribuidas.
        int menu = 0;
        int valor = valorAleatorio.nextInt(100);
        char letraPremiada = 'D';
        int numeroPar = 0;

        //Menu do Sistema
        do {
            System.out.println("=================================");
            System.out.println("      MENU LOTO FACIL ");
            System.out.println(" 1 - Apostar de 0 a 100");
            System.out.println(" 2 - Apostar de A à Z");
            System.out.println(" 3 - Apostar em par ou ímpar");
            System.out.println(" 0 - Sair do programa");
            System.out.println("=================================");
            System.out.println(" Digite uma Opção: ");
            menu = scanner.nextInt();


            // Case para entrar dentro do paremetro escolhido, logo após excutar uma função

            switch (menu) {
                case 1:
                    System.out.println("Escolha um número:  ");
                    Scanner scanner1 = new Scanner(System.in);
                    int numeroEscolhido = scanner1.nextInt();
                    if (numeroEscolhido < 0 && numeroEscolhido > 100 || numeroEscolhido == valor) {
                        System.out.println("Você ganhou R$ 1.000,00 reais.");
                    } else {
                        System.out.println("Que pena o número sorteado foi: " + valor);
                    }
                    break;
                case 2:
                    System.out.println("Escolha uma letra entre A a Z: ");
                    try {
                        int input = System.in.read();
                        char letraDigitada = Character.toUpperCase((char) input);

                        if (Character.isLetter(input)) {
                            if (letraDigitada == letraPremiada) {
                                System.out.println("Você ganhou R$ 500,00 reais.");
                            } else {
                                System.out.println("Que pena! A letra sorteada foi: " + letraPremiada + ".");
                            }
                        } else {
                            System.out.println("Aposta inválida.");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Digite um número");
                    Scanner scanner2 = new Scanner(System.in);
                    int numeroEscolhido2 = scanner2.nextInt();
                    if (numeroEscolhido2 % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    }
                    else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;
                case 0:
                    System.out.println("Jogo Finalizado...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

            }
        } while (menu != 0);

    }


}