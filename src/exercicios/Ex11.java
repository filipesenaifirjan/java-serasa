package exercicios;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scan.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scan.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scan.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.printf("O valor de delta é: %.2f", delta);
        
        scan.close();
       

    }
    
}
