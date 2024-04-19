import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();
        scanner.close();


        int integerDecimal = (int) decimal;

        String binary = convertToBinary(integerDecimal);
        System.out.println("Binary representation: " + binary);
    }

    public static String convertToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        return convertToBinaryHelper(decimal, "");
    }

    public static String convertToBinaryHelper(int decimal, String binarySoFar) {
        if (decimal == 0) {
            return binarySoFar;
        }
        int remainder = decimal % 2;
        return convertToBinaryHelper(decimal / 2, remainder + binarySoFar);
    }
}