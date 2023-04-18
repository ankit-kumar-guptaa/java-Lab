//Made by Ankit kumar Gupta 20/383
import java.util.Scanner;

public class ValidateStudentRecord {
    public static void main(String[] args) {
        // System.out.println("------------Made By Ankit KUmar Gupta 20/383---------");
        Scanner sc = new Scanner(System.in);

        // Read in student details from user
        System.out.print("Enter the student name: ");
        String name = sc.nextLine();

        System.out.print("Enter the student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter the student's age: ");
        int age = sc.nextInt();

        System.out.print("Enter the student's GPA: ");
        double gpa = sc.nextDouble();

        // Validate the student record
        if (name.isEmpty() || id.isEmpty() || age < 18 || age > 30 || gpa < 0 || gpa > 4.0) {
            System.out.println("Invalid student record");
        } else {
            System.out.println("Valid student record");
        }

        sc.close();
    }
}
