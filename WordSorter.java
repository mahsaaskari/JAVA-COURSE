import java.util.Arrays;

public class WordSorter {
    public static void main(String[] args) {
        // The soliloquy text
        String soliloquy = "To be or not to be, that is the question;"
                + "Whether 'tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // Split the text into words
        String[] words = soliloquy.split("[^a-zA-Z']+");

        // Remove empty strings from the array
        String[] cleanedWords = new String[words.length];
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                cleanedWords[count] = word;
                count++;
            }
        }

        // Sort the words using the bubble sort algorithm
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                // Compare and swap words to achieve alphabetical order
                if (cleanedWords[j].compareToIgnoreCase(cleanedWords[j + 1]) > 0) {
                    String temp = cleanedWords[j];
                    cleanedWords[j] = cleanedWords[j + 1];
                    cleanedWords[j + 1] = temp;
                }
            }
        }

        // Print the sorted words
        for (int i = 0; i < count; i++) {
            System.out.println(cleanedWords[i]);
        }
    }
}