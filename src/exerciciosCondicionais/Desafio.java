package exerciciosCondicionais;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double a, b, c;

    System.out.print("Digite o tamanho da primeira reta: ");
    a = entrada.nextDouble();

    System.out.print("Digite o tamanho da segunda reta: ");
    b = entrada.nextDouble();

    System.out.println("Digite o tamanho da terceira reta: ");
    c = entrada.nextDouble();

    if ((a < b + c) && (b < a + c) && (c < a + b)) {
        System.out.println("As retas formam um triângulo.");
    } else {
        System.out.println("As retas não formam um triângulo.");
    }

    entrada.close();
}
}

