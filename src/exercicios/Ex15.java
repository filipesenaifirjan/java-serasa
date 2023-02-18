package exercicios;
import javax.swing.JOptionPane;
public class Ex15 {
    public static void main(String[] args) {
        String diasTrabalhadosStr = JOptionPane.showInputDialog("digite o numero de dias trabalhados:");
        int diasTrabalhados = Integer.parseInt(diasTrabalhadosStr);
        
        int horasTrabalhadas = diasTrabalhados * 8;
        double salario = horasTrabalhadas * 25.0;
        
        JOptionPane.showMessageDialog(null, String.format("Salário do funcionário: R$ %.2f", salario));
    }
    
}
