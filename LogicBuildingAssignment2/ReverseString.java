import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        String reversed = reverseString(str);
        System.out.println("Reverse of the string: " + reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char lastChar = str.charAt(str.length() - 1);
        String remainingString = str.substring(0, str.length() - 1);
        return lastChar + reverseString(remainingString);
    }
}