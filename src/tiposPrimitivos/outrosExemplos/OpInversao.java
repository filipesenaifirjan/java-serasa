package tiposPrimitivos.outrosExemplos;

public class OpInversao {
    public static void main(String[] args) {
        boolean variavel = true;

        System.out.println(!variavel); // aqui temos um exemplo de inversão no operador (salvo em memoria)
        System.out.println(variavel); //aqui mostra que ela continuar true pq não foi registrado a inversão, só foi impressa
        //vejamos
        variavel = !variavel; //aqui ela recebe (registra) a inversão
        System.out.println(variavel);
    }
    
}
