import java.util.Scanner;

public class Exercicio4E {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("qual o valor da base? ");
        double a = in.nextInt();

        System.out.println("e da altura? ");
        double b = in.nextInt();

        double area = a * b;

        System.out.println("a area do paralelogramo e: " + area);

    }
}