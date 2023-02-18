package exerciciosCondicionais;


import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        String anoNascimentoStr = JOptionPane.showInputDialog("Digite o ano de nascimento:");

        int anoNascimento = Integer.parseInt(anoNascimentoStr);
        int idade = 2023 - anoNascimento;

        if (idade < 16) {
            JOptionPane.showMessageDialog(null, "Você não pode votar.");
        } else if (idade >= 18 && idade < 70) {
            JOptionPane.showMessageDialog(null, "Você pode votar.");
        } else {
            JOptionPane.showMessageDialog(null, "Seu voto é opcional.");
        }
    }
    }
    

