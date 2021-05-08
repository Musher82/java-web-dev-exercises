package exercises;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(21);
        arr.add(33);
        arr.add(42);
        arr.add(54);
        arr.add(65);
        arr.add(2);
        arr.add(7);
        arr.add(11);
        arr.add(16);
        arr.add(10);

        System.out.println(arr);

        System.out.println("The sum of the even numbers is: " + sumEven(arr));

        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("five");
        wordList.add("six");
        wordList.add("farts");
        wordList.add("twelve");
        wordList.add("panic");
        wordList.add("book");
        wordList.add("galaxy");
        wordList.add("pen");
        wordList.add("might");


        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        List<String> phraseList = new ArrayList<>(Arrays.asList(phrase.split("\\.")));

        System.out.println(phraseList);


        System.out.println(fiveLetterWords(wordList, numChars));

    }

    //loop through arrayList and add up all of the even values
    public static int sumEven(ArrayList<Integer> arr){
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static String fiveLetterWords(ArrayList<String> wordList, int numChars){
        ArrayList<String> fiveLetters = new ArrayList<>();
        for (String word : wordList){
            if (word.length() == numChars) {
                fiveLetters.add(word);
            }
        }
        return fiveLetters.toString();
    }

}
