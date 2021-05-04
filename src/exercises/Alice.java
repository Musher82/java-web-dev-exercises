package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'\n";
        System.out.println("Search for the term Alice: ");
        String search = input.nextLine().toLowerCase();
        if (alice.toLowerCase().contains(search)) {
            System.out.println("true");
        } else
            System.out.println("false");
        //System.out.println(search);
        System.out.println("Search for a term to see where it is in the string:");
        String searchTerm = input.nextLine().toLowerCase();
        String firstWord = alice;
        if (alice.toLowerCase().contains(searchTerm)){
            Integer index = firstWord.indexOf(searchTerm);
            Integer length = searchTerm.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String modifiedSentence = firstWord.replace(searchTerm, "");
            System.out.println(modifiedSentence);
        }
        input.close();
    }
}
