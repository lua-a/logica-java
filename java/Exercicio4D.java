import java.util.Scanner;

public class Exercicio4D {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("qual o valor da base maior ? ");
        double a = in.nextInt();

        System.out.println("e a menor ? ");
        double b = in.nextInt();

         System.out.println("e a altura ? ");
        double c = in.nextInt();


        double area = ((a + b) * c)/2;

        System.out.println("a area do trapezio e: " + area);

    }
}