import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar pierwszej tablicy: ");
        int n = scanner.nextInt();
        System.out.print("Podaj rozmiar drugiej tablicy: ");
        int m = scanner.nextInt();

        if (n <= 0 || m <= 0){
            System.out.println("BŁĄD");
            return;
        }

        int[] A = new int[n];
        int[] B = new int[m];

        System.out.println("Podaj " + n + " liczb do pierwszej tablicy:");
        for (int i = 0; i < n; i++){
            A[i] = scanner.nextInt();
        }

        System.out.println("Podaj " + m + " liczb do drugiej tablicy:");
        for (int i = 0; i < m; i++){
            B[i] = scanner.nextInt();
        }

        int iloczynSkalarny = 0;
        if (n < m){
            for (int i = 0; i < n; i++){
                iloczynSkalarny += A[i] * B[i];
            }
        } else{
            for (int i = 0; i < m; i++){
                iloczynSkalarny += A[i] * B[i];
            }
        }

        System.out.println("Iloczyn skalarny: " + iloczynSkalarny);
    }
}