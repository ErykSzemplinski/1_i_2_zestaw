public class TestNumbers {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(5, 8, 2);
        System.out.println("Sum: " + numbers.sum());
        System.out.println("Average: " + numbers.average());
        System.out.println("Min: " + numbers.min());
        System.out.println("Max: " + numbers.max());
        System.out.println("Geometric: " + numbers.geometric());
    }
}