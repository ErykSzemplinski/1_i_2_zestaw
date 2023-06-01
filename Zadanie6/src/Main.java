import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj trzy liczby rzeczywiste:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double min = a;
        double mid = b;
        double max = c;
        if (b < min){
            min = b;
            mid = a;
        }
        if (c < min){
            min = c;
            mid = a;
            max = b;
        }
        if (c < mid && c >= min){
            mid = c;
            max = b;
        }
        if (b > max){
            max = b;
            mid = c;
        }
        if (a > max){
            max = a;
            mid = b;
            min = c;
        }
        if (a > mid && a <= max){
            mid = a;
            min = c;
        }

        System.out.println("Liczby w kolejności od najmniejszej do największej:");
        System.out.printf("%.6f%n", min);
        System.out.printf("%.6f%n", mid);
        System.out.printf("%.6f%n", max);

        System.out.println("Liczby w kolejności od największej do najmniejszej:");
        System.out.printf("%.6f%n", max);
        System.out.printf("%.6f%n", mid);
        System.out.printf("%.6f%n", min);
    }
}
