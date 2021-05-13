package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says" +
                " at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = str.toCharArray();

        HashMap<Character, Integer> charsCount = new HashMap<>();

        for(char character : charactersInString) {
            int count = 0;
            for (int i = 0; i < charactersInString.length; i++) {
                if(charactersInString[i] == character) {
                    count++;
                }
            }
            charsCount.put(character, count);
        }

         for(Map.Entry<Character, Integer> chars : charsCount.entrySet()) {
            System.out.println(chars.getKey()+":"+chars.getValue());
        }
    }
}
