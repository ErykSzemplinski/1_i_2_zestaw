import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku a:");
        double a = scanner.nextDouble();
        System.out.println("Podaj długość boku b:");
        double b = scanner.nextDouble();
        double pole = a * b;
        System.out.println("Pole prostokąta o podanych bokach wynosi " + pole);
    }
}