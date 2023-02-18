package exerciciosCondicionais;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double distancia, preco;

        System.out.print("Digite a distância da viagem em km: ");
        distancia = scan.nextDouble();

        if (distancia <= 200) {
            preco = distancia * 0.5;
        } else {
            preco = distancia * 0.45;
        }

        System.out.printf("O preço da passagem é R$ %.2f", preco);

        scan.close();
    }
    
}
