package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        String str = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, 'and what is the use of a book," +
                "' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text");
        String subStr = input.next();
        input.close();

        System.out.println(str.toLowerCase().contains(subStr.toLowerCase()));

        System.out.println("The index of the first occurrence of the word " + subStr + " is " + str.indexOf(subStr) + " having a length of " + subStr.length());

        String str1 = str.replaceAll(subStr, "");
        System.out.println(str1);

        str1 = str.substring(0,str.indexOf(subStr))+str.substring(str.indexOf(subStr) + subStr.length(), str.length());
        System.out.println(str1);

    }
}
