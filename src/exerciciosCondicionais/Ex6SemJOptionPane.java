package exerciciosCondicionais;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Ex6SemJOptionPane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        sc.close();

        LocalDate dataAtual = LocalDate.now();
        int idade = Period.between(LocalDate.of(anoNascimento, 1, 1), dataAtual).getYears();

        if (idade < 18) {
            int anosFaltantes = 18 - idade;
            System.out.println("Faltam " + anosFaltantes + " anos para o alistamento militar.");
        } else if (idade == 18) {
            System.out.println("É preciso se alistar este ano.");
        } else {
            int anosPassados = idade - 18;
            System.out.println("Já se passaram " + anosPassados + " anos do alistamento militar.");
        }
    }
    
}
