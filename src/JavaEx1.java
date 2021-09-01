import java.util.Scanner;

public class JavaEx1 {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = leTeclado.nextLine();

        System.out.println("Olá, " + nome + "!");
    }
}
