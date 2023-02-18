package tiposPrimitivos.outrosExemplos;

public class OpLogico {
    public static void main(String[] args) {
        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("Se os dois fossem verdadeiros, essa mensagem ia aparecer");
      
      //System.out.println("viu?");   //comprovando a msg de cima 
        }
      if(condicao1 || condicao2)
        System.out.println("Se um dos dois for verdadeiro, essa mensagem vai aparecer");
    }
    
    }
    