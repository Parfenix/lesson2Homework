package lesson2;
import java.util.Scanner;

// Имеется целое число. Это число - сумма денег в рублях. Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").

public class MakeRubleInRightCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of rubles: ");
        int varIntQuantity = scanner.nextInt();
        String varStringLastWord;

        if (varIntQuantity % 10 == 1 && varIntQuantity % 100 != 11) {
            varStringLastWord = "рубль";
        } else if (((varIntQuantity % 10 >= 2 && varIntQuantity % 10 <= 4) && (varIntQuantity % 100 < 10 || varIntQuantity % 100 >= 20))) {
            varStringLastWord = "рубля";
        } else {
            varStringLastWord = "рублей";
        }

        System.out.println(varIntQuantity + " " + varStringLastWord);

        scanner.close();
    }
}
