import java.util.Scanner;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private String courses = "";
    private int gradeYear;
    private static int courseFee = 600;
    private int tuitionBalance = 0;
    private static int id = 1000;

    // Constuctor prompts user to enter name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();
        System.out.println("1- Freshman\n" + "2- Softmore\n" + "3- Junior\n" + "4- Senior");
        System.out.print("Enter student's grade year: ");
        this.gradeYear = in.nextInt();
        setStudentId();

        System.out.println("Student Name: "+ firstName + " " + lastName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade Year: " + gradeYear);


    }
    // Generate student id
    public void setStudentId(){
        id++;
        studentId = gradeYear + "" + id;
    }
    //Enroll in courses
    public void enrollCourses(){
        do {
            System.out.print("Enter course code to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n" + course ;
                tuitionBalance = tuitionBalance + courseFee;
            }else {break;}
        }while(1 != 0);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Tuition Balance: " + tuitionBalance);
    }

    //Show status
    public String showStatus(){
        return "Name: " + firstName + " " + lastName +
                "\nStudent ID: " + studentId +
                "\nGrade Level: " + gradeYear +
                "\nCourses Enrolled: " + courses +
                "\nBalance: " + tuitionBalance;
    }

    //Pay tuition
    public void makePayment(){
        viewBalance();
        System.out.print("How much do you want to pay $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
}
