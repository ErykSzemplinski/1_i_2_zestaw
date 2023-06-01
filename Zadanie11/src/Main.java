import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String text = scanner.nextLine();

        boolean Pangram = Pangram(text.toLowerCase());
        System.out.println(Pangram);
    }

    public static boolean Pangram(String text){
        Set<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (Character.isLetter(c)){
                uniqueChars.add(c);
            }
        }
        return uniqueChars.size() == 26;
    }
}