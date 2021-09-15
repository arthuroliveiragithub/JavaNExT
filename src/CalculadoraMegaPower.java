import java.util.Scanner;

public class CalculadoraMegaPower {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        int opcaoMenu = 0;
        int a = 0;
        int b = 0;

        do {
            System.out.println("Por favor, escolha uma das opções:");
            System.out.println("(1) - Sair");
            System.out.println("(2) - Somar");
            System.out.println("(3) - Subtrair");
            System.out.println("(4) - Multiplicar");
            System.out.println("(5) - Dividir");

            opcaoMenu = leTeclado.nextInt();

            switch (opcaoMenu) {
                case 1:
                    break;
                case 2:
                    System.out.println("Digite dois números:");
                    a = leTeclado.nextInt();
                    b = leTeclado.nextInt();
                    System.out.println("O resultado da soma é: " + (a + b) + ".");
                    break;
                case 3:
                    System.out.println("Digite dois números:");
                    a = leTeclado.nextInt();
                    b = leTeclado.nextInt();
                    System.out.println("O resultado da subtração é: " + (a - b) + ".");
                    break;
                case 4:
                    System.out.println("Digite dois números:");
                    a = leTeclado.nextInt();
                    b = leTeclado.nextInt();
                    System.out.println("O resultado da multiplicação é: " + (a * b) + ".");
                    break;
                case 5:
                    System.out.println("Digite dois números:");
                    a = leTeclado.nextInt();
                    b = leTeclado.nextInt();
                    System.out.println("O resultado da divisão é: " + (a / b) + ".");
                    break;
                default:
                    System.out.println(("Digite uma opção válida."));
            }
        } while(opcaoMenu != 1);
    }
}
