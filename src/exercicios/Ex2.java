package exercicios;
import javax.swing.JOptionPane;
public class Ex2 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "olá " + nome + "é um prazer te conhecer!") ;
    }
}
