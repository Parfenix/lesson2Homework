package lesson2;
import java.util.Scanner;

// A) Дано целое число. Определить, является ли последняя цифра этого числа – цифрой 3.

public class IsLastDigitThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int varIntNumber = scanner.nextInt();

        if (varIntNumber % 10 == 3) {
            System.out.println("Last digit of the number is three");
        } else {
            System.out.println("Last digit of the number isn't three, last digit is " + (varIntNumber % 3));
        }

        scanner.close();
    }
}
