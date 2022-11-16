package basics;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        if (number < 8)
            System.out.println("Number is too low");
        else
            System.out.println("Correct!");
    }
}
