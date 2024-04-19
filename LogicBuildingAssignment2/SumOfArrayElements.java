import java.util.Scanner;

public class SumOfArrayElements {
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

        int sum = calculateSum(arr, size, 0);
        System.out.println("Sum of the array elements: " + sum);
    }

    public static int calculateSum(int[] arr, int size, int index) {
        if (index == size) {
            return 0;
        }
        return arr[index] + calculateSum(arr, size, index + 1);
    }
}