import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        // Ask how many new students are enrolling
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for (int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enrollCourses();
            students[i].makePayment();
        }
        for (int i = 0; i < numOfStudents; i++){
            System.out.println(students[i].showStatus());
        }
    }
}
