import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int sum = calculateSum(arr, size);
        System.out.println("Sum of the array elements: " + sum);
    }

    public static int calculateSum(int[] arr, int size) {
        if (size == 0) {
            return 0; // Base case: If size is 0, return 0
        }
        return arr[size - 1] + calculateSum(arr, size - 1); // Recursive case: Add current element with sum of (size-1) elements
    }
}
