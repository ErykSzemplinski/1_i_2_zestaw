import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = sc.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = sc.nextInt();
        sc.close();

        if (Zaprzyjaznione(a, b)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    public static boolean Zaprzyjaznione(int a, int b) {
        int sumaA = 0;
        int sumaB = 0;

        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sumaA += i;
            }
        }

        for (int i = 1; i <= b / 2; i++) {
            if (b % i == 0) {
                sumaB += i;
            }
        }

        return (sumaA == b && sumaB == a);
    }
}
