public class TestClock {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        System.out.println(clock1);

        Clock clock2 = new Clock(5, 30, 0);
        System.out.println(clock2);

        Clock clock3 = new Clock(86399);
        System.out.println(clock3);

        clock1.tick();
        System.out.println(clock1);

        clock2.tickDown();
        System.out.println(clock2);
    }
}