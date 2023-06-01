import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dwa ciągi tekstowe oddzielone spacją: ");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        String napis1 = parts[0];
        String napis2 = parts[1];

        String koncowyNapis = napis2 + " " + napis1;

        System.out.printf(koncowyNapis);
    }
}
