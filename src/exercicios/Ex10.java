package exercicios;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        final int METROS_POR_LITRO = 2; 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a largura da parede em metros: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura da parede em metros: ");
        double altura = scanner.nextDouble();
        double area = largura * altura;
        double litrosDeTinta = area / METROS_POR_LITRO;
        System.out.printf("A área a ser pintada é de %.2f metros quadrados.%n", area);
        System.out.printf("Serão necessários %.2f litros de tinta para cobrir a parede.", litrosDeTinta);
        scanner.close();
    }
}
    

