import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        System.out.println("----------made by Navneet Kumar---------------");
        String sourceFileName = "Ankit.txt"; // Source file name
        String targetFileName = "test.txt"; // Target file name
        
        FileInputStream fis = null; // Declare FileInputStream variable
        FileOutputStream fos = null; // Declare FileOutputStream variable
        
        try {
            fis = new FileInputStream(sourceFileName); // Create a new FileInputStream for source file
            fos = new FileOutputStream(targetFileName); // Create a new FileOutputStream for target file
            
            int ch;
            System.out.println("Copying file...");
            while ((ch = fis.read()) != -1) { // Read file contents character by character
                fos.write(ch); // Write character to target file
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close(); // Close the FileInputStream
                }
                if (fos != null) {
                    fos.close(); // Close the FileOutputStream
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
