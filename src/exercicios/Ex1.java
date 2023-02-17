package exercicios;
/*1) Escreva um programa que mostre na tela a mensagem"Olá, Mundo!" */
import java.util.Scanner;
public class Ex1 {
    
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Olá, " + nome + "! Bem-vindo(a)!");
        scanner.close();
        }
    }