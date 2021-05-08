package exercises;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] testArray = {1, 1, 2, 3, 5, 8};

        for (int array: testArray) {
            System.out.println(array);
        }

        for (int i = 0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        }

            System.out.println(Arrays.toString(testArray));

        for (int i = 0; i < testArray.length; i++){
            if(testArray[i] % 2 != 0) {
                System.out.println(testArray[i]);
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] stringArray = phrase.split(" ");

        System.out.println(Arrays.toString(stringArray));

        String phrase2 = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentences = phrase2.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}
