import java.util.Scanner;

public class MarksPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
System.out.println("------------Made By Navneet Kumar 20/1362---------");
        System.out.print("Enter the marks for subject 1: ");
        int marks1 = sc.nextInt();

        System.out.print("Enter the marks for subject 2: ");
        int marks2 = sc.nextInt();

        System.out.print("Enter the marks for subject 3: ");
        int marks3 = sc.nextInt();

        int totalMarks = marks1 + marks2 + marks3;
        double percentage = (double) totalMarks / 3;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
                                            