import java.util.Scanner;

public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = calculateSum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }

    public static int calculateSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + calculateSum(n - 1);
    }
}
