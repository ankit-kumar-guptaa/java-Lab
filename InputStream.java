import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        String fileName = "Ankit.txt"; // Example file name
        FileInputStream fis = null; // Declare FileInputStream variable
        
        try {
            fis = new FileInputStream(fileName); // Create a new FileInputStream
            
            int ch;
            System.out.println("Contents of the file:");
            while ((ch = fis.read()) != -1) { // Read file contents character by character
                System.out.print((char) ch); // Convert int to char and print
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close(); // Close the FileInputStream
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
