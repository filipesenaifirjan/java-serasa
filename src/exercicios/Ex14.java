package exercicios;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o km do carro: ");
        double km = scan.nextDouble();
        
        System.out.print("Digite o numero de dias de aluguel: ");
        int dias = scan.nextInt();
        
        double precoTotal = (dias * 90) + (km * 0.20);
        
        System.out.printf("Preço total: R$ %.2f", precoTotal);
        
        scan.close();
    }
    
}
