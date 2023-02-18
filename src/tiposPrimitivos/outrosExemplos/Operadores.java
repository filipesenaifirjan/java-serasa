package tiposPrimitivos.outrosExemplos;

public class Operadores {
    public static void main(String[] args){
        int numero = 5;

        numero++;
       // numero = numero + 1; aqui temos outro exemplo
        System.out.println(numero); // o numero++ não pode ficar aqui dentro pq primeiro ele imprime o numero e depois incrementa o ++, nesse caso, tem que ser declarado antes, então se quiser fazer por aqui tem que ser ( ++ numero );
    }
}
//aqui temos um exemplo de operador de incremento