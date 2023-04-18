//made by Ankit Kumar Gupta 20/383
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FindRepeatedWords {
    public static void main(String[] args) {
        System.out.println("-------------------Made by Navneet Kumar----------------");
        String fileName = "test.txt";
        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (wordCounts.containsKey(word)) {
                        wordCounts.put(word, wordCounts.get(word) + 1);
                    } else {
                        wordCounts.put(word, 1);
                    }
                }
            }

            // Print repeated words
            System.out.println("Repeated words in file:");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + ": " + entry.getValue() + " Mughe Repeated word mile");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
