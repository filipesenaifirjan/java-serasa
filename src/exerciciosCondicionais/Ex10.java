import javax.swing.JOptionPane;
public class Ex10 {
	

	

	    public static void main(String[] args) {
	        
	       
	        String numeroStr = JOptionPane.showInputDialog(null, "Informe um número para gerar a tabuada:");
	        int numero = Integer.parseInt(numeroStr);
	        
	        
	        String mensagem = "Tabuada de multiplicação do " + numero + ":\n\n";
	        
	        
	        for (int i = 1; i <= 10; i++) {
	            
	           
	            int resultado = numero * i;
	            mensagem += numero + " x " + i + " = " + resultado + "\n";
	        }
	        
	       
	        JOptionPane.showMessageDialog(null, mensagem);
	    }
	}
