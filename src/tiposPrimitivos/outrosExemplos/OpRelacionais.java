package tiposPrimitivos.outrosExemplos;

public class OpRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        if(numero1 < numero2);
        System.out.println(" a condição é verdadeira"); 
        //nesse caso vc pode afirmar, pq se for falso ele não vai imprimir essa msg


        System.out.println("numero um é igual a numero dois?" + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero um é diferente de numero dois?" + simNao);
    
        simNao = numero1 > numero2;
        System.out.println("numero um é maior que numero dois?" + simNao);

        //também conseguimos verificar conteudos
        String nomeUm = "Filipe";
        //String nomeDois = "Filipe";
        String nomeDois = new String("Filipe");
     //  System.out.println(nomeUm == nomeDois); aqui temos um exemplo (básico)
        System.out.println(nomeUm.equals(nomeDois));

    }   //nos dois exemplos o resultado será verdadeiro
    
}
//os operadores relacionais auxiliam na tomada de decisão e realizam fluxo na aplicação dependendo se 
// a expressão é verdadeira, como no caso acima