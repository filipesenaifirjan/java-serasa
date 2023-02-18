package exercicios;
import javax.swing.JOptionPane;
public class Desafio {
    public static void main(String[] args) {
        
        
        int CigarrosPorDia = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cigarros fumados diariamente: "));
        int anosFumando = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de anos fumando: "));
        
        
        int totalCigarros = CigarrosPorDia * 365 * anosFumando;
        int tempoPerdidoEmMin = totalCigarros * 10;
        int diasPerdidos = tempoPerdidoEmMin / (60 * 24);
        
        
        JOptionPane.showMessageDialog(null, "O fumante perdeu " + diasPerdidos + " dias de vida." );
    }
}
