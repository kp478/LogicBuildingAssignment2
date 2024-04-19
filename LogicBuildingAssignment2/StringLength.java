import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        int length = calculateLength(str);
        System.out.println("Length of the string: " + length);
    }

    public static int calculateLength(String str) {
        if (str.isEmpty()) {
            return 0; // Base case: If the string is empty, its length is 0
        }
        return 1 + calculateLength(str.substring(1)); // Recursive call with the string excluding the first character
    }
}