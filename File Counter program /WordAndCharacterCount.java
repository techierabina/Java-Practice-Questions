import java.io.*;
import java.util.*;

public class WordAndCharacterCount {
    public static void main(String[] args) {
        // Step 2: Check for command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java WordAndCharacterCount <filename>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        // Step 3: Open and read the file
        try (Scanner scanner = new Scanner(file)) {
            int lineNumber = 1;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim(); // Read and trim spaces

                // Step 4: Process each line for words and characters
                String[] words = line.split("\\s+"); // Split by spaces (handles multiple spaces)
                int wordCount = (line.isEmpty()) ? 0 : words.length; // Handle empty lines
                int charCount = line.replaceAll("\\s+", "").length(); // Remove spaces to count only characters

                // Step 5: Display results
                System.out.println("Line " + lineNumber + " (Words: " + wordCount + ", Characters: " + charCount + "): " + line);
                lineNumber++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}
