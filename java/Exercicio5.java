import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("digite um numero: ");
        double a = in.nextInt();

        if (a > 0) {
            System.out.println("positivo");
        }
        else if (a < 0) {
            System.out.println("negativo");
        }
        else {
            System.out.println(0);
        }

    }
}