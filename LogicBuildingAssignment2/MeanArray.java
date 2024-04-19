import java.util.Scanner;
public class MeanArray {
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

        double mean = calculateMean(arr, size);
        System.out.println("Mean of the array: " + mean);
    }

    public static double calculateMean(int[] arr, int size) {
        return calculateSum(arr, size) / (double)size;
    }

    public static double calculateSum(int[] arr, int size) {
        if (size == 0) {
            return 0; // Base case: If size is 0, return 0
        }
        return arr[size - 1] + calculateSum(arr, size - 1);
    }
}
