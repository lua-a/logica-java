import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("digite um numero: ");
        double a = in.nextInt();

        System.out.println("digite outro: ");
        double b = in.nextInt();

        System.out.println("mais um: ");
        double c = in.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        }
        else if (b > a && b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

    }
}