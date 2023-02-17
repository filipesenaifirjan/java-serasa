package exercicios;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();
        double dobro = numero * 2;
        double tercaParte = numero / 3;
        System.out.println("O dobro de " + numero + " é " + dobro + " E a terça parte de " + numero + " é " + tercaParte);
        
        scanner.close();
    }
}
