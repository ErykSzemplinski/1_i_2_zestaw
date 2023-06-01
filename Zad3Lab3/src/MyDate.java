public class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        if (isValidDate(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            System.out.println("Invalid date");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidMonth(month)) {
            this.month = month;
        } else {
            System.out.println("Invalid month");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDay(day, this.month, this.year)) {
            this.day = day;
        } else {
            System.out.println("Invalid day");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidYear(year)) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d%n", this.month, this.day, this.year);
    }

    private boolean isValidDate(int month, int day, int year) {
        return isValidMonth(month) && isValidDay(day, month, year) && isValidYear(year);
    }

    private boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private boolean isValidDay(int day, int month, int year) {
        if (day < 1 || day > 31) {
            return false;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }
        return true;
    }

    private boolean isValidYear(int year) {
        return year >= 1990 && year <= 2050;
    }
}