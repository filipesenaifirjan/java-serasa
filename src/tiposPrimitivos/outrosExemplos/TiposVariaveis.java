package tiposPrimitivos.outrosExemplos;


public class TiposVariaveis {
    public static void main(String[] args) {
    int idade = 40;
    double altura = 1.77;
    float peso = 74.5f;//nesse caso está em libras, para utilizar em kilogramas, precisamos usar o peso = scanner.nextFloat(); neste ex com scanner e peso = Float.parseFloat(input); com JOptionPane
    boolean ehEstudante = true;
    char primeiraLetra = 'F';
    String nomeCompleto = "Filipe de Mattos";
    byte mesesDoAno = 12; 
    short quantidadeDeLivrosLidos = 51;
    long populacaoDoBrasil = 213_000_000L; //espaço com _ 
    int idadeEmMeses = 500;
    

    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    System.out.println("Peso: " + peso);
    System.out.println("É estudante: " + ehEstudante);
    System.out.println("Primeira letra: " + primeiraLetra);
    System.out.println("Nome completo: " + nomeCompleto);
    System.out.println("Meses do ano: " + mesesDoAno);
    System.out.println("Quantidade de livros lidos: " + quantidadeDeLivrosLidos);
    System.out.println("População do Brasil: " + populacaoDoBrasil);
    System.out.println("Idade em meses: " + idadeEmMeses);
}
}
// O ponto mais relevante em compreender a definição dos tipos de dados é o momento da definição do tipo para uma variável

//seguindo as convenções de linguagens de programação, toda variável é composta por: tipo de dados + identificação e em alguns casos, valor atribuído