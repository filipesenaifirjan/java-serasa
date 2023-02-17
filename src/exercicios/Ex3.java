package exercicios;

import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual seu salário?"));
        JOptionPane.showMessageDialog(null, "olá " + nome + "é um prazer te conhecer!" + "\n seu salário digitado foi: " + salario) ;
    }
}
