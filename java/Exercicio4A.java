import java.util.Scanner;

public class Exercicio4A {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("qual o valor do primeiro lado? ");
        double a = in.nextInt();

        System.out.println("e do segundo? ");
        double b = in.nextInt();

        double area = a * b;

        System.out.println("a area do retangulo e: " + area);

    }
}