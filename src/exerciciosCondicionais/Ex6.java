package exerciciosCondicionais;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
public class Ex6 {
    public static void main(String[] args) {
        String anoNascimentoStr = JOptionPane.showInputDialog("Digite o ano de nascimento:");
        int anoNascimento = Integer.parseInt(anoNascimentoStr);

        LocalDate dataAtual = LocalDate.now();
        int idade = Period.between(LocalDate.of(anoNascimento, 1, 1), dataAtual).getYears();

        if (idade < 18) {
            int anosFaltantes = 18 - idade;
            JOptionPane.showMessageDialog(null, "Faltam " + anosFaltantes + " anos para o alistamento militar.");
        } else if (idade == 18) {
            JOptionPane.showMessageDialog(null, "É preciso se alistar este ano.");
        } else {
            int anosPassados = idade - 18;
            JOptionPane.showMessageDialog(null, "Já se passaram " + anosPassados + " anos do alistamento militar.");
        }
    }
}
