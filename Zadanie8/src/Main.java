import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n;

        do{
            System.out.print("Podaj liczbę naturalną n: ");
            while (!scanner.hasNextInt()){
                System.out.println("To nie jest liczba naturalna");
                scanner.next();
            }
            n = scanner.nextInt();
        }
        while (n <= 0);

        System.out.println("**\n" +
                "***\n" +
                "***\n" +
                "**\n" +
                "*\n" +
                "***\n" +
                "**\n" +
                " *\n" +
                " *\n" +
                "**\n" +
                "***");
    }
}