import java.util.Scanner;

public class Exercicio4B {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("qual o valor do lado? ");
        double a = in.nextInt();


        double area = a * a;

        System.out.println("a area do quadrado e: " + area);

    }
}