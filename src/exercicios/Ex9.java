package exercicios;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        final double TAXA_DE_CAMBIO = 3.45; // taxa de câmbio fixa
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em reais (R$): ");
        double reais = scanner.nextDouble();
        double dolares = reais / TAXA_DE_CAMBIO;
        System.out.printf("Com R$%.2f você pode comprar US$%.2f.", reais, dolares);
        scanner.close();
    }
}
