package exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};

        for (int i : someInts) {

            if (i % 2 !=0) {
                System.out.println(i);
            }

        }
        String str = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        String[] str1 = str.split(" ");
        System.out.println(Arrays.toString(str1));

        String [] sentence = str.split("\\.");
        System.out.println(Arrays.toString(sentence));
    }

}


