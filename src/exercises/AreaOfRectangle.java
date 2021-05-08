package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the rectangle");
        double length = input.nextDouble();
        System.out.println("Enter width of the rectangle");
        double width = input.nextDouble();
        input.close();

        double area = length * width;
        System.out.println("The are of the rectangle is: " + area);
    }
}
