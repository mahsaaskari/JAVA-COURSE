public class Stringcharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        int spaces = 0, vowels = 0, letters = 0;

        // Iterate through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is a space
            if (ch == ' ') {
                spaces++;
            } else if (Character.isLetter(ch)) {
                // Check if the character is a letter
                letters++;
                // Check if the letter is a vowel (case-insensitive)
                if ("AEIOUaeiou".contains(String.valueOf(ch))) {
                    vowels++;
                }
            }
        }

        // Output the counts
        System.out.println("The text contained vowels: " + vowels + "\n"
                + "consonants: " + (letters - vowels) + "\n"
                + "spaces: " + spaces);
    }
}