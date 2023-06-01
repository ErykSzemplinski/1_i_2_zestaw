import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String input = scanner.nextLine();
        char[] word = input.toCharArray();
        if (isPalindrome(word)){
            System.out.println("Tak, to słowo to palindrom.");
        }
        else{
            System.out.println("Nie, to słowo nie jest palindromem.");
        }
    }
    public static boolean isPalindrome(char[] word){
        int i = 0;
        int j = word.length - 1;
        while (i < j){
            if (word[i] != word[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}