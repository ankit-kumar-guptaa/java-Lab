//Q.15
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }

    public static void main(String[] args) {
        System.out.println("===========Code by Ankit Kumar Gupta 20/383==================");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student[] students = new Student[numStudents];

        // Insert student details
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Address: ");
            String address = scanner.nextLine();
            students[i] = new Student(name, age, address);
        }

        // Display student details
        System.out.println("Student details:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + students[i]);
        }

        scanner.close();
    }
}
