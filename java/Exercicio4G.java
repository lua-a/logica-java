import java.util.Scanner;

public class Exercicio4G {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("qual o valor do raio? ");
        double a = in.nextInt();

        double area = 3.14 * (a * a);

        System.out.println("a area do circulo e: " + area);

    }
}