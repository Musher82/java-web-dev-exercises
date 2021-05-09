package org.launchcode.java.studios.countingcharacters;

import java.util.*;

public class CountingCharactersStudio {

    static void countCharacters(String quote){
        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] charactersInString = quote.toCharArray();

        for (char a : charactersInString){
            if (charCount.containsKey(a)) {
                charCount.put(a, charCount.get(a) + 1);
            }
            else{
                charCount.put(a, 1);
            }
        }
        for (Map.Entry character : charCount.entrySet()){
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }

    public static void main(String[] args) {

        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        countCharacters(quote);
    }
}
