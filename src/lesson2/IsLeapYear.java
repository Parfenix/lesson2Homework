package lesson2;
import java.util.Scanner;

// Написать программу, которая по полученному году определяет, является ли этот он високосным. Год считается високосным, если он делится без остатка на 4.Однако, если год также делится на 100, то этот год не високосный, за исключением годов, делящихся на 400.

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int varIntYear = scanner.nextInt();

        if ((varIntYear % 4 == 0 && varIntYear % 100 != 0) || (varIntYear % 400 == 0)) {
            System.out.println("That is a leap year");
        } else {
            System.out.println("That is not a leap year");
        }

        scanner.close();
    }
}
