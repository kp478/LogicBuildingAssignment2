import java.util.Scanner;

public class Second_most_frequent_characters {
    public static char findSecondMostFrequent(String str) {
        int[] frequency = new int[256]; // Assuming ASCII characters

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > frequency[maxFrequency]) {
                maxFrequency = i;
            }
        }

        // Find the second most frequent character
        int secondMaxFrequency = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > frequency[secondMaxFrequency] && frequency[i] < frequency[maxFrequency]) {
                secondMaxFrequency = i;
            }
        }

        return (char) secondMaxFrequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line: ");
        String input = sc.nextLine();
        char secondMostFrequentChar = findSecondMostFrequent(input);
        System.out.println("Second most frequent character: " + secondMostFrequentChar);
    }
}