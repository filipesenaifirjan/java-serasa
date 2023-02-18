package exercicios;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma distância em metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros * 100;
        double decimetros = metros * 10;
        double quilometros = metros / 1000;
        System.out.println("A distância de " + metros + " metros corresponde a:");
        System.out.println(centimetros + " centímetros");
        System.out.println(decimetros + " decimetros");
        System.out.println(quilometros + " quilômetros");
        
        scanner.close();
    }
}
