import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wiek w sekundach: ");
        long wiek = scanner.nextLong();
        System.out.print("Podaj nazwę planety: ");
        String planeta = scanner.next();
        double wiekPlaneta = calculateAgeOnPlanet(wiek, planeta);
        if (wiekPlaneta >= 0) {
            System.out.printf("Wiek na planecie %s wynosi %.2f.%n", planeta, wiekPlaneta);
        } else {
            System.out.println("BŁĄD");
        }
    }

    public static double calculateAgeOnPlanet(long wiek, String planeta) {
        double wiekPlaneta = 31557600;
        switch (planeta.toLowerCase()) {
            case "merkury":
                return wiek / (0.2408467 * wiekPlaneta);
            case "wenus":
                return wiek / (0.61519726 * wiekPlaneta);
            case "ziemia":
                return wiek / wiekPlaneta;
            case "mars":
                return wiek / (1.8808158 * wiekPlaneta);
            case "jowisz":
                return wiek / (11.862615 * wiekPlaneta);
            case "saturn":
                return wiek / (29.447498 * wiekPlaneta);
            case "uran":
                return wiek / (84.016846 * wiekPlaneta);
            case "neptun":
                return wiek / (164.79132 * wiekPlaneta);
            default:
                return -1;
        }
    }
}
