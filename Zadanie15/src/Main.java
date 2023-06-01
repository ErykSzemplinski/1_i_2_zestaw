import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyrażenie nawiasowe:");
        String wyrazenie = scanner.nextLine();
        if (zgodne(wyrazenie)){
            System.out.println("Tak, to poprawne wyrażenie nawiasowe");
        }
        else{
            System.out.println("Nie, to niepoprawne wyrażenie nawiasowe");
        }
    }

    public static boolean zgodne(String wyrazenie){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < wyrazenie.length(); i++){
            char c = wyrazenie.charAt(i);
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            else if (c == '}' || c == ']' || c == ')'){
                if (stack.empty()){
                    return false;
                }
                else if (c == '}' && stack.peek() == '{' ||
                        c == ']' && stack.peek() == '[' ||
                        c == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}