import java.util.Scanner;

public class JavaEx2 {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número real: ");
        double real1 = leTeclado.nextDouble();

        System.out.println("Digite o segundo número real: ");
        double real2 = leTeclado.nextDouble();

        double soma = real1 + real2;
        double media = soma/2;

        System.out.println("A média desses números é igual a " + media);
    }


}
