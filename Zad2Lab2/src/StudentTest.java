public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(123, 70, 4);
        Student s2 = new Student("Jan", "Kowalski", 234, 30, 3);
        Student s3 = new Student("Anna", "Nowak", 345, 80, 5);

        System.out.println("Student 2:");
        System.out.println("Imię: " + s2.getFirstName());
        System.out.println("Nazwisko: " + s2.getLastName());
        System.out.println("Numer indeksu: " + s2.getStudentNumber());
        System.out.println("Obecność: " + s2.getAttendance() + "%");
        System.out.println("Ocena z POJ: " + s2.getPojGrade());
    }}