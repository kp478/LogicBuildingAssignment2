import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits of the number: " + sum);
    }

    public static int calculateSumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        int digit = number % 10;
        return digit + calculateSumOfDigits(number / 10);
    }
}
