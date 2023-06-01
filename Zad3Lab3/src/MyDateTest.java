public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2, 29, 2024);
        MyDate date2 = new MyDate(4, 31, 2022);
        MyDate date3 = new MyDate(13, 1, 2021);

        date1.displayDate();
        date2.displayDate();
        date3.displayDate();

        date1.setMonth(4);
        date1.setDay(31);
        date1.setYear(2022);

        date1.displayDate();
    }
}