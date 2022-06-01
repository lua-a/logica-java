import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("digite um numero: ");
        double a = in.nextInt();

        System.out.println("digite outro: ");
        double b = in.nextInt();

        while (b <= 0) {
            System.out.println("digite outro: ");
            b = in.nextInt();;
        }

        System.out.println(a/b);

    }
}