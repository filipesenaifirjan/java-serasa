package exercicios;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o preço: ");
        double precoOriginal = scan.nextDouble();

        double precoPromocional = precoOriginal - (precoOriginal * 0.05);

        System.out.printf("O preço promocional é: R$ %.2f", precoPromocional);
        scan.close();
    }
}
