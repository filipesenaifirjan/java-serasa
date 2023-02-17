package tiposPrimitivos;
import java.util.Scanner;

public class Desconto {

/* 1 - Crie uma classe que receba o valor de um produto e a 
        porcentagem de desconto, calcule e mostre o valor do desconto 
        e o valor do produto com o desconto. Observação: o valor do desconto 
        é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto / 100. */

    public static void main(String[] args){
   Scanner scan = new Scanner(System.in);

  
  
    
   System.out.println("Digite um valor do produto: ");
   double valor = scan.nextDouble();
   
   //float valor = scan.nextFloat();
   System.out.println("Digite um valor do percentual de desconto: ");
   
   double porcentagemDesconto  = scan.nextDouble();
   
   double desconto  =  valor * (porcentagemDesconto / 100);
   //float valorFinal = scan.nextFloat();
   double valorFinal = valor - desconto;
   System.out.println("o produto " + valor + " com o desconto de:" + desconto +  "  é igual a: " + valorFinal + " " );
   
        scan.close();
   
    }
}
