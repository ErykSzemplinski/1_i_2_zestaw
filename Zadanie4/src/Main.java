import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj bok a: ");
        double a = input.nextDouble();
        System.out.print("Podaj bok b: ");
        double b = input.nextDouble();
        System.out.print("Podaj bok c: ");
        double c = input.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("BŁĄD");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Tak, z podanych boków można zbudować trójkąt.");
        } else {
            System.out.println("Nie, z podanych boków nie można zbudować trójkąt.");
        }
    }
}
