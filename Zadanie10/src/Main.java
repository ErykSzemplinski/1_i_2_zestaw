import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy macierzy: ");
        int a = scanner.nextInt();
        System.out.print("Podaj liczbę kolumn macierzy: ");
        int b = scanner.nextInt();

        int[][] matrix = new int[a][b];

        System.out.println("Podaj elementy macierzy: ");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Macierz przed transpozycją:");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpozycja macierzy:");
        for (int j = 0; j < b; j++){
            for (int i = 0; i < a; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}