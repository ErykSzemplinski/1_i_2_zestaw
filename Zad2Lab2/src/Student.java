public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private int attendance;
    private int pojGrade;

    public Student(int studentNumber, int attendance, int pojGrade) {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.studentNumber = studentNumber;
        this.attendance = attendance;
        this.pojGrade = pojGrade;
        if (attendance < 50) {
            this.pojGrade = 2;
        }
    }

    public Student(String firstName, String lastName, int studentNumber, int attendance, int pojGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.attendance = attendance;
        this.pojGrade = pojGrade;
        if (attendance < 50) {
            this.pojGrade = 2;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
        if (attendance < 50) {
            this.pojGrade = 2;
        }
    }

    public int getPojGrade() {
        return pojGrade;
    }

    public void setPojGrade(int pojGrade) {
        this.pojGrade = pojGrade;
    }
}