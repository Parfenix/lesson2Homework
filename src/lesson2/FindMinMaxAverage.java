package lesson2;
import java.util.Scanner;

// B) Для трех чисел, найти минимальное, максимальное и среднее

public class FindMinMaxAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers separated by spaces: ");
        float varFloatNumber1 = scanner.nextFloat();
        float varFloatNumber2 = scanner.nextFloat();
        float varFloatNumber3 = scanner.nextFloat();

        float varFloatMin = Math.min(varFloatNumber1, Math.min(varFloatNumber2, varFloatNumber3));
        float varFloatMax = Math.max(varFloatNumber1, Math.min(varFloatNumber2, varFloatNumber3));
        float varFloatAverage = (varFloatNumber1 + varFloatNumber2 + varFloatNumber3) / 3.0F;

        System.out.println("Minimum = " + varFloatMin);
        System.out.println("Maximum = " + varFloatMax);
        System.out.println("Average = " + varFloatAverage);

        scanner.close();
    }
}
