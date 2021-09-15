import java.util.Scanner;

public class AreaDoTrianguloPorHeron {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        System.out.println("Digite os lados do triângulo:");
        Scanner leteclado = new Scanner(System.in);
        t1.l1 = leteclado.nextDouble();
        t1.l2 = leteclado.nextDouble();
        t1.l3 = leteclado.nextDouble();
        System.out.println("A área do triângulo com lados " + t1.l1 + ", " + t1.l2 + " e " + t1.l3 + " é " + t1.calculaArea());
    }
}
