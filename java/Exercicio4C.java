import java.util.Scanner;

public class Exercicio4C {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("qual o valor da diagona maior ? ");
        double a = in.nextInt();

        System.out.println("e a menor ? ");
        double b = in.nextInt();


        double area = (a * b)/2;

        System.out.println("a area do losango e: " + area);

    }
}