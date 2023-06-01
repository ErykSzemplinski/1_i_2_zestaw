import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj numer miesiąca:");
        int numerMiesiaca = scanner.nextInt();

        String nazwaMiesiaca = "";
        int liczbaDni = 0;

        switch (numerMiesiaca){
            case 1:
                nazwaMiesiaca = "Styczeń";
                liczbaDni = 31;
                break;
            case 2:
                nazwaMiesiaca = "Luty";
                liczbaDni = 28;
                break;
            case 3:
                nazwaMiesiaca = "Marzec";
                liczbaDni = 31;
                break;
            case 4:
                nazwaMiesiaca = "Kwiecień";
                liczbaDni = 30;
                break;
            case 5:
                nazwaMiesiaca = "Maj";
                liczbaDni = 31;
                break;
            case 6:
                nazwaMiesiaca = "Czerwiec";
                liczbaDni = 30;
                break;
            case 7:
                nazwaMiesiaca = "Lipiec";
                liczbaDni = 31;
                break;
            case 8:
                nazwaMiesiaca = "Sierpień";
                liczbaDni = 31;
                break;
            case 9:
                nazwaMiesiaca = "Wrzesień";
                liczbaDni = 30;
                break;
            case 10:
                nazwaMiesiaca = "Październik";
                liczbaDni = 31;
                break;
            case 11:
                nazwaMiesiaca = "Listopad";
                liczbaDni = 30;
                break;
            case 12:
                nazwaMiesiaca = "Grudzień";
                liczbaDni = 31;
                break;
            default:
                System.out.println("BŁĄD");
                break;
        }

        if (nazwaMiesiaca != ""){
            System.out.println(nazwaMiesiaca + " ma " + liczbaDni + " dni");
        }
    }
}