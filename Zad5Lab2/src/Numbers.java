public class Numbers {
    private int number1;
    private int number2;
    private int number3;

    public Numbers(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int sum() {
        return number1 + number2 + number3;
    }

    public double average() {
        return sum() / 3.0;
    }

    public int min() {
        return Math.min(number1, Math.min(number2, number3));
    }

    public int max() {
        return Math.max(number1, Math.max(number2, number3));
    }

    public double geometric() {
        return Math.pow(number1 * number2 * number3, 1.0 / 3.0);
    }
}