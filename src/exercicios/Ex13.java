package exercicios;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o salário: ");
        double salarioAtual = scanner.nextDouble();

        double novoSalario = salarioAtual + (salarioAtual * 0.15);

        System.out.printf("O novo salário é: R$ %.2f", novoSalario);
        scanner.close();
    }
}
