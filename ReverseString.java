import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // System.out.println("------------Made By Ankit KUmar Gupta 20/383---------");
        Scanner sc = new Scanner(System.in);

        // string ko read kra jaa rha hai user se
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reverse the string logic here
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
