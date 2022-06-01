import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = in.next();

        System.out.println("e qual é a sua idade? ");
        int idade = in.nextInt();

        System.out.println("Olá " + nome + ", sua idade é " + idade + " anos.");
    }
}