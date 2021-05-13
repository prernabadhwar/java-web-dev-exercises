package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> intArrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        String str = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        String[] str1 = str.split(" ");

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(str1));

        System.out.println(sumOfEven(intArrList));
        wordsOfLength(wordList);
    }
    public static int sumOfEven(ArrayList<Integer> intList) {
        int total = 0;
        for(int number : intList) {
            if(number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }

    public static void wordsOfLength(ArrayList<String> strList) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a word length: ");
        int wordLength = in.nextInt();

        for(String word : strList) {
            if(word.length() == wordLength) {
                System.out.print(word+"\t");
            }
        }
    }


}
