import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj ilość elementów tablicy: ");
        int n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Podaj elementy tablicy: ");
        for (int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }

        int max = maxElement(array, n);

        System.out.println("Największy element w tablicy to: " + max);
    }

    public static int maxElement(int[] array, int n){
        if (n == 1){
            return array[0];
        }

        int max = maxElement(array, n - 1);
        if (array[n - 1] > max){
            max = array[n - 1];
        }
        return max;
    }
}